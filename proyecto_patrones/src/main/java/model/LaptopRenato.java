
package model;

public class LaptopRenato extends Articulo {
    private double costoEnvio;

    public LaptopRenato(String nombre, double precioBase, double costoEnvio) {
        super(nombre, precioBase);
        this.costoEnvio = costoEnvio;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + costoEnvio;
    }
}