package clases;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class NifTest {
    Nif n;

    @BeforeEach
    void setUp() {
        n = new Nif(16789023);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString() {
        assertEquals("16789023-N", n.toString());
    }

    @Test
    void setNif() {
        n.setNif(12345678);
        assertEquals("12345678-Z", n.toString());
    }

    @Test
    void testEquals() {
        Nif n1 = new Nif(12345678);
        Nif n2 = new Nif(16789023);
        assertAll("NIF Iguales",
                () -> assertFalse(n.equals(n1)),
                () -> assertTrue(n.equals(n2)));
    }
}