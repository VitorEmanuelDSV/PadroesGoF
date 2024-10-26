package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class MapToListAdapter<K, V> implements ListIF<Map.Entry<K, V>> {
    private final Map<K, V> map;

    public MapToListAdapter(Map<K, V> map) {
        this.map = map;
    }

    @Override
    public boolean add(Map.Entry<K, V> entry) {
        map.put(entry.getKey(), entry.getValue());
        return true;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean contains(Object o) {
        if (o instanceof Map.Entry) {
            Map.Entry<K, V> entry = (Map.Entry<K, V>) o;
            return map.containsKey(entry.getKey()) && map.containsValue(entry.getValue());
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof MapToListAdapter) {
            return map.equals(((MapToListAdapter<?, ?>) o).map);
        }
        return false;
    }

    @Override
    public Map.Entry<K, V> get(int index) {
        return new ArrayList<>(map.entrySet()).get(index);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return map.entrySet().iterator();
    }

    @Override
    public boolean remove(Object o) {
        if (o instanceof Map.Entry) {
            Map.Entry<K, V> entry = (Map.Entry<K, V>) o;
            return map.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Object[] toArray() {
        return map.entrySet().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return map.entrySet().toArray(a);
    }

    // Métodos que não são mapeados diretamente, não estão em comum na list e no map

    public void add(int index, Map.Entry<K, V> element) {
        throw new UnsupportedOperationException("Not supported for MapToListAdapter.");
    }

    public boolean addAll(Collection<? extends Map.Entry<K, V>> c) {
        throw new UnsupportedOperationException("Not supported for MapToListAdapter.");
    }

    public Map.Entry<K, V> remove(int index) {
        throw new UnsupportedOperationException("Not supported for MapToListAdapter.");
    }

    public Map.Entry<K, V> set(int index, Map.Entry<K, V> element) {
        throw new UnsupportedOperationException("Not supported for MapToListAdapter.");
    }


}

