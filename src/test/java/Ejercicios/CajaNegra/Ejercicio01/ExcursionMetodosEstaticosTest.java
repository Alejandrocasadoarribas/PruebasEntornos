package Ejercicios.CajaNegra.Ejercicio01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcursionMetodosEstaticosTest {

    @Test
    void calcularPrecioAlumno() {
        assertEquals(65,ExcursionMetodosEstaticos.calcularPrecioAlumno(100));
        assertEquals(70, ExcursionMetodosEstaticos.calcularPrecioAlumno(50));
        assertEquals(95, ExcursionMetodosEstaticos.calcularPrecioAlumno(30));
        assertEquals(4000/29, ExcursionMetodosEstaticos.calcularPrecioAlumno(29));
    }

    @Test
    void calcularCosteExcursion() {
        assertEquals(6500,ExcursionMetodosEstaticos.calcularCosteExcursion(100));
        assertEquals(3500,ExcursionMetodosEstaticos.calcularCosteExcursion(50));
        assertEquals(2850,ExcursionMetodosEstaticos.calcularCosteExcursion(30));
        assertEquals(4000,ExcursionMetodosEstaticos.calcularCosteExcursion(29));
    }
}