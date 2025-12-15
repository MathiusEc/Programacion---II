// JDBC (Java Database Connectivity) is a Java API that allows connecting and executing operations on databases
// To use JDBC with MySQL we need the MySQL Connector (a driver that translates JDBC calls to MySQL commands)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Utilidades Class - Manages the connection and operations with MySQL database
 * Uses JDBC to connect to MySQL through the MySQL Connector/J (driver)
 */
public class Utilidades {

    /**
     * Establishes the connection with the MySQL database
     * @return Connection - object representing the DB connection, or null if it fails
     */
    public Connection getConnection(){
        // Connection URL: jdbc:mysql://[host]:[port]/[database_name]
        // - jdbc:mysql:// indicates we use JDBC protocol with MySQL
        // - localhost:3306 is where the MySQL server is located (default port 3306)
        // - ejemplojdbc is the database name
        String url = "jdbc:mysql://localhost:3306/ejemplojdbc";

        // MySQL access credentials
        String user = "root";        // MySQL username
        String passwd = "sasa";      // MySQL password

        Connection conn = null;      // 'connection' object initialized to null

        try{
                // DriverManager is the JDBC class that manages database drivers
                // getConnection() uses the MySQL Connector to establish the connection
                conn = DriverManager.getConnection(url, user, passwd);
                return conn;
        } catch (Exception ex){
                    // If there's a connection error (DB down, wrong credentials, etc.)
                    ex.printStackTrace();
        }
        return null;
    }

    /**
     * Inserts a new client into the 'cliente' table in the database
     * @param cliente - Cliente object with the data to insert
     * @param conn - active connection to the database
     */
    public void insetarDatos(Cliente cliente, Connection conn){
        // SQL with parameters (?) to prevent SQL injection
        String sql = "INSERT INTO cliente (nombre, apellido, correo, identificacion) VALUES (?,?,?,?)";
        try{
            // PreparedStatement is a JDBC interface for executing parameterized SQL queries
            // It's safer than Statement because it prevents SQL injection
            PreparedStatement ps =conn.prepareStatement(sql);

            // We replace each ? with the values from the cliente object
            // Indices start at 1 (not 0)
            ps.setString(1,cliente.getNombre());           // First ?
            ps.setString(2,cliente.getApellido());         // Second ?
            ps.setString(3,cliente.getCorreo());           // Third ?
            ps.setString(4,cliente.getIdentidicacion());   // Fourth ?

            // executeUpdate() executes INSERT, UPDATE or DELETE queries
            // Returns the number of affected rows
            int resultado = ps.executeUpdate();

            if(resultado > 0 ){
                System.out.println("The client has been inserted successfully..");
            }else {
                System.out.println("The client was not inserted..");
            }

        } catch(Exception ex){
            // Catches errors like: table doesn't exist, incorrect fields, etc.
            ex.printStackTrace();
        }
    }
}
