package testjava;

import controllers.storage.Estoque;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

public class TestVEstoque extends BaseTest {

    @Test
    public void assertThrowsgetMaterialById() {
        assertThrows(NoSuchElementException.class, () -> {sig.estoque.getMaterialById(999);});
    }

    @Test
    public void assertNotThrowsgetMaterialById() {
        sig.estoque.addMaterial(Estoque.createCadeira(sig.estoque.materiais.size(),"BOA"));
        assertNotNull(sig.estoque.getMaterialById(0));
    }
}
