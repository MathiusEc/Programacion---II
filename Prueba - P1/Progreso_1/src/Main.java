/*
 * Programación II - Examen del Progreso
 * Proyecto: AppStore de Juegos
 *
 * Descripción General:
 * Se construye una aplicación para manejar una AppStore que gestiona 4 juegos.
 * Cada juego tiene nombre único, categoría (rompecabezas, acción o deporte), tamaño en KB,
 * precio en pesos, cantidad de licencias disponibles y vendidas.
 *
 * Funcionalidades principales:
 * 1. Visualizar información detallada de cada juego.
 * 2. Comprar licencias de un juego.
 * 3. Vender licencias de un juego.
 * 4. Consultar el juego más vendido.
 * 5. Consultar descuentos aplicados por volumen de compra.
 * 6. Salir del programa.
 *
 * Promociones vigentes:
 * - Promoción 1: Si se compran al menos 25 licencias de juegos de rompecabezas, se aplica 20% de descuento.
 * - Promoción 2: Si se compran al menos 20 licencias de deportes y 15 de acción, se aplica 15% de descuento.
 * - Si se cumplen ambas condiciones, se aplica solo la primera que se cumpla.
 *
 * Políticas de compra automática:
 * - Política porcentaje: Se deben comprar licencias si la cantidad actual es menor al 25% de las licencias del juego menos vendido.
 * - Política categoría:
 *    - Juegos de deporte y aventura: comprar si hay menos de 10 licencias.
 *    - Juegos de acción y velocidad: comprar si hay menos de 15 licencias.
 *
 * Requisitos específicos:
 * 1. Declarar constantes en AppStore para el porcentaje (25%) y límites por categoría (10 y 15).
 * 2. Método darJuegoMenosVendido(): retorna nombre del juego con menos licencias vendidas o "NINGUNO".
 * 3. Método darComprasPorPorcentaje(): retorna nombres de juegos con licencias por debajo del 25% del menos vendido o "NINGUNO".
 * 4. Modificar metodo1(): mostrar mensaje con juegos que deben comprarse según política porcentaje.
 * 5. Método seDebeComprarPorCategoria(String nombre): retorna true si el juego debe comprarse según su categoría.
 * 6. Modificar metodo2(): mostrar juegos que deben comprarse según política categoría o "NINGUNO".
 *
 * Rubrica de evaluación:
 * - Objetos correctamente creados: 1 punto
 * - Menú y estructura de casos: 0.5 puntos
 * - Visualización de juegos: 0.5 puntos
 * - Compra de licencias: 1 punto
 * - Venta de licencias: 1 punto
 * - Juego más vendido: 0.5 puntos
 * - Descuentos por volumen: 0.5 puntos
 * - Constantes y políticas adicionales: 3.5 puntos
 *
 * Consideraciones:
 * - Se debe usar lógica condicional para aplicar promociones.
 * - Se debe validar existencia de juegos por nombre.
 * - Se debe mantener claridad en la interfaz y modularidad en el código.
 */


public class Main {
    public static void main(String[] args) {
    }
}