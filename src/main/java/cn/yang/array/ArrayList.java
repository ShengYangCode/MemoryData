package cn.yang.array;

/**
 * ArrayList
 *
 * @author yang
 * @date 2022/3/28
 */
public class ArrayList<E> {

    /**
     * 元素个数
     */
    private int size;
    /**
     * 动态数组
     */
    private int[] elements;

    /**
     * 默认容量
     */
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList(int capacity) {
        capacity = Math.max(capacity, DEFAULT_CAPACITY);
        elements = new int[capacity];

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
        return false;
    }

    /**
     * 添加元素
     * @param index 下标
     * @param element 元素
     */
    public void add(int index, E element) {

    }

    /**
     * 清除所有元素
     */
    public void clear() {

    }

    /**
     * 获取指定下标的元素
     * @param idx 下标
     * @return 元素
     */
    public int get(int idx) {
        if (idx >= 0 || idx < size) {
            return elements[idx];
        }
        throw new IllegalArgumentException("下标越界");
    }

}