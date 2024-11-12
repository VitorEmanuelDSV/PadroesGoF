package testjava;

import entities.Assento;
import entities.Onibus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssentosTest {

    @Test
    public void testMudancaDeStatus() {
        Assento assento = new Assento(1, 1, 1); // Criando assento disponível
        assento.reservaAssento(); // Reserva o assento

        assertTrue(assento.isReservado()); // Verifica se o status é "RESERVADO"
    }

    @Test
    public void testMudancaDeStatusInvalida() {
        Assento assento = new Assento(1, 1, 1); // Criando assento disponível
        assento.reservaAssento(); // Reserva o assento

        // Tenta reservar novamente (deve lançar exceção)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            assento.reservaAssento();
        });

        assertEquals("O assento já está reservado!", exception.getMessage());
    }

    @Test
    public void testCriacaoDeAssento() {
        Onibus onibus = new Onibus(1, 5, 5); // Criando um ônibus 5x5
        Assento assento = onibus.createAssento(1, 2, 3); // Criando assento na posição 2x3

        assertNotNull(assento); // Verifica se o assento foi criado
        assertEquals(1, assento.getId()); // Verifica o ID
        assertEquals(2, assento.getPositionX()); // Verifica a posição X
        assertEquals(3, assento.getPositionY()); // Verifica a posição Y
    }

    @Test
    public void testCriacaoDeAssentoIdDuplicado() {
        Onibus onibus = new Onibus(1, 5, 5); // Criando um ônibus 5x5
        onibus.createAssento(1, 2, 3); // Criando o primeiro assento

        // Tenta criar um assento com o mesmo ID (deve lançar exceção)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            onibus.createAssento(1, 4, 4); // Tentando criar com ID 1, já existente
        });

        assertEquals("ID já existente!1", exception.getMessage()); // Verifica a mensagem de erro
    }


    @Test
    public void testCriacaoDeAssentoPosicaoInvalida() {
        Onibus onibus = new Onibus(1, 5, 5); // Criando um ônibus 5x5

        // Tenta criar um assento fora do limite 5x5
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            onibus.createAssento(2, 6, 6); // Fora do limite 5x5
        });

        assertEquals("Assento 2 em posição inválida!", exception.getMessage()); // Verifica a mensagem de erro
    }



}
