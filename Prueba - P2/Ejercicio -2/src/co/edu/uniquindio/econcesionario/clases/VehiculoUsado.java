package co.edu.uniquindio.econcesionario.clases;

public class VehiculoUsado extends Vehiculo {
    /** Declaración de Atributos de la clase vehiculo usado*/
    private int kilometraje;
    private int añoFabricacion;

    /** Constructores & Destructores*/
    public VehiculoUsado(String placa, String marca, int modelo, double precio, int kilometraje, int añoFabricacion) {
        super(placa, marca, modelo, precio);
        this.kilometraje = kilometraje;
        this.añoFabricacion = añoFabricacion;
    }

    public VehiculoUsado(String placa, String marca, int modelo, double precio) {
        super(placa, marca, modelo, precio);
    }

    public VehiculoUsado() {
    }

    /** Setters & Getters*/
    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    /** Metodos del programador*/

    // Calcular impuesto para vehiculo usado
    // Usado: precio * 0.05 + (kilometraje/10000 * 1000)
    public double calcularImpuesto(){
        return (getPrecio() * 0.05) + ((this.kilometraje / 10000) * 1000);
    }
}
