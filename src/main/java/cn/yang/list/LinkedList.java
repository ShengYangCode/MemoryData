package cn.yang.list;

import cn.yang.common.AbstractList;
import cn.yang.common.List;

/**
 * LinkedList
 *
 * @author yang
 * @date 2022/4/4
 */
public class LinkedList<E> extends AbstractList<E> {

    private Node<E> first;
    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
    }

    @Override
    public E get(int idx) {
        return getNode(idx).element;
    }

    @Override
    public E set(int idx, E element) {
        E oldElement = getNode(idx).element;
        getNode(idx).element = element;
        return oldElement;
    }

    @Override
    public E remove(int idx) {

        Node<E> node = getNode(idx);
        if (idx == 0) {
            first = first.next;
        } else {
            Node<E> node1 = getNode(idx - 1);
            node1.next = node1.next.next;

        }
        size--;
        return node.element;
    }

    @Override
    public void add(int index, E element) {

        if (index == 0) { // 第一个元素

             first =  new Node<>(element,first);
        } else {
            Node<E> node = getNode(index - 1);
            node.next = new Node<>(element,node.next);
        }
        size++;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    /**
     * 获取idx 位置上的元素
     * @param idx 索引
     * @return
     */
    private Node<E> getNode(int idx) {
        checkIndex(idx);
        Node<E> node = first;
        while (idx-- > 0) {
            node = node.next;
        }
        return node;
    }

    // 节点
    private static class Node<E> {

        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

}
