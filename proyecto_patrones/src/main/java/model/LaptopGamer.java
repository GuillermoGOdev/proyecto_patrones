package model;

import Interfaces.Gamer;
import Interfaces.Vendible;

public class LaptopGamer implements Vendible, Gamer {

    public void mostrarNombre() {
        System.out.println("Laptop Gamer ASUS");
    }

    public void mostrarPrecio() {
        System.out.println("Precio: S/4500");
    }

    public void activarRGB() {
        System.out.println("Teclado RGB Activado");
    }

    public void mostrarFPS() {
        System.out.println("FPS estimados: 144");
    }
}
