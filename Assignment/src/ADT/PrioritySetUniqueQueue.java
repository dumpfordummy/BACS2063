/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;

import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 *
 * @author CY
 */
public class PrioritySetUniqueQueue<T> implements SetUniqueQueueInterface<T> {

    private static final int DEFAULT_CAPACITY = 10;

    // -8 to prevent some jvm throws oom even though there is enough heap memory;
    private static final int ARRAY_MAXLENGTH = Integer.MAX_VALUE - 8;

    private T[] items;

    private int size = 0;

    private final Comparator<? super T> comparator;

    public PrioritySetUniqueQueue() {
        this(DEFAULT_CAPACITY, null);
    }

    public PrioritySetUniqueQueue(int initialCapacity) {
        this(initialCapacity, null);
    }

    public PrioritySetUniqueQueue(Comparator<? super T> comparator) {
        this(DEFAULT_CAPACITY, comparator);
    }

    public PrioritySetUniqueQueue(int initialCapacity, Comparator<? super T> comparator) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Capacity for PrioritySetUniqueQueue cannot be less than 1");
        } else {
            items = (T[]) new Object[initialCapacity];
            this.comparator = comparator;
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
    public boolean enqueue(T element) {
        if (element == null) {
            throw new NullPointerException();
        }

        if (contains(element)) {
            return false;
        }

        if (size >= items.length) {
            grow();
        }

        addElementByPriority(element);
        size++;
        return true;
    }

    private void addElementByPriority(T element) {
        int index;

        if (comparator != null) {
            index = findInsertionPoint(element, (a, b) -> comparator.compare(a, b));
        } else {
            index = findInsertionPoint(element, (a, b) -> ((Comparable<T>) a).compareTo(b));
        }

        rightShift(index);

        items[index] = element;
        size++;
    }

    private void rightShift(int startingIndex) {
        for (int i = size - 1; i >= startingIndex; i--) {
            items[i + 1] = items[i];
        }

        items[startingIndex] = null;
    }

    private int findInsertionPoint(T element, BiFunction<T, T, Integer> compareFunction) {
        int frontIndex = 0;
        int backIndex = items.length - 1;
        int midIndex;
        int insertionIndex = -1;
        int comparisonResult = 0;

        while (frontIndex <= backIndex) {
            midIndex = frontIndex + (backIndex - frontIndex) / 2;
            comparisonResult = compareFunction.apply(element, items[midIndex]);

            if (comparisonResult == 0) {
                insertionIndex = midIndex;
                frontIndex = midIndex + 1;
            } else if (comparisonResult < 0) {
                frontIndex = midIndex + 1;
            } else {
                backIndex = midIndex - 1;
            }
        }

        if (insertionIndex != -1) {
            while (insertionIndex <= items.length && compareFunction.apply(element, items[insertionIndex]) == 0) {
                insertionIndex++;
            }
        } else {
            insertionIndex = frontIndex;
        }

        return insertionIndex;
    }

    @Override
    public T peek() {
        if (size == 0) {
            throw new IllegalStateException();
        }

        return items[0];
    }

    private void leftShift(int startingIndex) {
        for (int i = startingIndex; i < size; i++) {
            items[i - 1] = items[i];
        }
    }

    @Override
    public T dequeue(T element) {
        int index = indexOf(element);
        if(index < 0) {
            throw new IllegalArgumentException();
        }
        T result = items[index];
     
        if(index != size - 1) {
            leftShift(index);
        }
        
        items[size - 1] = null;
        size--;
        return result;
    }

    @Override
    public T poll() {
        if (size == 0) {
            throw new IllegalStateException();
        }

        T result = items[0];
        leftShift(0);
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

    private int indexOf(T element) {
        if (element != null) {
            for (int i = 0; i < size; i++) {
                if (element.equals(items[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) >= 0;
    }

    @Override
    public boolean equals(SetUniqueQueueInterface<T> queue) {
        if (queue == this) {
            return true;
        }

        if (!(queue instanceof PrioritySetUniqueQueue)) {
            return false;
        }

        if (queue.size() != size) {
            return false;
        }

        boolean isEquals = true;
        PrioritySetUniqueQueue<T> q = (PrioritySetUniqueQueue<T>) queue;

        for (int i = 0; i < size; i++) {
            if (!q.items[i].equals(items[i])) {
                isEquals = false;
                break;
            }
        }
        return isEquals;
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
    public Iterator<T> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<T> {

        @Override
        public boolean hasNext() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public T next() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

}
