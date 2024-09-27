package testjava;

import controllers.admin.Admin;
import controllers.storage.Estoque;
import entities.admin.roles.Roles;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class TestAdmin extends BaseTest {

    @Test
    public void assertThrowsGetEntrevistaId() {
        assertThrows(NoSuchElementException.class, () -> {Admin.getEntrevistaById(999);});
    }

    @Test
    public void assertNotThrowsGetEntrevistaById() {
        sig.createUser("Calebe", Roles.createAdmin());
        sig.admin.createEntrevista(0, "Gabriel", "3204302404", "gabriel@gmail.com", "21/09/2024", "03:00PM", "Testes");

        assertNotNull(Admin.getEntrevistaById(0));
    }

    @Test
    public void assertThrowsGetReuniaoId() {
        assertThrows(NoSuchElementException.class, () -> {Admin.getReuniaoById(999);});
    }

    @Test
    public void assertNotThrowsGetReuniaoById() {
        int[] users_id = {0, 1};

        sig.createUser("Calebe", Roles.createAdmin());
        sig.createUser("Gabriel C", Roles.createAdmin());

        sig.admin.createReuniao(users_id, "Gabriel", "3204302404", "gabriel@gmail.com", "21/09/2024", "03:00PM", "Testes");

        assertNotNull(Admin.getReuniaoById(0));
    }

}
