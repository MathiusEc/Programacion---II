package udla.vgomez.poointerfaces.imprenta;

import udla.vgomez.poointerfaces.imprenta.modelo.*;

/**
 * Clase principal EjemploImprenta
 * Demuestra el uso de interfaces, herencia y polimorfismo en un sistema de imprenta
 *
 * PROPÓSITO DEL EJEMPLO:
 * - Mostrar cómo diferentes tipos de documentos pueden ser tratados uniformemente
 * - Demostrar el polimorfismo: un solo método (imprime) funciona con múltiples tipos
 * - Ilustrar el desacoplamiento: el método imprime no necesita conocer los tipos específicos
 *
 * CONCEPTOS DEMOSTRADOS:
 * 1. Polimorfismo: diferentes objetos responden al mismo mensaje de diferente forma
 * 2. Interfaces: Desplegar define el contrato que todos implementan
 * 3. Herencia: Curriculo, Informe y Pagina heredan de Hoja
 * 4. Composición: Libro contiene múltiples Paginas
 * 5. Patrón Builder: encadenamiento de métodos add
 * 6. Enumeraciones: Genero restringe valores válidos
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjemploImprenta {
    public static void main(String[] args) {
        // ========== CREACIÓN DE UN CURRÍCULUM ==========
        // Creación de un objeto Curriculo con datos personales
        Curriculo cv = new Curriculo("JJ","Ing. de Software", "Detalle :");

        // Añadiendo conocimientos al currículum mediante el patrón builder
        // Cada llamada retorna 'this' permitiendo encadenar métodos
        cv.addConocimiento("Java");
        cv.addConocimiento("Spring Boot Framework");
        cv.addConocimiento("Desarrollar FullStack");
        cv.addConocimiento("Angular");

        // ========== CREACIÓN DE UN LIBRO ==========
        // Creación de un Libro con autor, título y género (usando enum)
        Libro libro = new Libro("Erich Gamma", "Patrones de diseño: Elem. Reusables de POO",Genero.PROGRAMACIÓN);

        // Añadiendo páginas al libro mediante encadenamiento de métodos (método fluido)
        // Cada Pagina implementa Desplegar, por lo que puede ser agregada al Libro
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Fascade"));


        // ========== CREACIÓN DE UN INFORME ==========
        // Creación de un Informe con autor, revisor y contenido
        Informe inf = new Informe("JJ","SR", "Microservicios Vision");

        // ========== DEMOSTRACIÓN DE POLIMORFISMO ==========
        // Imprimiendo los diferentes documentos usando polimorfismo
        // Todos los objetos implementan la interfaz Desplegar
        // El método imprime() acepta cualquier objeto Desplegar
        // Aunque son tipos diferentes (Curriculo, Informe, Libro),
        // pueden ser tratados uniformemente gracias a la interfaz
        imprime(cv);      // Imprime un Curriculo
        imprime(inf);     // Imprime un Informe
        imprime(libro);   // Imprime un Libro con sus páginas

    }

    /**
     * Método que demuestra el polimorfismo en acción
     * Recibe cualquier objeto que implemente la interfaz Desplegar
     * y llama a su método imprimir()
     *
     * POLIMORFISMO:
     * - Este método no sabe (ni le importa) el tipo específico del parámetro
     * - Puede ser Curriculo, Informe, Libro, Pagina, o cualquier clase futura
     *   que implemente Desplegar
     * - Cada objeto ejecutará su PROPIA versión de imprimir()
     * - Esto es polimorfismo: "muchas formas"
     *
     * VENTAJAS:
     * - Código genérico y reutilizable
     * - No necesita modificarse si agregamos nuevos tipos imprimibles
     * - Desacoplado de implementaciones concretas
     * - Principio Open/Closed: abierto a extensión, cerrado a modificación
     *
     * @param desplegar Cualquier objeto que implemente la interfaz Desplegar
     */
    public static void imprime(Desplegar desplegar){
        // Llamada polimórfica: el método imprimir() que se ejecuta
        // depende del tipo real del objeto en tiempo de ejecución
        System.out.println(desplegar.imprimir());
    }
}