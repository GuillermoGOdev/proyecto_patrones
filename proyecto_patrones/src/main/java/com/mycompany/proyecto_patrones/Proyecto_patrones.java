package com.mycompany.proyecto_patrones;
//
import com.mycompany.proyecto_patrones.service.ProductoService;
import com.mycompany.proyecto_patrones.view.ProductoPrinter;
import dto.Producto;
import java.util.List;


public class Proyecto_patrones {

    public static void main(String[] args) {
      
        // Principios SOLID
        // S: single resposability - Armando
        // O: open-closed - Guillermo
        // L: Liskov - Renato
        // I: interface segregation - María
        // D: dependency inversion - Renato
        
        // Mi Primer Principio de Responsalibilidad Unica

        // 1. Instanciamos el servicio (Obtiene los datos)
        ProductoService servicio = new ProductoService();
        
        // 2. Instanciamos la impresora (Muestra los datos)
        ProductoPrinter impresora = new ProductoPrinter();
        
        // 3. Obtenemos la lista y la mandamos a imprimir
        List<Producto> lista = servicio.obtenerCatalogo();
        impresora.imprimirCatalogo(lista);
    }
}

