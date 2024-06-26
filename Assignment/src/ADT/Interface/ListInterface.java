/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ADT.Interface;

import java.util.Iterator;

/**
 *
 * @author CY
 */
public interface ListInterface<T> extends Iterable<T> {
    
    void add(T element);

    void add(int index, T element);

    boolean remove(T element);

    T remove(int index);

    int size();

    boolean isEmpty();

    void clear();

    T get(int index);

    T replace(int index, T element);

    boolean contains(T element);

    int indexOf(T element);

    boolean equals(ListInterface<T> list);

    Iterator<T> iterator();
}
