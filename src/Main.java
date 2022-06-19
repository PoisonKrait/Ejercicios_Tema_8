public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(26);
        System.out.println("La edad de la persona es: " + persona.getEdad());
        persona.setNombre("Antonio Garcia");
        System.out.println("El nombre de la persona es: " + persona.getNombre());
        persona.setTelefono(55442786);
        System.out.println("El telefono de la persona es " + persona.getTelefono());
    }
}

class Persona {

    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}


