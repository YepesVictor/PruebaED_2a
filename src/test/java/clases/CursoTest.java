package clases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    Curso c;
    Persona p;
    @BeforeEach
    void setUp() {
        c=new Curso("Ingenieria");
        p=new Persona(12345678,"Victor",'H',22,06,2000);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToString() {
       c.aniadirAlumno(p);
        String s = "--------------------" + c.getNombre() + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        s+=p.toString()+"\n";
        assertEquals(s,c.toString());
    }

}