package miTest;

import miPrincipal.Cola;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColaTest {
    @Test
    public void testColaVacia() {
        Cola<Integer> cola = new Cola<>();
        assertTrue(cola.esVacia());
        assertEquals(0, cola.getTamanio());
        assertNull(cola.frente());
    }

    @Test
    public void testEncolarDesencolar() {
        Cola<String> cola = new Cola<>();
        cola.encolar("Elemento 1");
        cola.encolar("Elemento 2");
        cola.encolar("Elemento 3");

        assertFalse(cola.esVacia());
        assertEquals(3, cola.getTamanio());
        assertEquals("Elemento 1", cola.frente());

        cola.desencolar();
        assertEquals(2, cola.getTamanio());
        assertEquals("Elemento 2", cola.frente());

        cola.desencolar();
        assertEquals(1, cola.getTamanio());
        assertEquals("Elemento 3", cola.frente());

        cola.desencolar();
        assertTrue(cola.esVacia());
        assertEquals(0, cola.getTamanio());
        assertNull(cola.frente());
    }
}