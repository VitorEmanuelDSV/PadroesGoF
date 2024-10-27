package main;
import java.util.ArrayList;
import java.util.Iterator;

public interface ListIF<E> extends Iterator {

    boolean add(E e);

    void clear();

    boolean contains(Object o);

    boolean equals(Object o);

    E get(int index);

    boolean isEmpty();

    Iterator<E> iterator();

    boolean remove(Object o);

    int size();

    Object[] toArray();

    <T> T[] toArray(T[] a);
}
