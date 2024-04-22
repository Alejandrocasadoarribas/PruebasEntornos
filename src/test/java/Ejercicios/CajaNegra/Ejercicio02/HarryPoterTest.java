package Ejercicios.CajaNegra.Ejercicio02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarryPoterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Prueba 1")
    @Test
    void casa1() {
        assertEquals("valentia", HarryPoter.casa("Gryffindor"));
    }

    @DisplayName("Prueba 2")
    @Test
    void casa2() {
        assertEquals("lealtad", HarryPoter.casa("hufflepuff"));
    }

    @DisplayName("Prueba 3")
    @Test
    void casa3() {
        assertEquals("astucia", HarryPoter.casa("slytherin"));
    }

    @DisplayName("Prueba 4")
    @Test
    void casa4() {
        assertEquals("intelecto", HarryPoter.casa("ravenclaw"));
    }

    @DisplayName("Prueba 5")
    @Test
    void casa5() {
        assertEquals("No es una casa valida", HarryPoter.casa("harry"));
    }
}