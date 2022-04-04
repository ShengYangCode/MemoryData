package cn.yang.array;

import cn.yang.common.AbstractList;

/**
 * ArrayList
 *
 * @author yang
 * @date 2022/3/28
 */
@SuppressWarnings("unchecked")
public class ArrayList<E> extends AbstractList<E> {



    /**
     * 动态数组
     */
    private E[] elements;

    /**
     * 默认容量
     */
    private static final int DEFAULT_CAPACITY = 10;



    public ArrayList(int capacity) {
        capacity = Math.max(capacity, DEFAULT_CAPACITY);
        elements = (E[]) new Object[capacity];

    }

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * 返回元素个数
     * @return 元素个数
     */
    public int size() {
        return size;
    }



    /**
     * 添加元素
     * @param index 下标
     * @param element 元素
     */
    public void add(int index, E element) {
        checkAddIndex(index);

        ensueCapacity(size + 1);  // 至少有size + 1 个容量

        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }
    /**
     *  扩容方法
     */
    private void ensueCapacity(int capacity) {
        int oldCapacity = elements.length;
        if(oldCapacity >= capacity) return; // 容量够

        int newCapacity = oldCapacity + (oldCapacity >> 1); // 1.5 倍
        E [] newElements = (E[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }

        elements = newElements;
    }

    /**
     * 清除所有元素
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    /**
     * 获取指定下标的元素
     * @param idx 下标
     * @return 元素
     */
    public E get(int idx) {
        checkIndex(idx);

        return elements[idx];

    }

    /**
     * 设置idx 位子上的元素
     * @param idx 下标
     * @param element 元素
     * @return 原来的元素
     */
    public E set(int idx, E element) {
        checkIndex(idx);
        E oldElement = elements[idx];
        elements[idx] = element;
        return oldElement;
    }

    /**
     * remove idx 位置上的元素
     * @param idx 下标
     * @return remove掉的元素
     */
    public E remove(int idx) {
        checkIndex(idx);
        E old = elements[idx];
        for (int i = idx + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        elements[--size] = null;
        return old;
    }

    /**
     * 删除指定元素
     * @param element 元素
     */
    public void remove(E element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                remove(i);
            }
        }
    }

    /**
     * 查看element 的下标
     * @param element 元素
     * @return -1 不存在
     */
    public int indexOf(E element) {

        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ArrayList{ ");
        for (int i = 0; i < size; i++) {
            if (i != size -1) sb.append(elements[i]).append(",");

            else sb.append(elements[i]).append(" }") ;
        }
        return sb.toString();
    }
}