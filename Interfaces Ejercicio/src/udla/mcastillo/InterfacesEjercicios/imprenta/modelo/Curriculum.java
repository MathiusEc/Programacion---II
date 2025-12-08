package udla.mcastillo.InterfacesEjercicios.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja{

    /** Atributos de la Clase*/
    private String persona;
    private String carrera;
    private List<String> experiencia;

    /** Herencia del Constrcutor*/
    public Curriculum(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    // Metodo para llenar la lista
    public Curriculum addExperience(String exp){
        experiencia.add(exp);
        return this;
        // programacion recursiva
        // se llama a la misma clase
        // retorna el mismo objeto
        // esto se conoce como encadenamiento de metodos ( method chaining)
        // se lo aplica en los patrones de diseño fluente ( fluent design patterns)
    }

    /** Herencia del metodo abstracto*/

    // Metodo clasico sin string builder
    @Override
    public String imprimir() {
        String resultado = this.persona + "\n" +
                "Profesion: " + this.carrera + "\n" +
                "Resumen: " + this.contenido + "\n";

        for (String exp : this.experiencia){
            resultado += "- " + exp + "\n";
            // Concatenacion de cadenas
            // por ejemplo resultado = resultado + "- " + exp + "\n";
        }
        return resultado;
    }


    /***
     *  Metodo con String Builder
     *  @Override
     *     public String imprimir() {
     *         StringBuilder sb = new StringBuilder(); // Metodo para construir cadenas, y concatenar
     *         sb.append(this.persona).append("\n")
     *                 .append("Profesion: ").append(this.carrera).append("\n")
     *                 .append("Resumen: ").append(this.contenido).append("\n");
     *
     *         for (String exp : this.experiencia){
     *             sb.append("- ").append(exp).append("\n");
     *         }
     *         return sb.toString(); // Transformar a cadenas de caracteres
     *     }
     *
     */
}
