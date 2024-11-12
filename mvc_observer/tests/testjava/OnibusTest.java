package testjava;

import entities.Assento;
import entities.Onibus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class OnibusTest {
    private Onibus onibus;

    @BeforeEach
    public void setUp() {
        // Inicializando um ônibus com um ID e dimensões de assentos
        onibus = new Onibus(1, 5, 5); // 5x5 matriz de assentos
    }

    @Test
    public void testCreateAssentoSucesso() {
        // Cria um assento em uma posição válida e verifica se é adicionado com sucesso
        Assento assento = onibus.createAssento(1, 2, 3);
        assertEquals(1, assento.getId());
        assertEquals(2, assento.getPositionX());
        assertEquals(3, assento.getPositionY());
    }

    @Test
    public void testCreateAssentoIdDuplicado() {
        // Cria um assento e tenta criar outro com o mesmo ID
        onibus.createAssento(1, 2, 3);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            onibus.createAssento(1, 3, 3);
        });
        assertEquals("ID já existente!1", exception.getMessage());
    }

    @Test
    public void testCreateAssentoPosicaoInvalida() {
        // Tenta criar um assento fora do limite da matriz de assentos
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            onibus.createAssento(2, 6, 6); // Fora do limite 5x5
        });
        assertEquals("Assento 2 em posição inválida!", exception.getMessage());
    }

    @Test
    public void testCompraAssentoByIdSucesso() {
        // Cria um assento e tenta comprá-lo
        Assento assento = onibus.createAssento(1, 2, 3);
        assertTrue(onibus.compraAssentoById(1));
        assertTrue(assento.isReservado()); // Supondo que `isReservado` retorne o status de reserva
    }

    @Test
    public void testInativaAssentoByIdSucesso() {
        // Cria um assento e o inativa
        Assento assento = onibus.createAssento(2, 1, 1);
        assertTrue(onibus.inativaAssentoById(2));
        assertFalse(assento.isAtivo()); // Supondo que `isAtivo` verifica se o assento está ativo
    }

    @Test
    public void testDisponibilizaAssentoByIdSucesso() {
        // Cria um assento, inativa-o e depois o disponibiliza novamente
        Assento assento = onibus.createAssento(3, 0, 0);
        onibus.inativaAssentoById(3);
        assertTrue(onibus.disponibilizaAssentoById(3));
        assertTrue(assento.isDisponivel()); // Supondo que `isDisponivel` verifica o status do assento
    }

    @Test
    public void testGetAssentoByIdNaoEncontrado() {
        // Tenta obter um assento que não existe
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            onibus.getAssentoById(999); // ID inexistente
        });
        assertEquals("Assento não encontrado!", exception.getMessage());
    }
}
