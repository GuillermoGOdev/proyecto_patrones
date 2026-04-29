
package com.mycompany.proyecto_patrones;


import dto.Producto;
import dto.Categoria;
import java.util.ArrayList;
import java.util.List;

public class ListarProductos {
    
    private List<Producto> listaProductos;

    public ListarProductos() {
        this.listaProductos = new ArrayList<>();
        cargarDatosPrueba();
    }

    private void cargarDatosPrueba() {
        Categoria cat1 = new Categoria(1, "Laptops");
        
        listaProductos.add(new Producto(1, "Laptop Gamer", "Ryzen 9, 32GB RAM", 4500.0, 10, cat1));
        listaProductos.add(new Producto(2, "Mouse Pro", "RGB 16000 DPI", 150.0, 25, cat1));
        listaProductos.add(new Producto(3, "Teclado Mecanico", "Switches Blue", 250.0, 15, cat1));
    }

    
    public List<Producto> getLista() {
        return listaProductos;
    }
}
