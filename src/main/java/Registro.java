import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Persona> personas;

    public Registro(){
        this.personas = new ArrayList<Persona>();

    }

    public Persona agregrarPersonas (String nombre, String apellido, int edad){
        Persona nuevaPersona = new Persona(nombre, apellido, edad);
        this.personas.add(nuevaPersona);
        return nuevaPersona;
    }

    public List mayoresA60 (int edad){
        List<Persona> mayorA60 = new ArrayList<>();
        for (Persona persona : this.personas){
            if (persona.getEdad() == edad && persona.getEdad() >= 60){
                mayorA60.add(persona);
            }
        }
        return mayorA60;
    }

    public void buscarPorNombre (String nombre, String apellido){
        for (Persona persona : this.personas){
            if (persona.getNombre().equals(nombre) && persona.getApellido().equals(apellido)){
                System.out.println(persona);
            }
        }
    }
}
