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
        assertNull(adapter.get(2)); // Verifica para chave que não existe
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
        assertEquals("Segundo", removed); // Verifica o valor removido
        assertFalse(adapter.containsKey(1)); // Chave não deve existir após remoção
        assertNull(adapter.remove(2)); // Remove chave inexistente, retorna null
    }

    @Test
    void putAll() {
        // O método putAll não foi implementado, então não há ação aqui para testar.
        // Caso deseje, adicione um teste com comportamento esperado no futuro.
    }

    @Test
    void size() {
        assertEquals(2, adapter.size());
        adapter.put(2, "Terceiro");
        assertEquals(3, adapter.size());
    }

    @Test
    void isEmpty() {
        assertFalse(adapter.isEmpty()); // Lista não está vazia inicialmente
        adapter.clear();
        assertTrue(adapter.isEmpty()); // Lista fica vazia após clear
    }

    @Test
    void clear() {
        adapter.clear();
        assertEquals(0, adapter.size()); // Lista fica com tamanho 0
        assertTrue(adapter.isEmpty()); // Verifica que lista está vazia
    }

    @Test
    void values() {
        assertEquals(list, adapter.values()); // Verifica se values retorna a lista original
    }

    @Test
    void keySet() {
        assertThrows(UnsupportedOperationException.class, adapter::keySet);
    }

    @Test
    void entrySet() {
        assertThrows(UnsupportedOperationException.class, adapter::entrySet);
    }

    @Test
    void containsValue() {
        assertTrue(adapter.containsValue("Primeiro"));
        assertTrue(adapter.containsValue("Segundo"));
        assertFalse(adapter.containsValue("NaoExistente"));
    }
}
