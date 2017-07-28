/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;
/**
 *
 * @author johir
 */
public class DatabaseConnection {
 
   public Statement stmt;
   public ResultSet res;
   public Connection conn;
   
   public DatabaseConnection(){
       
   }
   
   
   public Connection setConnection(){
       
       try{
           Class.forName("org.postgresql.Driver");
           conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/project", "postgres",
					"piash");
       }
       catch(Exception e){
          e.printStackTrace();
       }
       
       return conn;
   }
   
   public ResultSet getResult(String query, Connection conn){
       this.conn = conn;
       
       try{
           stmt = conn.createStatement();
           res = stmt.executeQuery(query);
       }
       catch(Exception e){
           
       }
       return res;
   }
    
    
    
}
