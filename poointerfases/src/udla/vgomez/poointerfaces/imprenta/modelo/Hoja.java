package udla.vgomez.poointerfaces.imprenta.modelo;

/**
 * Clase abstracta Hoja - Representa una hoja genérica de documento
 *
 * ¿POR QUÉ ES UNA CLASE ABSTRACTA?
 * - Es abstracta porque representa un concepto genérico que no tiene sentido
 *   instanciar directamente (no existe una "hoja genérica", sino hojas específicas
 *   como currículos, informes, páginas)
 * - Contiene tanto implementación (atributo contenido y constructor) como
 *   comportamiento abstracto (método imprimir())
 * - Sirve como plantilla base para que las clases hijas compartan código común
 *
 * FUNCIONALIDAD:
 * - Proporciona un atributo común (contenido) a todas las hojas
 * - Define que todas las hojas deben tener un constructor que reciba contenido
 * - Obliga a las clases hijas a implementar el método imprimir() de forma específica
 *
 * DIFERENCIA CON INTERFAZ:
 * - Puede tener atributos con estado (contenido)
 * - Puede tener métodos implementados (constructor)
 * - Permite herencia de código, no solo de contrato
 * - Solo se puede heredar de UNA clase abstracta (vs múltiples interfaces)
 *
 * CUÁNDO USAR CLASE ABSTRACTA:
 * - Cuando queremos compartir código común entre clases relacionadas
 * - Cuando hay una relación "ES-UN" clara (Curriculo ES-UNA Hoja, Informe ES-UNA Hoja)
 */
abstract public class Hoja {
    /**Atributos*/
    // Contenido de la hoja, protegido para que las clases hijas puedan acceder
    protected String contenido;

    /**Contructores*/
    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Método abstracto que obliga a las clases hijas a implementarlo
     * Cada tipo de hoja definirá cómo se imprime su contenido
     *
     * ¿POR QUÉ ES ABSTRACTO ESTE MÉTODO?
     * - Porque cada tipo de hoja tiene su propia forma de imprimirse
     * - No podemos dar una implementación genérica que funcione para todos
     */
    abstract public String imprimir();


}
