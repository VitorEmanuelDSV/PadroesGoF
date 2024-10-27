package main;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListToMapAdapter<K, V> implements Map<K, V> {
    private final List<V> list;

    public ListToMapAdapter(List<V> list) {
        this.list = list;
    }

    @Override
    public V get(Object key) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            return (index < list.size()) ? list.get(index) : null;
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        list.add(value);
        return null;
    }


    @Override
    public boolean containsKey(Object key) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            return index < list.size();
        }
        return false;
    }

    @Override
    public V remove(Object key) {
        if (key instanceof Integer) {
            int index = (Integer) key;
            if (index < list.size()) {
                return list.remove((int) index);
            }
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public Collection<V> values() {
        return list;
    }

    // Métodos que não são mapeados diretamente, não estão em comum na list e no map
    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException("Not supported for ListToMapAdapter.");
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("Not supported for ListToMapAdapter.");
    }

    @Override
    public boolean containsValue(Object value) {
        return list.contains(value);
    }

}
