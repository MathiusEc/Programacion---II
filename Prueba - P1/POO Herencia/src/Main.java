import udla.mcastillo.pooherencia.p2.Alumno;
import udla.mcastillo.pooherencia.p2.Persona;

public class Main {
    public static void main(String[] args) {
        /** Creación de Objetos */
        Persona persona1 = new Persona();

        // Llamar a la sub clase
        Alumno alumno1 = new Alumno("Juan", "Castillo", 28,"M");
        alumno1.setNombre("mini juan");
        System.out.println("Nombre del alumno: " + alumno1.getNombre());

    }
}