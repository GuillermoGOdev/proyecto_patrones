package model;

public class Calculadora {
    
    public double operaciones(double a, double b, String tipo) {
        if(tipo.equalsIgnoreCase("suma")) {
            return a + b;
        } else if(tipo.equalsIgnoreCase("resta")) {
            return a - b;
        } else {
            System.out.println("Error");
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.operaciones(1, 2, "suma"));
        System.out.println(c.operaciones(1, 2, "resta"));
    }
}
