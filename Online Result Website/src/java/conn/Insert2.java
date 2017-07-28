/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;
import result.DatabaseConnection;

/**
 *
 * @author johir
 */
public class Insert2 extends HttpServlet {

    Connection conn;
    ResultSet res;

    int roll1;
    Float gpa1;
   
    String roll, day, evening, semester, batch, gpa, name, shift;

    String sql;

    String add1;

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
        roll = request.getParameter("roll");
        roll1 = Integer.parseInt(roll);
        
        day = request.getParameter("day");
        evening = request.getParameter("evening");
        
        batch = request.getParameter("batch");
        
        semester = request.getParameter("semester");
        
        gpa = request.getParameter("gpa");
        gpa1 = Float.parseFloat(gpa);
        
        name = request.getParameter("name");
        
                if( day.equals("")){
                
                    shift = evening;
                }
                else{
                    shift = day;
                }
    
      

                try {

                    dbconn = new DatabaseConnection();
                    conn = dbconn.setConnection();

                    sql = "Insert into result (name, roll, semester, shift, batch, gpa) values(?,?,?,?,?,?)";

                    PreparedStatement ps = conn.prepareStatement(sql);
                    
                    ps.setString(1, name);
                    ps.setInt(2, roll1);
                    ps.setString(3, semester);
                    ps.setString(4, shift);
                    ps.setString(5, batch);
                    ps.setFloat(6, gpa1);
                    ps.execute();
                    ps.close();

                    add1 = "Insert was completed";

                } catch (Exception e) {

                } finally {
                    request.setAttribute("update_show", add1);
                    RequestDispatcher rd = request.getRequestDispatcher("/insert.jsp");
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
