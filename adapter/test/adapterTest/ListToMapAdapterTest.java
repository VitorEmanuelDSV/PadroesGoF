package adapterTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListToMapAdapterTest {

    private adapter.ListToMapAdapter<Integer, String> adapter;
    private List<String> list;

    @BeforeEach
    public void setUp() {
        list = new ArrayList<>();
        list.add("Primeiro");
        list.add("Segundo");
        adapter = new adapter.ListToMapAdapter<>(list);
    }

    @Test
    void getTest() {
        assertEquals("Primeiro", adapter.get(0));
        assertEquals("Segundo", adapter.get(1));
        assertNull(adapter.get(2));
    }

    @Test
    void put() {
        String result = adapter.put(2, "Terceiro");
        assertNull(result);
        assertEquals("Terceiro", list.get(2));
    }

    @Test
    void containsKey() {
        assertTrue(adapter.containsKey(0));
        assertTrue(adapter.containsKey(1));
        assertFalse(adapter.containsKey(2));
    }

    @Test
    void remove() {
        String removed = adapter.remove(1);
        assertEquals("Segundo", removed);
        assertFalse(adapter.containsKey(1));
        assertNull(adapter.remove(2));
    }

    @Test
    void size() {
        assertEquals(2, adapter.size());
        adapter.put(2, "Terceiro");
        assertEquals(3, adapter.size());
    }

    @Test
    void isEmpty() {
        assertFalse(adapter.isEmpty());
        adapter.clear();
        assertTrue(adapter.isEmpty());
    }

    @Test
    void clear() {
        adapter.clear();
        assertEquals(0, adapter.size());
        assertTrue(adapter.isEmpty());
    }

    @Test
    void values() {
        assertEquals(list, adapter.values());
    }

    @Test
    void containsValue() {
        assertTrue(adapter.containsValue("Primeiro"));
        assertTrue(adapter.containsValue("Segundo"));
        assertFalse(adapter.containsValue("NaoExistente"));
    }
}
