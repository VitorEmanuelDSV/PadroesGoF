package adapterTest;

import adapter.MapToListAdapter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapToListAdapterTest {

    private MapToListAdapter<String, Integer> adapter;
    private Map<String, Integer> map;

    @BeforeEach
    void setUp() {
        map = new HashMap<>();
        map.put("Chave1", 10);
        map.put("Chave2", 20);
        adapter = new MapToListAdapter<>(map);
    }

    @Test
    void add() {
        Map.Entry<String, Integer> newEntry = new AbstractMap.SimpleEntry<>("Chave3", 30);
        assertTrue(adapter.add(newEntry));
        assertTrue(map.containsKey("Chave3"));
        assertEquals(30, map.get("Chave3"));
    }

    @Test
    void clear() {
        adapter.clear();
        assertTrue(map.isEmpty());
    }

    @Test
    void contains() {
        Map.Entry<String, Integer> existingEntry = new AbstractMap.SimpleEntry<>("Chave1", 10);
        Map.Entry<String, Integer> nonExistingEntry = new AbstractMap.SimpleEntry<>("Chave4", 40);

        assertTrue(adapter.contains(existingEntry));
        assertFalse(adapter.contains(nonExistingEntry));
    }

    @Test
    void testEquals() {
        Map<String, Integer> anotherMap = new HashMap<>(map);
        MapToListAdapter<String, Integer> anotherAdapter = new MapToListAdapter<>(anotherMap);

        assertTrue(adapter.equals(anotherAdapter));

        anotherAdapter.add(new AbstractMap.SimpleEntry<>("Chave3", 30));
        assertFalse(adapter.equals(anotherAdapter));
    }

    @Test
    void get() {
        assertEquals("Chave1", adapter.get(0).getKey());
        assertEquals(10, adapter.get(0).getValue());
        assertEquals("Chave2", adapter.get(1).getKey());
        assertEquals(20, adapter.get(1).getValue());
    }

    @Test
    void isEmpty() {
        assertFalse(adapter.isEmpty());
        adapter.clear();
        assertTrue(adapter.isEmpty());
    }

    @Test
    void remove() {
        Map.Entry<String, Integer> entryToRemove = new AbstractMap.SimpleEntry<>("Chave1", 10);
        assertTrue(adapter.remove(entryToRemove));
        assertFalse(map.containsKey("Chave1"));

        Map.Entry<String, Integer> nonExistingEntry = new AbstractMap.SimpleEntry<>("Chave3", 30);
        assertFalse(adapter.remove(nonExistingEntry));
    }

    @Test
    void size() {
        assertEquals(2, adapter.size());
        adapter.add(new AbstractMap.SimpleEntry<>("Chave3", 30));
        assertEquals(3, adapter.size());
    }

    @Test
    void toArray() {
        Object[] entriesArray = adapter.toArray();
        assertEquals(2, entriesArray.length);
        assertEquals(new AbstractMap.SimpleEntry<>("Chave1", 10), entriesArray[0]);
        assertEquals(new AbstractMap.SimpleEntry<>("Chave2", 20), entriesArray[1]);
    }

    @Test
    void testToArray() {
        Map.Entry<String, Integer>[] entriesArray = new Map.Entry[2];
        entriesArray = adapter.toArray(entriesArray);

        assertEquals(2, entriesArray.length);
        assertEquals(new AbstractMap.SimpleEntry<>("Chave1", 10), entriesArray[0]);
        assertEquals(new AbstractMap.SimpleEntry<>("Chave2", 20), entriesArray[1]);
    }
}
