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
public class ArraySetUniqueList<T> implements SetUniqueListInterface<T> {

    private static final int DEFAULT_CAPACITY = 10;

    // -8 to prevent some jvm throws oom even though there is enough heap memory;
    private static final int ARRAY_MAXLENGTH = Integer.MAX_VALUE - 8;

    private T[] items;

    private int size = 0;

    public ArraySetUniqueList() {
        this(DEFAULT_CAPACITY);
    }

    public ArraySetUniqueList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Capacity for Array List cannot be negative");
        } else {
            items = (T[]) new Object[initialCapacity];
        }
    }

    public T[] toArray() {
        T[] result = (T[]) new Object[size];

        for (int i = 0; i < size; i++) {
            result[i] = items[i];
        }

        return result;
    }

    private void grow() {
        int newCapacity = size == 0 ? DEFAULT_CAPACITY : size * 2;

        if (newCapacity > ARRAY_MAXLENGTH) {
            newCapacity = ARRAY_MAXLENGTH;
        }

        T[] tempArr = (T[]) new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            tempArr[i] = items[i];
        }

        items = tempArr;
    }

    private void addWithResize(T element) {
        grow();
        items[size] = element;
        size++;
    }

    @Override
    public boolean add(T element) {
        if (indexOf(element) >= 0) {
            return false;
        }

        if (size < items.length) {
            items[size] = element;
            size++;
        } else {
            addWithResize(element);
        }
        return true;
    }

    private void rightShift(int startingIndex) {
        for (int i = size - 1; i >= startingIndex; i--) {
            items[i + 1] = items[i];
        }

        items[startingIndex] = null;
    }

    @Override
    public boolean add(int index, T element) {
        indexCheck(index);

        if (indexOf(element) >= 0) {
            return false;
        }

        if (size == items.length) {
            grow();
        }

        if (index < size) {
            rightShift(index);
        }

        items[index] = element;
        size++;
        return true;
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

        items[size - 1] = null;
    }

    @Override
    public T remove(int index) {
        T result = null;
        indexCheck(index);
        result = items[index];
        leftShift(index + 1);
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
        T result = items[index];
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

    public boolean equals(ArraySetUniqueList<T> arrayList) {

        if (arrayList == this) {
            return true;
        }

        if (arrayList.size != size) {
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

    @Override
    public SetUniqueListInterface<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public SetListIterator iterator() {
        return new SetListIterator();
    }

    public SetListListIterator Listiterator() {
        return new SetListListIterator();
    }

    private class SetListIterator implements Iterator<T> {

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

            ArraySetUniqueList.this.remove(previousReturned);
            nextIndex--;
            previousReturned = -1;
        }
    }

    private class SetListListIterator extends SetListIterator implements ListIterator<T> {

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
            if(previousReturned < 0) {
                throw new IllegalStateException();
            }
            
            ArraySetUniqueList.this.replace(previousReturned, e);
        }

        @Override
        public void add(T e) {
            ArraySetUniqueList.this.add(nextIndex, e);
            nextIndex++;
            previousReturned = -1;
        }
    }
}
