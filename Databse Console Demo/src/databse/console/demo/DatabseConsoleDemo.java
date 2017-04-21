/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databse.console.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author msjahid
 */
public class DatabseConsoleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String query = "insert into Customer values(553, 'Hasan Taraque', '255');";
        String DB_URL = "jdbc:mysql://127.0.0.1/FoodBank";
        String DB_USER = "root";
        String DB_PASS = "5271";
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connection Success");
            Statement statement = connection.createStatement();
           // statement.executeUpdate(query);
           query = "select * from Customer";
           ResultSet resultSet = statement.executeQuery(query);
           
           while(resultSet.next()){
               int CustomerId = resultSet.getInt("CustomerId");
               String CustomerName = resultSet.getString("CustomerName");
               System.out.printf(" %d %s\n", CustomerId, CustomerName);
           }
            //System.out.printf("%s\n",resultSet);
        } catch (SQLException ex) {
            Logger.getLogger(DatabseConsoleDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
