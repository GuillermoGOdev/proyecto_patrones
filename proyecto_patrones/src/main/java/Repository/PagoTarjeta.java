
package Repository;
import Interfaces.IMetodoPago;

public class PagoTarjeta implements IMetodoPago{

    @Override
    public void realizarPago(double monto) {
        System.out.println("[Procesador de Pagos] Conectando con el servidor de la tarjeta...");
        
        // Simulamos una validación lógica
        if (monto > 0) {
            System.out.println("[Exito] Se ha procesado el pago de: S/ " + monto);
            System.out.println("[Transaccion] Codigo de autorizacion: " + (int)(Math.random() * 1000000));
        } else {
            System.out.println("[Error] El monto debe ser mayor a cero.");
        }
    }
    
}
