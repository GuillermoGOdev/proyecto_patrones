package model;

import com.mycompany.proyecto_patrones.service.ProductoService;
import dto.Categoria;
import dto.Producto;
import java.util.List;
public class PruebaChito {


    public static void main(String[] args) {
        
        ProductoService servicio = new ProductoService();
        List<Producto> lista = servicio.obtenerCatalogo();

        System.out.println("\n=======================================");
        System.out.println("   PRUEBA DE PRODUCTOS - ECOMMERCE     ");
        System.out.println("=======================================");

        // Recorremos tu ArrayList
        for (Producto p : lista) {
            System.out.println("ID: " + p.getId());
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Precio: S/." + p.getPrecio());
            System.out.println("---------------------------------------");
        }
    }
}

