// Primera parte 

public class ejercicio3{

    public static void main(String[] args) {
        int resultado;
        resultado = suma(30, 10 , 20);

        System.out.println("El resultado de la suma es: " + resultado);

        coche MiCoche = new coche();
        MiCoche.addpuerta();
        MiCoche.addpuerta();

        System.out.println("El numero de puertas es: " + MiCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }

}
// Segunda parte 

class coche{
    public int puertas = 0;

    public void addpuerta() {
        this.puertas ++;
    }
}
