package udla.vgomez.poointerfaces.imprenta.modelo;

/**
 * Clase Informe - Representa un informe o reporte
 * Hereda de Hoja e implementa la interfaz Desplegar
 *
 * FUNCIONALIDAD:
 * - Representa documentos formales con autor y revisor
 * - Mantiene la trazabilidad de quién creó y revisó el documento
 * - Formatea informes con estructura estándar
 *
 * ¿POR QUÉ HEREDA DE HOJA?
 * - Un informe ES-UNA hoja de documento con contenido
 * - Hereda el atributo 'contenido' para el cuerpo del informe
 * - Comparte la estructura base con otros tipos de hojas
 *
 * ¿POR QUÉ IMPLEMENTA DESPLEGAR?
 * - Para ser tratado polimórficamente junto a otros documentos imprimibles
 * - Debe proporcionar su propia implementación del método imprimir()
 * - Permite que sea procesado por código genérico que trabaje con Desplegar
 *
 * VENTAJA DEL DISEÑO:
 * - Reutiliza código de Hoja (herencia)
 * - Se integra con el sistema de impresión (interfaz)
 * - Mantiene sus propios atributos específicos (autor, revisor)
 */
public class Informe extends Hoja implements Desplegar{

    /** Atributos*/
    // Persona que escribió el informe
    private String autor;
    // Persona que revisó el informe
    private String revisor;


    /**
     * Contructor que inicializa un informe
     * @param autor Quien escribió el informe
     * @param revisor Quien revisó el informe
     * @param contenido Contenido del informe (heredado de Hoja)
     */
    public Informe(String autor, String revisor, String contenido) {
        super(contenido); // Invoca al constructor de la clase padre
        this.autor = autor;
        this.revisor = revisor;
    }

    /**
     * Implementación del método abstracto heredado de Hoja
     * Define cómo se imprime un informe con formato específico
     *
     * IMPLEMENTACIÓN ESPECÍFICA:
     * - Cada clase hija de Hoja define su propio formato
     * - Informe muestra autor, revisor y contenido
     * - Formato simple y directo para documentos formales
     */
    @Override
    public String imprimir() {
        return "Informe escrito  por : " + this.autor + "\n" +
               "Informe revisado por : " + this.revisor + "\n" +
               this.contenido ;
    }
}
