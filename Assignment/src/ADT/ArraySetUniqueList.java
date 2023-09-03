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
public class ArraySetUniqueList<T> implements SetUniqueListInterface<T>, Iterable<T> {

    private static final int DEFAULT_CAPACITY = 10;

    // -8 to prevent some jvm throws oom even though there is enough heap memory;
    private static final int ARRAY_MAXLENGTH = Integer.MAX_VALUE - 8;

    private Object[] items;

    private int size = 0;

    public ArraySetUniqueList() {
        this(DEFAULT_CAPACITY);
    }

    public ArraySetUniqueList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Capacity for ArraySetUniqueList cannot be negative");
        } else {
            items = (T[]) new Object[initialCapacity];
        }
    }

    public Object[] toArray() {
        Object[] result = new Object[size];

        for (int i = 0; i < size; i++) {
            result[i] = items[i];
        }

        return result;
    }
    
    public <E> E[] toArray(E[] a) {
    if (a.length < size) {
        E[] newArray = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = (E) items[i];
        }
        return newArray;
    }
    for (int i = 0; i < size; i++) {
        a[i] = (E) items[i];
    }
    if (a.length > size) {
        a[size] = null;
    }
    return a;
}

    
    private void grow() {
        int newCapacity = size == 0 ? DEFAULT_CAPACITY : size + (size / 2);

        if (newCapacity > ARRAY_MAXLENGTH) {
            newCapacity = ARRAY_MAXLENGTH;
        }

        Object[] tempArr =  new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            tempArr[i] = items[i];
        }

        items = tempArr;
    }

    @Override
    public boolean add(T element) {
        return add(size, element);
    }

    private void rightShift(int startingIndex) {
        for (int i = size - 1; i >= startingIndex; i--) {
            items[i + 1] = items[i];
        }

        items[startingIndex] = null;
    }

    @Override
    public boolean add(int index, T element) {
        insertionIndexCheck(index);

        if (contains(element)) {
            return false;
        }

        if (size >= items.length) {
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
    }

    @Override
    public T remove(int index) {
        T result = null;
        existingIndexCheck(index);
        result = (T) items[index];
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
        existingIndexCheck(index);
        return (T)items[index];
    }

    @Override
    public T replace(int index, T element) {
        existingIndexCheck(index);

        T result = null;

        if (contains(element)) {
            return result;
        }

        result = (T)items[index];
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
    public boolean equals(SetUniqueListInterface<T> arrayList) {

        if (arrayList == this) {
            return true;
        }

        if (!(arrayList instanceof ArraySetUniqueList)) {
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

    public void forEach(Consumer<? super T> action) {
        if (action == null) {
            throw new NullPointerException();
        }

        for (int i = 0; i < size; i++) {
            action.accept((T)items[i]);
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

    public SetUniqueListInterface<T> subList(int fromIndex, int toIndex) {
        subListIndexCheck(fromIndex, toIndex);

        ArraySetUniqueList<T> result = new ArraySetUniqueList<>();

        for (int i = fromIndex; i <= toIndex; i++) {
            result.add((T)items[i]);
        }

        return result;
    }

    @Override
    public Iterator<T> iterator() {
        return new SetListIterator();
    }

    public ListIterator<T> Listiterator() {
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
            T result = (T)items[previousReturned];
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
            T result = (T)items[nextIndex];
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
