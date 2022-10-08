import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.menu();
    }

    public void menu(){
        Registro registro = new Registro();
        //List mayorA60 = registro.mayoresA60(60);

        registro.agregrarPersonas("nombre1", "apellido1", 1);
        registro.agregrarPersonas("Aria", "Arias", 60);
        registro.agregrarPersonas("Karen", "Salinas", 45);
        registro.agregrarPersonas("Atler","Taller",67);
        registro.buscarPorNombre("nombre1", "apellido1");
        registro.mayoresA60(60);
        /*registro.mostrarPersonasDeTerceraEdad(mayorA60);

        System.out.println(persona1.toString());*/
    }

    //Persona persona1 = new Persona("Aria", "Arias", 60);
}
