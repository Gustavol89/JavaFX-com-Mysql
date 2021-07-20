package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class DatabaseMySQL implements Database {

    private Connection connection;

    @Override
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/PrimeiroProjeto", "root","root");
            return this.connection;
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("erro ao conectar ao banco de dados "+ex);
            return null;
        }
    }

    @Override
    public void desconectar(Connection connection) {
        try {
            connection.close();
        } catch (SQLException ex) {
            System.err.println("erro ao desconectar do banco de dados "+ex);
        }
    }
    
}
