
package com.mycompany.proyecto_patrones.service;

import Interfaces.*;
import model.Articulo;

public class ProcesadorOrden {
    
    private final IMetodoPago metodoPago;
    private final IVentaRepository repositorio;

    
    public ProcesadorOrden(IMetodoPago metodoPago, IVentaRepository repositorio) {
        this.metodoPago = metodoPago;
        this.repositorio = repositorio;
    }

    public void procesar(Articulo articulo) {
        
        double total = articulo.calcularPrecioFinal();
        
        System.out.println("Iniciando proceso de compra para: " + articulo.getNombre());
        
        metodoPago.realizarPago(total);
        repositorio.guardar("Venta exitosa de: " + articulo.getNombre() + " | Total: S/" + total);
        
        System.out.println("Orden finalizada satisfactoriamente.");
    }
}
