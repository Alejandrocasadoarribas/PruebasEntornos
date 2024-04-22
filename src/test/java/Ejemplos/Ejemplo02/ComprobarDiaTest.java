package Ejemplos.Ejemplo02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprobarDiaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Primera prueba valida")
    @Test
    void recargo1() {
        assertEquals(0,ComprobarDia.recargo(10));
    }

    @DisplayName("Segunda prueba valida")
    @Test
    void recargo2() {
        assertEquals(2,ComprobarDia.recargo(20));
    }

    @DisplayName("Tercera prueba valida")
    @Test
    void recargo3() {
        assertEquals(4,ComprobarDia.recargo(21));
    }
}