package com.mycompany.proyecto_patrones.service;

import java.util.ArrayList;
import java.util.List;
import dto.Categoria;
import dto.Producto;

public class ProductoService {

    private List<Producto> listaProductos = new ArrayList<>();

    public ProductoService() {
        // Responsabilidad: Inicializar los datos del e-commerce
        Categoria catLaptops = new Categoria(1, "Laptops");
        Categoria catPerifericos = new Categoria(2, "Periféricos");

        listaProductos.add(new Producto(1, "Laptop Gamer", "Ryzen 9, 32GB RAM", 4500.0, 10, catLaptops));
        listaProductos.add(new Producto(2, "Mouse Pro", "RGB 16000 DPI", 150.0, 25, catPerifericos));
        listaProductos.add(new Producto(3, "Teclado Mecánico", "Switches Blue", 250.0, 15, catPerifericos));
    }

    // Única responsabilidad: Entregar la lista de productos a quien la pida
    public List<Producto> obtenerCatalogo() {
        return listaProductos;
    }
}