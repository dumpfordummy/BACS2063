/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ADT;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author CY
 */
public interface SetUniqueQueueInterface<T> {

    T[] toArray();

    boolean enqueue(T element);

    T peek();

    T dequeue(T element);

    T poll();

    int size();

    boolean isEmpty();

    void clear();

    boolean contains(T element);

    boolean equals(SetUniqueQueueInterface<T> arrayList);

    void forEach(Consumer<? super T> action);

    Iterator<T> iterator();

}
