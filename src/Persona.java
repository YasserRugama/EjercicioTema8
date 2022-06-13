public class Persona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Yasser");
        persona.setEdad(38);
        persona.setTelefono("505-48152635");

        System.out.println("EL nombre de la persona es: "+ persona.getNombre());
        System.out.println("Tiene una edad de " + persona.getEdad() + " anios");
        System.out.println("El numero de telefono es: " + persona.getTelefono());



    }
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
