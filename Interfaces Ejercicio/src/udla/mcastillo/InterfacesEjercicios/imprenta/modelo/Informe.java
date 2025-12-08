package udla.mcastillo.InterfacesEjercicios.imprenta.modelo;

public class Informe extends Hoja{
    /** Atributos de la Clase*/
    private String autor;
    private String revisor;

    /** Herencia del Constrcutor*/
    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    /** Herencia del metodo abstracto*/
    // Con string builder
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.contenido).append("\n")
                .append("Informe escrito por: ").append(this.autor).append("\n")
                .append("Revisado por: ").append(this.revisor).append("\n");
        return sb.toString(); // Convertir StringBuilder a String, con el metodo toString();
    }

    /**
     * Sin String Builder
     * @Override
     *     public String imprimir() {
     *         return
     *                 this.contenido + "\n" +
     *                 "Informe escrito por: " + this.autor + "\n"+
     *                 "Revisado por: " + this.revisor + "\n";
     *     }
     * */
}
