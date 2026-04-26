package model;

import java.util.ArrayList;
import java.util.List;

import DTO.Categoria;
import DTO.Producto; 

public class ProductoService {
    
    private List<Producto> listaProductos = new ArrayList<>();
    
    public List<Producto> obtenerCatalogo() {
            return listaProductos;
        }

        public void agregarProducto(Producto p) {
            listaProductos.add(p);
        }

    public ProductoService() {

        Categoria catLaptops = new Categoria(1, "Laptops");
        Categoria catPerifericos = new Categoria(2, "Periféricos");

        listaProductos.add(new Producto(1, "Laptop Gamer", "Ryzen 9, 32GB RAM", 4500.0, 10, catLaptops));
        listaProductos.add(new Producto(2, "Mouse Pro", "RGB 16000 DPI", 150.0, 25, catPerifericos));
        listaProductos.add(new Producto(3, "Teclado Mecánico", "Switches Blue", 250.0, 15, catPerifericos));
    }
}