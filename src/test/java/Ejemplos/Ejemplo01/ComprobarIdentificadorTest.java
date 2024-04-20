package Ejemplos.Ejemplo01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprobarIdentificadorTest {
    ComprobarIdentificador comprobar;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Probamos la palabra valida")
    @Test
    void validarIdentificador1() {
        comprobar = new ComprobarIdentificador();
        comprobar.setIdentificador("Progra-mador-1");
        assertTrue(comprobar.validarIdentificador());
    }
    @DisplayName("Primera prueba incorrecta (Prog)")
    @Test
    void validarIdentificador2() {
        comprobar = new ComprobarIdentificador();
        comprobar.setIdentificador("Prog");
        assertFalse(comprobar.validarIdentificador());
    }

    @DisplayName("Segunda prueba incorrecta (Progra-mador-112)")
    @Test
    void validarIdentificador3() {
        comprobar = new ComprobarIdentificador();
        comprobar.setIdentificador("Progra-mador-112");
        assertFalse(comprobar.validarIdentificador());
    }

    @DisplayName("Tercera prueba incorrecta ($$$###_?)")
    @Test
    void validarIdentificador4() {
        comprobar = new ComprobarIdentificador();
        comprobar.setIdentificador("$$$###_?");
        assertFalse(comprobar.validarIdentificador());
    }

    @DisplayName("Cuarta prueba incorrecta (-Progra-mador)")
    @Test
    void validarIdentificador5() {
        comprobar = new ComprobarIdentificador();
        comprobar.setIdentificador("-Progra-mador");
        assertFalse(comprobar.validarIdentificador());
    }

    @DisplayName("Quinta prueba incorrecta (Progra—mador-)")
    @Test
    void validarIdentificador6() {
        comprobar = new ComprobarIdentificador();
        comprobar.setIdentificador("Progra—mador-");
        assertFalse(comprobar.validarIdentificador());
    }

    @DisplayName("Sexta prueba incorrecta (12345-6789)")
    @Test
    void validarIdentificador7() {
        comprobar = new ComprobarIdentificador();
        comprobar.setIdentificador("12345-6789");
        assertFalse(comprobar.validarIdentificador());
    }

    @DisplayName("Septima prueba incorrecta (boolean)")
    @Test
    void validarIdentificador8() {
        comprobar = new ComprobarIdentificador();
        comprobar.setIdentificador("boolean");
        assertFalse(comprobar.validarIdentificador());
    }
}