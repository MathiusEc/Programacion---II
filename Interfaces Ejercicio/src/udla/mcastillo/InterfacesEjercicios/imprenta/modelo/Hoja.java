package udla.mcastillo.InterfacesEjercicios.imprenta.modelo;

abstract public class Hoja {
    /** Declaración de Atributos*/
    protected String contenido;

    /** Constrcutores & Destructores */
    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    /** Métodos Abstractos */
    abstract public String imprimir();
}