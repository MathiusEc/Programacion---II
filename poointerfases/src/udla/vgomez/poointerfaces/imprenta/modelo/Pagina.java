package udla.vgomez.poointerfaces.imprenta.modelo;

/**
 * Clase Pagina - Representa una página individual de un libro
 * Hereda de Hoja e implementa Desplegar
 *
 * FUNCIONALIDAD:
 * - Es la unidad más básica de contenido imprimible
 * - Simplemente almacena y retorna su contenido sin formato adicional
 * - Sirve como componente en la estructura composite del Libro
 *
 * ¿POR QUÉ HEREDA DE HOJA?
 * - Una página ES-UNA hoja de papel con contenido
 * - Es la implementación más simple de Hoja
 * - Hereda el atributo 'contenido' que es todo lo que necesita
 *
 * ¿POR QUÉ IMPLEMENTA DESPLEGAR?
 * - Para poder ser agregada a un Libro (que espera objetos Desplegar)
 * - Para poder ser impresa de forma uniforme
 * - Cumple con el contrato del sistema de impresión
 *
 * SIMPLICIDAD:
 * - Es la implementación más directa: solo retorna su contenido
 * - No añade formato, encabezados ni metadatos
 * - Demuestra que diferentes implementaciones pueden tener
 *   diferentes niveles de complejidad
 */
public class Pagina extends Hoja implements Desplegar{

    /**
     * Constructor que inicializa una página con su contenido
     * @param contenido Texto de la página
     */
    public Pagina(String contenido) {
        super(contenido); // Llama al constructor de la clase padre Hoja
    }

    /**
     * Implementación del método abstracto de Hoja
     * Simplemente retorna el contenido de la página sin formato adicional
     *
     * IMPLEMENTACIÓN MINIMALISTA:
     * - No añade etiquetas, títulos ni formato
     * - Es puro contenido
     * - Ideal para páginas que son parte de un libro (el libro añade el formato)
     */
    @Override
    public String imprimir() {
        return this.contenido;
    }
}
