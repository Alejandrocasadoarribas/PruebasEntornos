package Makigas.JUnit5.Catalogo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregar() {
    }

    @Test
    @DisplayName("Con 0 productos")
    void testCantidad() {
        Pedido p = new Pedido();

        //Vamos a probar que la cantidad sea 0
        assertEquals(0,p.cantidad());

    }

    @Test
    @DisplayName("Con un producto")
    void testCantidad2() {
        // para probar el metodo cantidad necesito un objeto de tipo pedido con una serie de productos añadidos
        Producto p1 = new Producto("Coco", 400);


        Pedido p = new Pedido();

        p.agregar(p1);

        assertEquals(1,p.cantidad());
    }

    @Test
    @DisplayName("Con dos productos")
    void testCantidad3() {
        // para probar el metodo cantidad necesito un objeto de tipo pedido con una serie de productos añadidos
        Producto p1 = new Producto("Coco", 400);
        Producto p2 = new Producto("Canela", 200);

        Pedido p = new Pedido();

        p.agregar(p1);
        p.agregar(p2);

        Assertions.assertEquals(2,p.cantidad());

    }

    @Test
    void total() {
    }

    @Test
    void vaciar() {
    }

    @Test
    void pagar() {
    }
}