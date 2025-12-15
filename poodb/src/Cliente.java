// JDBC imports - necessary to work with databases
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Cliente Class - Represents a client in our system
 * This class is a model that corresponds to the 'cliente' table in MySQL
 * (Design pattern: JavaBean / POJO - Plain Old Java Object)
 */
public class Cliente {
    // Private attributes - represent the columns of the 'cliente' table in MySQL
    private int idcliente;              // Auto-incremental ID in the database
    private String nombre;              // Client's first name
    private String apellido;            // Client's last name
    private String correo;              // Client's email
    private String identidicacion;      // Identification (ID card, passport, etc.)

    // Empty constructor - necessary to create objects without parameters
    public Cliente() {
    }

    // Constructor with parameters - makes it easy to create clients with initial data
    public Cliente(String nombre, String apellido, String correo, String identidicacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.identidicacion = identidicacion;
    }

    // Getters and Setters - allow accessing and modifying private attributes
    // They are necessary to work with JDBC and PreparedStatement

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getIdentidicacion() {
        return identidicacion;
    }

    public void setIdentidicacion(String identidicacion) {
        this.identidicacion = identidicacion;
    }

    // toString() - useful for easily printing client data
    @Override
    public String toString() {
        return "Cliente{" +
                "idcliente=" + idcliente +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", identidicacion='" + identidicacion + '\'' +
                '}';
    }


}
