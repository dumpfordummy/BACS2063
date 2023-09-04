/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ADT.Interface;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;

/**
 *
 * @author CY
 */

/**
 * An ordered collection (also known as a sequence) that contains no
 * duplicated elements. The user of this interface has precise control
 * over where in the list each element is inserted. The user can access
 * elements by their integer index (position in the list), and search for elements in the list.
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
