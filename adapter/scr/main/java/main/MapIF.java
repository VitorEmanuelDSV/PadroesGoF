package main;

import java.util.HashMap;
import java.util.List;

public interface MapIF<K, V> {

    void clear();

    boolean containsKey(K key);

    boolean containsValue(V value);

    boolean equals(Object o);

    V get(K key);

    boolean isEmpty();

    V put(K key, V value);

    V remove(K key);

    int size();

    List<V> values();

}
