public class Persona {
    private String nombre, apellido, rut;
    private int edad;

    public Persona (String nombre, String apellido, String rut, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }

    public int getEdad() {
        return edad;
    }
}
