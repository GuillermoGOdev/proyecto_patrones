package model;

public class Interfaces {

    public static void main(String[] args) {
        LaptopGamer laptop = new LaptopGamer();
        Impresora impresora = new Impresora();

        System.out.println("------------------");
        laptop.mostrarNombre();
        System.out.println("------------------");
        laptop.mostrarPrecio();
        laptop.activarRGB();
        laptop.mostrarFPS();
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println("-------------");
        impresora.mostrarNombre();
        System.out.println("-------------");
        impresora.mostrarPrecio();
        impresora.mostrarCapacidadTintas();
        impresora.mostrarTipoConexion();
    }

}
