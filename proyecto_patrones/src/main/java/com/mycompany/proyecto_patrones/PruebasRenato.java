
package com.mycompany.proyecto_patrones;

import Interfaces.*;
import Repository.*;
import com.mycompany.proyecto_patrones.service.*;
import model.Articulo;
import model.*;

public class PruebasRenato {

    
    public static void main(String[] args) {
       
        IMetodoPago pago = new PagoTarjeta();
        IVentaRepository repo = new ArchivoVentas();
        
       
        ProcesadorOrden motorVentas = new ProcesadorOrden(pago, repo);

        
        Articulo laptop = new LaptopRenato("HP Victus PRO", 3500.0, 45.0);
        Articulo licencia = new SoftwareRenato("Windows 10 ", 350.0);


        System.out.println("PROCEDIMIENTOS:");
        motorVentas.procesar(laptop);
        System.out.println("---");
        motorVentas.procesar(licencia);
    }
    
}
