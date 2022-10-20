public class ejercicio9 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Pepe";
        cliente.edad = 30;
        cliente.telefono = 162234536;
        cliente.credito = 6475.23;

        Trabajador trabajador = new Trabajador();
        trabajador.salario = 2000.56;
        trabajador.nombre = "Carlos";
        trabajador.edad = 36;
        trabajador.telefono = 152663854;

        System.out.println("---Cliente---");
        System.out.println("Nombre: " + cliente.nombre); 
        System.out.println("Edad: "+ cliente.edad);
        System.out.println("Telefono: "+ cliente.telefono);
        System.out.println("Credito: $"+ cliente.credito);

        System.out.println("");

        System.out.println("---Trabajador---");
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Telefono: " + trabajador.telefono);
        System.out.println("Salario: $" + trabajador.salario);



    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}



