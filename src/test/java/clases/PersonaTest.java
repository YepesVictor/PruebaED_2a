package clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    Persona p,p1;

    @BeforeEach
    void setUp() {
        p = new Persona(12345678, "Victor", 'H', 22, 06, 2000);
        p1 = new Persona(12345678, "Victor Yepes", 'H', 22, 06, 2000);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getEdad() {
        int agno = LocalDate.now().getYear();
        int e = agno - p.getNacimiento().getYear();
        if (LocalDate.now().getDayOfYear() < p.getNacimiento().getDayOfYear()) {
            e--;
        }

        assertEquals(e, p.getEdad());
    }

    @Test
    void testToString() {

        assertAll("toString",
                () -> assertEquals("12345678-Z\tVictor\t\t\t23", p.toString()),
                () -> assertEquals("12345678-Z\tVictor\tYepes\t\t23", p1.toString()));
    }

    @Test
    void testEquals() {
        Curso c=new Curso("Prueba");
        assertAll("Igual",
                ()->assertTrue(p.equals(p1)),
                ()->assertFalse(p.equals(c)));
    }
    @Test
    void compareTo() {
        assertEquals(0,p.compareTo(p1));
    }
}