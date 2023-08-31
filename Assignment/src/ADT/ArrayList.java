/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

/**
 *
 * @author CY
 */
public class ArrayList<T> implements ListInterface<T> {

    private static final int DEFAULT_CAPACITY = 10;

    // -8 to prevent some jvm throws oom even though there is enough heap memory;
    private static final int ARRAY_MAXLENGTH = Integer.MAX_VALUE - 8;

    private T[] items;

    private int size = 0;

    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Capacity for ArrayList cannot be negative");
        } else {
            items = (T[]) new Object[initialCapacity];
        }
    }

    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[size];

        for (int i = 0; i < size; i++) {
            result[i] = items[i];
        }

        return result;
    }

    private void grow() {
        int newCapacity = size == 0 ? DEFAULT_CAPACITY : size + (size / 2);

        if (newCapacity > ARRAY_MAXLENGTH) {
            newCapacity = ARRAY_MAXLENGTH;
        }

        T[] tempArr = (T[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            tempArr[i] = items[i];
        }

        items = tempArr;
    }

    @Override
    public void add(T element) {
        if (size >= items.length) {
            grow();
        }

        items[size] = element;
        size++;
    }

    private void rightShift(int startingIndex) {
        for (int i = size - 1; i >= startingIndex; i--) {
            items[i + 1] = items[i];
        }

        items[startingIndex] = null;
    }

    @Override
    public void add(int index, T element) {
        indexCheck(index);

        if (size == items.length) {
            grow();
        }

        if (index < size) {
            rightShift(index);
        }

        items[index] = element;
        size++;
    }

    @Override
    public boolean remove(T element) {
        int index = indexOf(element);

        if (index >= 0) {
            remove(index);
            return true;
        }

        return false;
    }

    private void leftShift(int startingIndex) {
        for (int i = startingIndex; i < size; i++) {
            items[i - 1] = items[i];
        }
    }

    @Override
    public T remove(int index) {
        indexCheck(index);
        T result = null;
        result = items[index];
        if (index != size - 1) { // if not remove last element
            leftShift(index + 1);
        }
        items[size - 1] = null;
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
        for (int i = 0; i < size; i++) {
            items[i] = null;
        }
        size = 0;
    }

    @Override
    public T get(int index) {
        indexCheck(index);
        return items[index];
    }

    @Override
    public T replace(int index, T element) {
        indexCheck(index);

        T result = null;

        if (contains(element)) {
            return result;
        }

        result = items[index];
        items[index] = element;
        return result;
    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) >= 0;
    }

    @Override
    public int indexOf(T element) {
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (items[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(items[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean equals(ListInterface<T> arrayList) {

        if (arrayList == this) {
            return true;
        }

        if (!(arrayList instanceof ArrayList)) {
            return false;
        }

        if (arrayList.size() != size) {
            return false;
        }

        boolean isEquals = true;

        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).equals(items[i])) {
                isEquals = false;
                break;
            }
        }
        return isEquals;
    }

    private void indexCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is invalid");
        }
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        if (action == null) {
            throw new NullPointerException();
        }

        for (int i = 0; i < size; i++) {
            action.accept(items[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                result.append("null");
            } else {
                result.append(items[i].toString());
            }

            if (i != items.length - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }

    private void subListIndexCheck(int fromIndex, int toIndex) {
        if (fromIndex < 0) {
            throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
        }
        if (toIndex >= size) {
            throw new IndexOutOfBoundsException("toIndex = " + toIndex);
        }
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex(" + fromIndex
                    + ") > toIndex(" + toIndex + ")");
        }
    }

    @Override
    public ListInterface<T> subList(int fromIndex, int toIndex) {
        subListIndexCheck(fromIndex, toIndex);

        ArrayList<T> result = new ArrayList<>();

        for (int i = fromIndex; i <= toIndex; i++) {
            result.add(items[i]);
        }

        return result;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    @Override
    public ListIterator<T> Listiterator() {
        return new ArrayListIterator();
    }

    private class ArrayIterator implements Iterator<T> {

        int nextIndex;
        int previousReturned = -1;

        @Override
        public boolean hasNext() {
            return nextIndex >= 0 && nextIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException();
            }

            previousReturned = nextIndex;
            T result = items[previousReturned];
            nextIndex++;
            return result;
        }

        @Override
        public void remove() {
            if (previousReturned == -1) {
                throw new IllegalStateException();
            }

            ArrayList.this.remove(previousReturned);
            nextIndex--;
            previousReturned = -1;
        }
    }

    private class ArrayListIterator extends ArrayIterator implements ListIterator<T> {

        @Override
        public boolean hasPrevious() {
            return previousReturned > 0;
        }

        @Override
        public T previous() {
            if (!hasPrevious()) {
                throw new IllegalStateException();
            }

            nextIndex--;
            T result = items[nextIndex];
            previousReturned = nextIndex;
            return result;
        }

        @Override
        public int nextIndex() {
            return nextIndex;
        }

        @Override
        public int previousIndex() {
            return nextIndex - 1;
        }

        @Override
        public void set(T e) {
            if (previousReturned < 0) {
                throw new IllegalStateException();
            }

            ArrayList.this.replace(previousReturned, e);
        }

        @Override
        public void add(T e) {
            ArrayList.this.add(nextIndex, e);
            nextIndex++;
            previousReturned = -1;
        }

    }

}
