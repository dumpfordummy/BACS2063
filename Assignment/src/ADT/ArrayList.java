/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADT;

import java.util.Iterator;
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
    
    public boolean equals(ArrayList<T> arrayList) {
        
        if(arrayList == this) {
            return true;
        }
        
        if(arrayList.size != size){
            return false;
        }
        
        boolean isEquals = true;
                    
        for(int i = 0; i < size; i++) {
            if(!arrayList.get(i).equals(items[i])) {
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
        if(action == null) {
            throw new NullPointerException();
        }
        
        for(int i = 0; i < size; i++) {
            action.accept(items[i]);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < size; i++) {
            result.append(items[i].toString());
        }
        return result.toString();
    }
    
    public ArrayListIterator getIterator() {
        return new ArrayListIterator();
    }
    
    private class ArrayListIterator implements Iterator<T> {

        private int nextIndex;
        private boolean canRemove = false;
        
        @Override
        public boolean hasNext() {
            return nextIndex != size;
        }

        @Override
        public T next() {
            if(nextIndex >= size) {
                throw new IllegalStateException();
            }
            
            T result = items[nextIndex];
            nextIndex++;
            canRemove = true;
            return result;
        }

        @Override
        public void remove() {
            if(!canRemove) {
                throw new IllegalStateException();
            }
            
            ArrayList.this.remove(nextIndex - 1);
            nextIndex--;
            canRemove = false;
        }
    }
    
    
}
