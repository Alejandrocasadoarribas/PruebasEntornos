package Makigas.JUnit5.Catalogo;

public interface Carrito {
    void agregar(Producto p);
    int cantidad();
    int total();
    void vaciar();
}
