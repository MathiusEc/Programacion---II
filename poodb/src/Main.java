// Necessary imports to work with JDBC
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Main Class - Entry point of the program
 * Demonstrates how to connect to MySQL and insert data using JDBC
 */
public class Main {
    public static void main(String[] args) {
            // Create an instance of Utilidades that handles the MySQL connection
            Utilidades util = new Utilidades();

            // Create a client with sample data
            Cliente cli1 = new Cliente("Pulso","Iglesias","sewersle@correo.com","9876543219");

        Connection conn = null;

        // Attempt to connect to the MySQL database
        // getConnection() uses MySQL Connector/J to establish the connection
        conn = util.getConnection();

        // Verify if the connection was successful
        if(conn != null){
            System.out.println("Connected ..!!");
            // If there's a connection, insert the client into the database
            util.insetarDatos(cli1, conn);
        }else{
            System.out.println("NOT Connected ...!!");
        }

    }

}