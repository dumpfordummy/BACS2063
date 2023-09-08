/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT.Impl;

import ADT.Interface.ListInterface;
import java.util.Iterator;

/**
 *
 * @author Hoh Jenn Wen
 */
public class LinkedList<T> implements ListInterface<T> {

    private Node<T> first;

    private Node<T> last;

    private int size = 0;

    public LinkedList() {
    }

    @Override
    public void add(T element) {
        Node<T> newNode = new Node(element, null);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }

        last = newNode;
        size++;
    }

    public void addFirst(T element) {
        Node<T> newNode = new Node(element, first);
        if (first == null) {
            last = newNode;
        }

        first = newNode;
        size++;
    }

    @Override
    public void add(int index, T element) {
        insertionIndexCheck(index);

        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            add(element);
        } else {
            Node<T> prevNode = nodeAt(index - 1);
            Node<T> newNode = new Node(element, prevNode.next);

            prevNode.next = newNode;
            size++;
        }
    }

    public T removeFirst() {
        if (first == null) {
            throw new IllegalStateException();
        }
        Node<T> f = first;
        T result = first.data;
        first = first.next;
        f.data = null;
        f.next = null;
        size--;
        return result;
    }

    public T removeLast() {
        if (first == null) {
            throw new IllegalStateException();
        }

        if (size == 1) {
            return removeFirst();
        }

        T result = last.data;

        Node<T> prevNode = nodeAt(size - 2);
        prevNode.next = null;
        last.data = null;
        last = prevNode;
        size--;
        return result;
    }

    @Override
    public boolean remove(T element) {
        if (first.data.equals(element)) {
            removeFirst();
            return true;
        } else if (last.data.equals(element)) {
            removeLast();
            return true;
        }

        Node<T> prevNode = first;

        for (Node<T> x = first.next; x != last; prevNode = x, x = x.next) {

            if (x.data.equals(element)) {
                prevNode.next = x.next;
                x.data = null;
                x.next = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public T remove(int index) {
        existingIndexCheck(index);

        Node<T> prevNode = nodeAt(index - 1);
        Node<T> node = nodeAt(index);
        T result = node.data;

        prevNode.next = node.next;
        node.data = null;
        node.next = null;
        size--;
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        existingIndexCheck(index);

        return nodeAt(index).data;
    }

    private Node<T> nodeAt(int index) {
        Node<T> currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    @Override
    public T replace(int index, T element) {
        existingIndexCheck(index);
        Node<T> node = nodeAt(index);
        T result = node.data;
        node.data = element;
        return result;
    }

    private void insertionIndexCheck(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is invalid");
        }
    }

    private void existingIndexCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is invalid");
        }
    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    @Override
    public int indexOf(T element) {
        int i = 0;
        if (element == null) {
            for (Node<T> x = first; x != null; x = x.next) {
                if (x.data == null) {
                    return i;
                }
                i++;
            }
        } else {
            for (Node<T> x = first; x != null; x = x.next) {
                if (element.equals(x.data)) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override
    public boolean equals(ListInterface<T> list) {
        if (list == this) {
            return true;
        }

        if (!(list instanceof LinkedList)) {
            return false;
        }
        
        if(list.size() != size){
            return false;
        }

        boolean isEquals = true;

        for (int i = 0; i < size; i++) {
            if (!list.get(i).equals(this.get(i))) {
                isEquals = false;
                break;
            }
        }

        return isEquals;
    }

    @Override
    public String toString() {
        String outputStr = "";
        Node currentNode = first;
        while (currentNode != null) {
            outputStr += currentNode.data;
            outputStr += currentNode.next == null ? "" : ",";
            currentNode = currentNode.next;
        }
        return outputStr;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {

        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < size;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return (T) get(count++);
            } else {
                return null;
            }
        }
    }

    private class Node<T> {

        Node next;
        T data;

        public Node() {
            this.data = null;
            this.next = null;
        }

        public Node(T item) {
            this.data = item;
            this.next = null;
        }

        public Node(T item, Node next) {
            this.data = item;
            this.next = next;
        }
    }
}
