package udla.mcastillo.pooherencia.p2;

public class Profesor extends Persona {
    /** Atributos de Profesor */
    private String materia;

    /** Constructores & Destructores */
    public Profesor(String nombre, String apellido, int edad, String genero, String materia) {
        super(nombre, apellido, edad, genero);
        this.materia = materia;
    }

    public Profesor(String nombre, String apellido, int edad, String genero) {
        super(nombre, apellido, edad, genero);
    }

    /** Setters and Getters*/
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    /** Metodos del programador */
}
