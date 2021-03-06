package br.com.caelum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() {
        Connection con = null;

        try {
            //Linha necessária para conexões em JSP
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost/fj21?useTimezone=true&serverTimezone=UTC", "root", "");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return con;
    }
}
