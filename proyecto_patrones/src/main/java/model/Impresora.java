package model;

import Interfaces.C_Impresora;
import Interfaces.Vendible;

public class Impresora implements Vendible, C_Impresora {

    public void mostrarNombre() {
        System.out.println("Impresora HP");
    }

    public void mostrarPrecio() {
        System.out.println("Precio: S/850");
    }

    public void mostrarTipoConexion() {
        System.out.println("Conexion: WiFi / USB");
    }

    public void mostrarCapacidadTintas() {
        System.out.println("Capacidad de tintas: 4 cartuchos");
    }
}
