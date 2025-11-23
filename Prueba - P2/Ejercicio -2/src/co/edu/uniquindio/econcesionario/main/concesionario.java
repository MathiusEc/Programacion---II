package co.edu.uniquindio.econcesionario.main;

import co.edu.uniquindio.econcesionario.clases.VehiculoNuevo;
import co.edu.uniquindio.econcesionario.clases.VehiculoUsado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Funcionalidades requeridas:
 *
 *     Crear un concesionario que maneje hasta 50 vehículos
 *
 *     Calcular impuesto según tipo:
 *
 *         Usado: precio * 0.05 + (kilometraje/10000 * 1000)
 *
 *         Nuevo: precio * 0.10 (si incluyeSeguro: -50000)
 *
 *     Buscar vehículo por placa
 *
 *     Listar vehículos por tipo
 *
 *     Mostrar vehículo más caro
 *
 * Paquete: co.edu.uniquindio.concesionario
 *
 *
 * UML
 *                     ┌─────────────────┐
 *                     │    Vehiculo     │
 *                     ├─────────────────┤
 *                     │ - placa: String │
 *                     │ - marca: String │
 *                     │ - modelo: int   │
 *                     │ - precio: double│
 *                     ├─────────────────┤
 *                     │ + calcularImpuesto(): double│
 *                     └─────────────────┘
 *                             △
 *              ┌──────────────┼──────────────┐
 *              │                             │
 * ┌─────────────────────────┐    ┌─────────────────────────┐
 * │       VehiculoUsado     │    │      VehiculoNuevo      │
 * ├─────────────────────────┤    ├─────────────────────────┤
 * │ - kilometraje: int      │    │ - garantia: int         │
 * │ - añoFabricacion: int   │    │ - incluyeSeguro: boolean│
 * ├─────────────────────────┤    ├─────────────────────────┤
 * │ + calcularImpuesto(): double││ + calcularImpuesto(): double│
 * └─────────────────────────┘    └─────────────────────────┘
 *
 * */

public class concesionario {
    /** Declaración de Objetos*/
    private static Scanner sc = new Scanner(System.in);
    private static List<VehiculoNuevo> listavehiculosNuevos = new ArrayList<>();
    private static List<VehiculoUsado> listavehiculosUsados = new ArrayList<>();

    public static void main(String[] args) {
        int opc;
        do {
            mostrarMenu();
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1:
                    agregarVehiculoNuevo();
                    break;
                case 2:
                    agregarVehiculoUsado();
                    break;
                case 3:
                    buscarVehiculoPorPlaca();
                    break;
                case 4:
                    listarVehiculosPorTipo();
                    break;
                case 5:
                    mostrarVehiculoMasCaro();
                    mostrarVehiculoMasBarato();
                    break;
                case 6:
                    eliminarVehiculoPorPlaca();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opc != 7);
    }

    /** Métodos de la clase*/

    // Menu
    private static void mostrarMenu() {
        System.out.println("----- Menú del Concesionario -----");
        System.out.println("1. Agregar Vehículo Nuevo");
        System.out.println("2. Agregar Vehículo Usado");
        System.out.println("3. Buscar Vehículo por Placa");
        System.out.println("4. Listar Vehículos por Tipo");
        System.out.println("5. Mostrar Vehículo Más Caro y Barato");
        System.out.println("6. Eliminar Vehículo por Placa");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Agregar Vehículo Nuevo
    private static void agregarVehiculoNuevo() {
        System.out.println("--- Agregar Vehículo Nuevo ---");
        System.out.println("Ingerese la placa del vehículo:");
        String placa = sc.nextLine();
        System.out.println("Ingerese la marca del vehículo:");
        String marca = sc.nextLine();
        System.out.println("Ingerese el modelo del vehículo:");
        int modelo = Integer.parseInt(sc.nextLine());
        System.out.println("Ingerese el precio del vehículo:");
        double precio = Double.parseDouble(sc.nextLine());
        System.out.println("Ingerese la garantía del vehículo (en meses):");
        int garantia = Integer.parseInt(sc.nextLine());
        System.out.println("¿Incluye seguro? (true/false):");
        boolean incluyeSeguro = Boolean.parseBoolean(sc.nextLine());
        // parseBoolean convierte un String a boolean
        // Si el String es "true" (ignorando mayúsculas/minúsculas), devuelve true; de lo contrario, devuelve false.
        // si escribo hola devuelve false

        VehiculoNuevo nuevo = new VehiculoNuevo(placa, marca, modelo, precio, garantia, incluyeSeguro);
        listavehiculosNuevos.add(nuevo);
        System.out.println("Vehículo nuevo agregado exitosamente.");
    }

    // Agregar Vehículo Usado
    private static void agregarVehiculoUsado() {
        System.out.println("--- Agregar Vehículo Usado ---");
        System.out.println("Ingerese la placa del vehículo:");
        String placa = sc.nextLine();
        System.out.println("Ingerese la marca del vehículo:");
        String marca = sc.nextLine();
        System.out.println("Ingerese el modelo del vehículo:");
        int modelo = Integer.parseInt(sc.nextLine());
        System.out.println("Ingerese el precio del vehículo:");
        double precio = Double.parseDouble(sc.nextLine());
        System.out.println("Ingerese el kilometraje del vehículo:");
        int kilometraje = Integer.parseInt(sc.nextLine());
        System.out.println("Ingerese el año de fabricación del vehículo:");
        int añoFabricacion = Integer.parseInt(sc.nextLine());

        VehiculoUsado usado = new VehiculoUsado(placa, marca, modelo, precio, kilometraje, añoFabricacion);
        listavehiculosUsados.add(usado);
        System.out.println("Vehículo usado agregado exitosamente.");
    }

    // Buscar Vehículo por Placa
    private static void buscarVehiculoPorPlaca() {
        System.out.println("--- Buscar Vehículo por Placa ---");
        System.out.println("Ingrese la placa del vehículo a buscar:");
        String placaBuscada = sc.nextLine();
        boolean encontrado = false;

        for (VehiculoNuevo nuevo : listavehiculosNuevos) {
            if (nuevo.getPlaca().equalsIgnoreCase(placaBuscada)) {
                System.out.println("Vehículo Nuevo Encontrado: " + nuevo.getMarca() + " - " + nuevo.getModelo());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            for (VehiculoUsado usado : listavehiculosUsados) {
                if (usado.getPlaca().equalsIgnoreCase(placaBuscada)) {
                    System.out.println("Vehículo Usado Encontrado: " + usado.getMarca() + " - " + usado.getModelo());
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Vehículo con placa " + placaBuscada + " no encontrado.");
        }
    }

    // Listar Vehículos por Tipo
    private static void listarVehiculosPorTipo() {
        System.out.println("--- Listar Vehículos por Tipo ---");
        System.out.println("Vehículos Nuevos:");
        for (VehiculoNuevo nuevo : listavehiculosNuevos) {
            System.out.println(nuevo.getMarca() + " - " + nuevo.getModelo() + " - Precio: " + nuevo.getPrecio());
            System.out.println("Impuesto: " + nuevo.calcularImpuesto());
            System.out.println("Incluye Seguro: " + nuevo.isIncluyeSeguro()); // Mostrar si incluye seguro, is porque es boolean y devuelve true o false
        }

        System.out.println("Vehículos Usados:");
        for (VehiculoUsado usado : listavehiculosUsados) {
            System.out.println(usado.getMarca() + " - " + usado.getModelo() + " - Precio: " + usado.getPrecio());
            System.out.println("Impuesto: " + usado.calcularImpuesto());
            System.out.println("Kilometraje: " + usado.getKilometraje());
            System.out.println("Año de Fabricación: " + usado.getAñoFabricacion());
        }
    }

    // Mostrar Vehículo Más Caro
    private static void mostrarVehiculoMasCaro() {
        System.out.println("--- Mostrar Vehículo Más Caro ---");
        // Inicializar variables de tipo Vehiculos nuevo y usado para rastrear el vehículo más caro
        VehiculoNuevo vehiculoMasCaroNuevo = null;
        VehiculoUsado vehiculoMasCaroUsado = null;
        double precioMaximo = 0.0;

        // Buscar el vehículo nuevo más caro
        for (VehiculoNuevo nuevo : listavehiculosNuevos) {
            if (nuevo.getPrecio() > precioMaximo) {
                precioMaximo = nuevo.getPrecio();
                vehiculoMasCaroNuevo = nuevo;
                vehiculoMasCaroUsado = null; // Reiniciar el vehículo usado más caro
            }
        }
        // Buscar el vehículo usado más caro
        for (VehiculoUsado usado : listavehiculosUsados) {
            if (usado.getPrecio() > precioMaximo) {
                precioMaximo = usado.getPrecio();
                vehiculoMasCaroUsado = usado;
                vehiculoMasCaroNuevo = null;
                // Reiniciar el vehículo nuevo más caro, se iguala a null para que no haya confusión
                // osea si el usado es mas caro que el nuevo, el nuevo se reinicia a null
                // si ambos son iguales, el usado se queda como el mas caro

            }
        }

        // Mostrar el vehículo más caro encontrado
        if (vehiculoMasCaroNuevo != null) {
            System.out.println("Vehículo Nuevo Más Caro: " + vehiculoMasCaroNuevo.getMarca() +
                    " - " + vehiculoMasCaroNuevo.getModelo() + " - Precio: " + vehiculoMasCaroNuevo.getPrecio());
        } else if (vehiculoMasCaroUsado != null) {
            System.out.println("Vehículo Usado Más Caro: " + vehiculoMasCaroUsado.getMarca() +
                    " - " + vehiculoMasCaroUsado.getModelo() + " - Precio: " + vehiculoMasCaroUsado.getPrecio());
        } else {
            System.out.println("No hay vehículos en el concesionario.");

        }
    }

    // Vehiculo Más Barato
    private static void mostrarVehiculoMasBarato() {
        System.out.println("--- Mostrar Vehículo Más Barato ---");
        VehiculoNuevo vehiculoMasBaratoNuevo = null;
        VehiculoUsado vehiculoMasBaratoUsado = null;
        double precioMinimo = Double.MAX_VALUE;
        // Inicializar con el valor máximo posible
        // MAX_VALUE es una constante en la clase Double que representa el valor máximo
        // positivo que un tipo de dato double puede tener en Java.

        for (VehiculoNuevo nuevo : listavehiculosNuevos) {
            if (nuevo.getPrecio() < precioMinimo) {
                precioMinimo = nuevo.getPrecio();
                vehiculoMasBaratoNuevo = nuevo;
                vehiculoMasBaratoUsado = null;
            }
        }

        for (VehiculoUsado usado : listavehiculosUsados) {
            if (usado.getPrecio() < precioMinimo) {
                precioMinimo = usado.getPrecio();
                vehiculoMasBaratoUsado = usado;
                vehiculoMasBaratoNuevo = null;
            }
        }

        if (vehiculoMasBaratoNuevo != null) {
            System.out.println("Vehículo Nuevo Más Barato: " + vehiculoMasBaratoNuevo.getMarca() +
                    " - " + vehiculoMasBaratoNuevo.getModelo() + " - Precio: " + vehiculoMasBaratoNuevo.getPrecio());
        } else if (vehiculoMasBaratoUsado != null) {
            System.out.println("Vehículo Usado Más Barato: " + vehiculoMasBaratoUsado.getMarca() +
                    " - " + vehiculoMasBaratoUsado.getModelo() + " - Precio: " + vehiculoMasBaratoUsado.getPrecio());
        } else {
            System.out.println("No hay vehículos en el concesionario.");
        }
    }

    // Eliminar Vehículo por Placa
    private static void eliminarVehiculoPorPlaca() {
        System.out.println("--- Eliminar Vehículo por Placa ---");
        System.out.println("Ingrese la placa del vehículo a eliminar:");
        String placaEliminar = sc.nextLine();
        boolean eliminado = false;

        for (int i = 0; i < listavehiculosNuevos.size(); i++) {
            if (listavehiculosNuevos.get(i).getPlaca().equalsIgnoreCase(placaEliminar)) {
                listavehiculosNuevos.remove(i);
                eliminado = true;
                System.out.println("Vehículo Nuevo con placa " + placaEliminar + " eliminado exitosamente.");
                break;
            }
        }
    }



}