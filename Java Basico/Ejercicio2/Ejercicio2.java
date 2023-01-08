package Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        double producto1 = 174.32d;
        int producto2 = 100;
        double producto3 = 123.23;

        double totalProducto1 = getPrice(producto1) + producto1;
        double  totalProducto2 = getPrice(producto2) + producto2;
        double totalProducto3 = getPrice(producto3) + producto3;

        resultado(producto1, totalProducto1);
        resultado(producto2, totalProducto2);
        resultado(producto3, totalProducto3);
        
    }
    
    static double getPrice(double precio){
        return precio*0.21;
    }

    static void resultado(double producto, double total){
        System.out.println("");
        System.out.println("El valor del producto es: $" + producto);
        System.out.println("el IVA es: 21%");
        System.out.println("El total c/ iva es de: $" + total);

    }
}
