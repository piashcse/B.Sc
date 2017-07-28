/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import java.awt.Stroke;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import result.DatabaseConnection;
/**
 *
 * @author johir
 */
public class Login_ser extends HttpServlet {

    
   

    public Login_ser() {
    }
    
    Connection conn;
    Statement sat;
    ResultSet res;

    String name1, pass1,add1,add2;
    String sql;

    DatabaseConnection dbconn;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        PrintWriter out = response.getWriter();
        pass1 = request.getParameter("pass");
        name1 = request.getParameter("name");

        try {

            sql = "Select * from admin where name='" +name1+ "'";

            dbconn = new DatabaseConnection();
            conn = dbconn.setConnection();
            res = dbconn.getResult(sql, conn);

            if (res.next()) {
                add1 = res.getString("name");

                add2 = res.getString("password");
                

               
            }

        } catch (Exception e) {

        }
        
          if(( name1.equals(add1)) && (pass1.equals(add2)) ){  
            out.print("Welcome, "+name1);  
        HttpSession session=request.getSession();  
        session.setAttribute("name",name1);  
        
          
        
         RequestDispatcher rd =request.getRequestDispatcher("/insert.jsp");
                rd.forward(request, response);
        }  
        else{  
            
            
              String dd="Invaild Name and Password";
            request.setAttribute("login_show",dd);
            RequestDispatcher rd =request.getRequestDispatcher("/login.jsp");
                rd.forward(request, response);  
        }  
        

        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
