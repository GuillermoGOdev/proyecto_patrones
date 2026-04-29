
package model;

public abstract class Articulo {
    private String nombre;
    private double precioBase;

    public Articulo(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    public abstract double calcularPrecioFinal();
    
    public String getNombre() { 
        return nombre; 
    }
    public double getPrecioBase() { 
        return precioBase; 
    }
}
