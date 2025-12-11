package udla.vgomez.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Libro - Representa un libro compuesto por múltiples páginas
 * Implementa SOLO la interfaz Desplegar (NO hereda de Hoja)
 *
 * FUNCIONALIDAD:
 * - Actúa como contenedor de páginas
 * - Mantiene metadatos del libro (título, autor, género)
 * - Imprime el libro completo incluyendo todas sus páginas
 *
 * ¿POR QUÉ NO HEREDA DE HOJA?
 * - Un libro NO ES una hoja simple, es una COLECCIÓN de hojas
 * - No necesita el atributo 'contenido' de Hoja
 * - Su estructura es más compleja: contiene múltiples objetos Desplegar
 *
 * ¿POR QUÉ SÍ IMPLEMENTA DESPLEGAR?
 * - Para que pueda ser impreso junto con otros documentos
 * - Mantiene la uniformidad: todo lo imprimible implementa Desplegar
 * - Permite polimorfismo: un Libro puede ser tratado como Desplegar
 *
 * PATRÓN COMPOSITE:
 * - Libro es un "composite" que contiene objetos "component" (Desplegar)
 * - Puede contener páginas individuales u otros objetos imprimibles
 * - Al imprimir, delega a cada página su propia impresión
 * - Demuestra la potencia de las interfaces: Libro no necesita saber
 *   el tipo concreto de sus páginas, solo que implementan Desplegar
 */
public class Libro implements Desplegar{
    // Lista de objetos que implementan Desplegar (pueden ser Páginas u otros)
    private List<Desplegar> paginas;
    private String autor;
    private String titulo;
    private Genero genero; // Enum que define el género del libro

    /**
     * Constructor que inicializa un libro
     * @param autor Autor del libro
     * @param titulo Título del libro
     * @param genero Género literario del libro
     */
    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    /**
     * Método que implementa el patrón Builder
     * Añade una página al libro y retorna el libro para permitir encadenamiento
     * @param pagina Objeto que implementa Desplegar (normalmente una Pagina)
     * @return La instancia actual del libro para encadenamiento
     *
     * FLEXIBILIDAD DEL DISEÑO:
     * - Acepta cualquier objeto Desplegar, no solo Pagina
     * - Podría contener otros Libros, Informes, etc. (composición recursiva)
     * - La interfaz Desplegar hace esto posible
     */
    public Libro addPagina(Desplegar pagina){
        paginas.add(pagina);
        return this; // Permite encadenar: libro.addPagina().addPagina()
    }

    /**
     * Implementación del método de la interfaz Desplegar
     * Imprime el libro completo con todas sus páginas
     *
     * POLIMORFISMO EN ACCIÓN:
     * - Itera sobre la lista de objetos Desplegar
     * - Llama al método imprimir() de cada uno sin conocer su tipo específico
     * - Cada objeto se imprime según su propia implementación
     * - Esto es el poder del polimorfismo: mismo método, comportamiento diferente
     */
    @Override
    public String imprimir(){
        // Uso de StringBuilder para construir el String de manera eficiente
        StringBuilder sb = new StringBuilder("Titulo : ");
        sb.append(this.titulo).append("\n")
                .append("Autor  : ").append(this.autor).append("\n")
                .append("Genero : ").append(genero).append("\n");

        // Itera sobre cada página y llama polimórficamente a su método imprimir()
        for(Desplegar pag:this.paginas ){
            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
