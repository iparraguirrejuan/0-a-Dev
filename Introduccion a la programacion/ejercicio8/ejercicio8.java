package ejercicio8;

public class ejercicio8 {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setEdad(30);
        persona.setNombre("Juan");
        persona.setTelefono(1162237483);

       // System.out.println(persona.getEdad());
        //System.out.println(persona.getNombre());
        //System.out.println(persona.getTelefono());

        System.out.println("Nombre: "+persona.getNombre() +" - Edad: "+ persona.getEdad()+" - Telefono: "+persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad =edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
}