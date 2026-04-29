/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Interfaces.IVentaRepository;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ArchivoVentas implements IVentaRepository{

    @Override
    public void guardar(String datos) {
        
        DateTimeFormatter formatoNombre = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String fechaActual = LocalDateTime.now().format(formatoNombre);
        
        String nombreArchivo = "venta_"+fechaActual +".txt";
        
        // Intentamos escribir en un archivo local
        try (FileWriter fw = new FileWriter(nombreArchivo, true);
             PrintWriter pw = new PrintWriter(fw)) {
            
            pw.println("--- Nueva Venta ---");
            pw.println(datos);
            pw.println("Fecha/Hora: " + java.time.LocalDateTime.now());
            pw.println("-------------------");
            
            System.out.println("[Sistema] Datos guardados en el archivo correctamente.");
            
        } catch (IOException e) {
            System.err.println("[Error] No se pudo guardar la venta: " + e.getMessage());
        }
    }
    
}
