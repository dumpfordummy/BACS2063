package ADT.Interface;

import java.util.Iterator;

/**
 *
 * @author Hoo Chun Yuan
 */

public interface SetUniqueListInterface<T> {

    boolean add(T element);

    boolean add(int index, T element);

    boolean remove(T element);

    T remove(int index);

    int size();

    boolean isEmpty();

    void clear();

    T get(int index);

    T replace(int index, T element);

    boolean contains(T element);

    int indexOf(T element);

    boolean equals(SetUniqueListInterface<T> list);

    Iterator<T> iterator();
}
