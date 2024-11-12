package testjava;

import entities.Guiche;
import entities.Onibus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuicheTest {

    private Guiche guiche;

    @BeforeEach
    public void setUp() {
        guiche = new Guiche();  // O ônibus com ID 1 já está registrado automaticamente
    }


    @Test
    public void testRegistraOnibusIdDuplicado() {
        Onibus onibus1 = Guiche.createOnibus(1, 10, 4);
        Onibus onibus2 = Guiche.createOnibus(1, 8, 3);

        guiche.registraOnibus(onibus1); // Registro do primeiro ônibus

        // Teste para garantir que o método retorna false ao tentar registrar o segundo ônibus com ID duplicado
        boolean resultado = guiche.registraOnibus(onibus2);

        // Verifica se o retorno é false, já que o ID é duplicado
        assertFalse(resultado, "O ônibus com ID duplicado não deveria ser registrado.");
    }


    @Test
    public void testGetOnibusByIdExistente() {
        // Testa se o método retorna o ônibus correto para um ID existente
        Onibus onibus = guiche.getOnibusById(1);  // Buscando o ônibus com ID 1, que foi registrado no setUp()
        assertNotNull(onibus, "O ônibus não deveria ser nulo.");
        assertEquals(1, onibus.getId(), "O ID do ônibus deveria ser 1.");
    }

    @Test
    public void testGetOnibusByIdInexistente() {
        // Testa se o método lança exceção para um ID inexistente
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            guiche.getOnibusById(99);  // Buscando um ônibus com ID 99, que não foi registrado
        });
        assertEquals("Ônibus com ID 99 não encontrado.", exception.getMessage(), "A mensagem da exceção não corresponde.");
    }
}

