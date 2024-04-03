import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    @Test
    void sumar() {
        assertEquals(4, Calculadora.sumar(2,2)); // caso de prueba
    }

    @Test
    void restar() {
        assertEquals(0,Calculadora.restar(2,2));
    }

    @Test
    void multiplicacion() {
        assertEquals(25,Calculadora.multiplicacion(5,5));
    }

    @Test
    void division() {
        assertEquals(6, Calculadora.division(30,5));
    }
}
