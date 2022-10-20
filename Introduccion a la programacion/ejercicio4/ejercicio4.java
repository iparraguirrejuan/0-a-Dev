

public class ejercicio4{

    public static void main (String[] args){
        var estacion = "Otoño";
        int numeroif = 10;
        int numerowhile = 0;
        int numerodowhile = 1;
        

// Condicionales 
        if (numeroif > 0){
            System.out.println("La variable numeroif, es positiva");
        } else if (numeroif == 0) {
            System.out.println("La variable numeroif, es igual a 0");
        } else {
            System.out.println("La variable numeroif, es negativa ");
        }
        System.out.println();

// Bucle while 
        while (numerowhile < 3){
            System.out.println("Procedemos a sumarle 1 a la variable: " + numerowhile );
            numerowhile = numerowhile + 1;
        }
        System.out.println();

// Bucle do while 
        do {
            System.out.println("la variable numero do while es: " + numerodowhile);
            numerodowhile = numerodowhile + 2;
        } while (numerodowhile < 3);
        System.out.println();

//Bucle for 
        for (int numerofor = 0; numerofor <= 3; numerofor = numerofor +1){
        System.out.println("La variable numero for es:" + numerofor );
        }    
    System.out.println();    

// Switch case
        switch(estacion){
            case "Verano":
                System.out.println("Estamos en: Verano");
                break;
            case "Invierno":
                System.out.println("Estamos en: invierno");
                break;
            case "Otoño":
                System.out.println("Estamos en: Otoño");
                break;
            case "Primavera":
                System.out.println("Estamos en: Primavera");
                break; 
            default:
                System.out.println("Esto no es una estacion ");
        }

    }
}
