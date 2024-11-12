package testjava;

import entities.Onibus;
import entities.Assento;
import listener.AssentoListener;
import listener.OnibusListener;
import source.AssentoEvent;
import source.OnibusEvent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListenersTest {

    // Listener para Assento
    public class TestAssentoListener implements AssentoListener {
        private boolean statusAlterado = false;

        @Override
        public void mudouStatus(AssentoEvent e) {
            statusAlterado = true;  // Marca que o evento foi disparado
        }

        public boolean isStatusAlterado() {
            return statusAlterado;
        }
    }

    // Listener para Ônibus
    public class TestOnibusListener implements OnibusListener {
        private boolean statusAlterado = false;

        @Override
        public void mudouStatus(OnibusEvent e) {
            statusAlterado = true;  // Marca que o evento foi disparado
        }

        public boolean isStatusAlterado() {
            return statusAlterado;
        }
    }

    @Test
    public void testListenerAssentoMudancaDeStatus() {
        // Cria um ônibus e um assento
        Onibus onibus = new Onibus(1, 5, 5);
        Assento assento = onibus.createAssento(1, 2, 3); // Criando assento na posição 2x3

        // Cria e registra o listener no assento
        TestAssentoListener listener = new TestAssentoListener();
        assento.setAssentoListener(listener);  // Registrando o listener no assento

        // Realiza uma mudança de status no assento
        assento.reservaAssento();  // Reserva o assento

        // Verifica se o listener reagiu à mudança de status
        assertTrue(listener.isStatusAlterado(), "O listener não detectou a mudança de status do assento");
    }


    @Test
    public void testListenersVariosAssentos() {
        // Cria um ônibus e dois assentos
        Onibus onibus = new Onibus(1, 5, 5);
        Assento assento1 = onibus.createAssento(1, 2, 3);
        Assento assento2 = onibus.createAssento(2, 4, 4);

        // Cria e registra listeners para os dois assentos
        TestAssentoListener listener1 = new TestAssentoListener();
        TestAssentoListener listener2 = new TestAssentoListener();
        assento1.setAssentoListener(listener1);  // Registrando o listener para assento1
        assento2.setAssentoListener(listener2);  // Registrando o listener para assento2

        // Realiza mudanças de status nos assentos
        assento1.reservaAssento();  // Reserva o assento 1
        assento2.reservaAssento();  // Reserva o assento 2

        // Verifica se os listeners reagiram às mudanças de status
        assertTrue(listener1.isStatusAlterado(), "O listener 1 não detectou a mudança de status do assento 1");
        assertTrue(listener2.isStatusAlterado(), "O listener 2 não detectou a mudança de status do assento 2");
    }
}
