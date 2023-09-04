/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT.Impl;

import ADT.Interface.SetUniqueListInterface;
import java.util.Iterator;

/**
 *
 * @author Wai Loc
 */
public class LinkedSetUniqueList<T> implements SetUniqueListInterface<T> {

    private Node head;
    private int numberOfElements;

    //add at the end of linkedlist
    @Override
    public boolean add(T element) {
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }

        numberOfElements++;
        return true;
    }

    @Override
    public boolean add(int index, T element) {
        Node newNode = new Node(element);
        Node currentNode = head;
        Node prevNode = head;
        int count = 0;
        boolean result = false;

        if (head == null) {
            head = newNode;
            result = true;
        } else {
            while (currentNode.next != null) {
                count++;
                if (count == index) {
                    newNode.next = currentNode;
                    prevNode.next = newNode;
                    result = true;
                    break;
                } else {
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                }
            }
        }

        numberOfElements++;
        return result;
    }

    @Override
    public boolean remove(T element) {
        boolean result = false;
        Node currentNode = head;
        Node prevNode = head;

        if (currentNode == null) {
            return result;
        }

        while (currentNode != null) {
            if (currentNode.data.equals(element)) {
                prevNode.next = currentNode.next;
                result = true;
                break;
            } else {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
        }

        numberOfElements--;
        return result;
    }

    @Override
    public T remove(int index) {
        Node currentNode = head;
        Node prevNode = head;
        int count = 0;
        T result = null;

        if (index <= 0) {
            throw new IndexOutOfBoundsException("Location given is invalid!");
        } else {
            while (currentNode != null) {
                count++;
                if (count == index) {
                    result = currentNode.data;
                    prevNode.next = currentNode.next;
                    break;
                } else {
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                }
            }
        }

        numberOfElements--;
        return result;
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public void clear() {
        head = null;
        numberOfElements = 0;
    }

    @Override
    public T get(int index) {
        Node currentNode = head;
        int count = 0;
        T result = null;

        if (index <= 0) {
            throw new IndexOutOfBoundsException("Location given is invalid!");
        } else {
            while (currentNode != null) {
                count++;
                if (count == index) {
                    result = currentNode.data;
                    break;
                } else {
                    currentNode = currentNode.next;
                }
            }
        }

        return result;
    }

    @Override
    public T replace(int index, T element) {
        Node currentNode = head;
        int count = 0;
        T result = null;

        if (index <= 0) {
            throw new IndexOutOfBoundsException("Location given is invalid!");
        } else {
            while (currentNode != null) {
                count++;
                if (count == index) {
                    result = currentNode.data;
                    currentNode.data = element;
                    break;
                } else {
                    currentNode = currentNode.next;
                }
            }
        }

        return result;
    }

    @Override
    public boolean contains(T element) {
        Node currentNode = head;
        boolean found = false;

        while (!found && (currentNode != null)) {
            if (currentNode.data.equals(element)) {
                found = true;
                break;
            } else {
                currentNode = currentNode.next;
            }
        }

        return found;
    }

    @Override
    public int indexOf(T element) {
        Node currentNode = head;
        int count = 0;

        if (element == null) {
            throw new NullPointerException("Object passed in is null!");
        } else {
            while (currentNode != null) {
                count++;
                if (currentNode.data.equals(element)) {
                    break;
                } else {
                    currentNode = currentNode.next;
                }
            }
        }

        return count;
    }

    @Override
    public boolean equals(SetUniqueListInterface<T> linkedList) {
        if (linkedList == this) {
            return true;
        }

        if (!(linkedList instanceof LinkedSetUniqueList)) {
            return false;
        }

        if (linkedList.size() != numberOfElements) {
            return false;
        }

        boolean isEquals = true;

        for (int i = 0; i < numberOfElements; i++) {
            if (!linkedList.get(i).equals(this.get(i))) {
                isEquals = false;
                break;
            }
        }
        
        return isEquals;
    }

    @Override
    public String toString() {
        String outputStr = "";
        Node currentNode = head;
        while (currentNode != null) {
            outputStr += currentNode.data + "\n";
            currentNode = currentNode.next;
        }
        return outputStr;
    }

    @Override
    public Iterator<T> iterator() {
        return new SetListIterator();
    }

    private class SetListIterator implements Iterator<T> {

        private int count;

        public SetListIterator() {
            count = 0;
        }

        @Override
        public boolean hasNext() {
            return count < numberOfElements;
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

    private class Node {

        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node nextNode) {
            this.data = data;
            this.next = nextNode;
        }

    }
}
