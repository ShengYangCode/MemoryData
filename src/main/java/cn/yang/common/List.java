package cn.yang.common;

/**
 * List
 *
 * @author yang
 * @date 2022/4/4
 */
public interface List<E> {

    /**
     * 没有查找到返回的数字
     */
     int ELEMENT_NOT_FOUND = -1;

    int size();

    boolean isEmpty();

    boolean contains(E element);

    void add(E element);

    void clear();

    E get(int idx);

    E set(int idx, E element);

    E remove(int idx);

    void add(int index, E element);

    int indexOf(E element);
}
