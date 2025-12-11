package udla.vgomez.poointerfaces.imprenta.modelo;

/**
 * Interfaz Desplegar - Define el contrato para objetos imprimibles
 *
 * ¿POR QUÉ ES UNA INTERFAZ?
 * - Es una interfaz porque define un comportamiento común (imprimir) que puede ser
 *   implementado de diferentes maneras por distintas clases
 * - No contiene implementación, solo la firma del método
 * - Permite polimorfismo: podemos tratar diferentes tipos de objetos (Libro, Informe,
 *   Curriculo, Pagina) de manera uniforme
 *
 * FUNCIONALIDAD:
 * - Establece un "contrato" que obliga a todas las clases que la implementen
 *   a proporcionar su propia versión del método imprimir()
 * - Permite que el código cliente (como EjemploImprenta) trabaje con cualquier
 *   objeto imprimible sin conocer su tipo específico
 *
 * VENTAJAS DE USAR INTERFAZ:
 * - Desacoplamiento: el código no depende de implementaciones concretas
 * - Flexibilidad: podemos agregar nuevas clases imprimibles sin modificar código existente
 * - Java permite implementar múltiples interfaces (no así con herencia de clases)
 */

public interface Desplegar {
    /**
     * Método que debe ser implementado por todas las clases
     * que implementen esta interfaz
     * @return String con el contenido formateado para imprimir
     */
    public String imprimir();

}
