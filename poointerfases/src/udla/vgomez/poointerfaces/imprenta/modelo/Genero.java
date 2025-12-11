package udla.vgomez.poointerfaces.imprenta.modelo;

/**
 * Enumeración Genero - Define los géneros literarios disponibles
 *
 * ¿QUÉ ES UN ENUM (ENUMERACIÓN)?
 * - Es un tipo especial de clase que representa un conjunto FIJO de constantes
 * - Solo puede tener los valores definidos aquí (no se pueden crear nuevos en tiempo de ejecución)
 * - Son objetos singleton: solo existe UNA instancia de cada valor
 *
 * FUNCIONALIDAD:
 * - Categoriza los libros según su género literario
 * - Restringe los valores posibles a opciones predefinidas
 * - Hace el código más seguro y legible
 *
 * ¿POR QUÉ USAR ENUM EN VEZ DE STRINGS?
 * - Seguridad de tipos: el compilador verifica que uses valores válidos
 * - Previene errores de escritura: "TERROR" vs "terror" vs "TEROR"
 * - Autocompletado en el IDE: el IDE sugiere los valores válidos
 * - Mejor rendimiento: los enums se comparan por referencia (==) no por valor (.equals)
 * - Documentación implícita: muestra todos los géneros disponibles en un solo lugar
 *
 * EJEMPLO DE USO:
 * - new Libro("Autor", "Título", Genero.PROGRAMACIÓN) ✓ Correcto
 * - new Libro("Autor", "Título", "PROGRAMACION") ✗ Error de compilación
 *
 * VENTAJAS EN ESTE PROYECTO:
 * - Garantiza que cada libro tenga un género válido
 * - Fácil de extender: solo añades una nueva constante
 * - Type-safe: imposible pasar un género inválido
 */
public enum Genero {
    DRAMA,             // Género dramático
    ACCION,            // Género de acción y aventura física
    AVENTURA,          // Género de exploración y descubrimiento
    TERROR,            // Género de miedo y suspenso
    CIENCIA_FICCION,   // Género de ciencia ficción y futurismo
    PROGRAMACIÓN       // Género específico para libros técnicos de programación
}
