package udla.mcastillo.pooherencia.p2;

public class Persona {
    /** Atributos de Clase */
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;

    /** Atributos de Clase */
    public Persona(String nombre, String apellido, int edad, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
    }

    public Persona() {
    }


    /** Getters & Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /** Metodos del programador*/
}
