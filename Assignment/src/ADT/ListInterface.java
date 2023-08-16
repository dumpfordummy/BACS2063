/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ADT;

/**
 *
 * @author CY
 */
public interface ListInterface<T> {

    boolean add(T element);

    void add(int index, T element);

    boolean remove(Object element);
    
    T remove(int index);

    int size();
    
    boolean isEmpty();
    
    void clear();
    
    T get(int index);
    
    T replace(int index, T element);
    
    boolean contains(Object element);
}
