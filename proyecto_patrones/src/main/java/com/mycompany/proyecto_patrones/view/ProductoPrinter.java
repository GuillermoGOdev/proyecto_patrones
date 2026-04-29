
package com.mycompany.proyecto_patrones.view;

import dto.Producto;
import java.util.List;

public class ProductoPrinter {
    
    // Cambia el nombre aquí:
    public void imprimirCatalogo(List<Producto> productos) { 
        System.out.println("========================================");
        System.out.println("      LISTADO DE PRODUCTOS - SRP        ");
        System.out.println("========================================");
        
        for (Producto p : productos) {
            System.out.println("ID: " + p.getId() + " | " + p.getNombre());
        }
        
        System.out.println("----------------------------------------");
    }
}
