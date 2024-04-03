package Makigas.JUnit5.Catalogo;

import Makigas.JUnit5.Pago.PagoException;
import Makigas.JUnit5.Pago.ProveedorPago;

import java.util.ArrayList;

public class Pedido implements Carrito, Pagable{

    private final ArrayList<Producto> productos = new ArrayList<>();
    @Override
    public void agregar(Producto p) {
        this.productos.add(p);
    }


    @Override
    public int cantidad() {
        return 0;
    }

    @Override
    public int total() {
        return this.productos.stream()
                .map(Producto::getPrecio)
                .reduce(0,Integer::sum);
    }

    @Override
    public void vaciar() {
        productos.clear();
    }

    @Override
    public void pagar(ProveedorPago pagos) throws PagoException {

    }
}
