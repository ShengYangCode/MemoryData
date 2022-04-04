package cn.yang.common;

/**
 * abstractList
 *
 * @author yang
 * @date 2022/4/4
 */
public abstract class AbstractList<E> implements List<E> {

    /**
     * 元素个数
     */
    protected int size;

    protected void checkIndex(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IllegalArgumentException("下标越界");
        }

    }

    protected void checkAddIndex(int idx) {
        if (idx < 0 || idx > size) {
            throw new IllegalArgumentException("下标越界");
        }

    }


    /**
     * 数组是否为空
     * @return boolean
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 是否包含元素
     * @param element
     * @return
     */
    public boolean contains(E element) {
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    /**
     * 添加元素到数组最后位置
     * @param element 要添加的元素
     */
    public void add(E element) {
        add(size, element);
    }
}
