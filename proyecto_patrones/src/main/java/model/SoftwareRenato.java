
package model;

public class SoftwareRenato extends Articulo {
    public SoftwareRenato(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase(); // Sin envío
    }
}