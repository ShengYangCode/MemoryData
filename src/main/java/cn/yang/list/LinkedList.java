package cn.yang.list;

import cn.yang.common.List;

/**
 * LinkedList
 *
 * @author yang
 * @date 2022/4/4
 */
public class LinkedList<E> implements List<E> {


    // 节点
    private static class Node<E> {

        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public void add(E element) {

    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int idx) {
        return null;
    }

    @Override
    public E set(int idx, E element) {
        return null;
    }

    @Override
    public E remove(int idx) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public int indexOf(E element) {
        return 0;
    }
}
