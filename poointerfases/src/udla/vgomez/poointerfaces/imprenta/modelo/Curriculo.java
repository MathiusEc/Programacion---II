package udla.vgomez.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Curriculo - Representa un currículum vitae
 * Hereda de Hoja e implementa la interfaz Desplegar
 *
 * FUNCIONALIDAD:
 * - Almacena información personal (nombre, profesión)
 * - Mantiene una lista dinámica de conocimientos/habilidades
 * - Formatea e imprime un CV completo
 *
 * ¿POR QUÉ HEREDA DE HOJA?
 * - Porque un currículum ES-UNA hoja de papel con contenido
 * - Reutiliza el atributo 'contenido' para el encabezado del CV
 * - Aprovecha la estructura común de todas las hojas
 *
 * ¿POR QUÉ IMPLEMENTA DESPLEGAR?
 * - Para que pueda ser tratado polimórficamente con otros objetos imprimibles
 * - Cumple con el contrato de tener un método imprimir()
 * - Permite que sea usado en colecciones de objetos Desplegar
 *
 * DISEÑO:
 * - Combina herencia (extends Hoja) con implementación de interfaz (implements Desplegar)
 * - Java permite esto: una clase puede heredar de UNA clase e implementar MÚLTIPLES interfaces
 */
public class Curriculo extends Hoja implements Desplegar{
    // Datos personales del currículum
    private String persona;
    private String profesion;

    // Lista dinámica para almacenar los conocimientos
    private List<String> conocimiento;

    /**
     * Constructor que inicializa el currículum
     * @param persona Nombre de la persona
     * @param profesion Profesión de la persona
     * @param contenido Contenido heredado de la clase Hoja
     */
    public Curriculo(String persona, String profesion, String contenido) {
        super(contenido); // Llama al constructor de la clase padre Hoja
        this.persona = persona;
        this.profesion = profesion;
        this.conocimiento = new ArrayList<>();
    }

    /**
     * Método que implementa el patrón Builder
     * Permite encadenar llamadas: cv.addConocimiento("Java").addConocimiento("Python")
     * @param con Conocimiento a agregar
     * @return La instancia actual para permitir encadenamiento
     *
     * PATRÓN BUILDER:
     * - Facilita la construcción fluida de objetos
     * - Hace el código más legible y expresivo
     * - Retorna 'this' para permitir encadenamiento
     */
    public Curriculo addConocimiento(String con){
        conocimiento.add(con);
        return this; // Retorna this para permitir el encadenamiento de métodos
    }

    /**
     * Implementación del método abstracto de Hoja e interfaz Desplegar
     * Formatea el currículum en un String con toda la información
     *
     * SOBRESCRITURA (@Override):
     * - Cumple con el contrato de la interfaz Desplegar
     * - Proporciona la implementación concreta del método abstracto de Hoja
     * - Define CÓMO se imprime específicamente un currículum
     */
    @Override
    public String imprimir() {
        // StringBuilder es más eficiente que concatenar Strings
        StringBuilder sb = new StringBuilder("Nombre : ");
        sb.append(this.persona).append("\n")
                .append("Profesion : ").append(this.profesion).append("\n")
                .append("Resumen de conocimientos").append("\n").append(contenido).append("\n");

            // Itera sobre la lista de conocimientos usando for-each
            for(String con:this.conocimiento){
                sb.append("- ").append(con).append("\n");
            }

        return sb.toString();
    }
}
