package Makigas.JUnit5.Catalogo;

import Makigas.JUnit5.Pago.PagoException;
import Makigas.JUnit5.Pago.ProveedorPago;

public interface Pagable {
    void pagar(ProveedorPago pagos) throws PagoException;
}
