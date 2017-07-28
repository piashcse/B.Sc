/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import result.DatabaseConnection;

/**
 *
 * @author Mehedi Hassan Piash
 */
public class Search extends HttpServlet {

    Connection conn;
    Statement sat;
    ResultSet res;
    DatabaseConnection dbconn;

    String sql;
    String shift, semester, roll, batch, result, name;
    int roll2;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
       
        
    }
    
 


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        PrintWriter out = response.getWriter();

         roll = request.getParameter("roll");
        roll2 = Integer.parseInt(roll);
        shift = request.getParameter("shift");
        semester = request.getParameter("semester");
        batch = request.getParameter("batch");
        
        try {
           
        sql ="Select * from result where roll='" + roll2 + "'";
            
            dbconn = new DatabaseConnection();
            conn = dbconn.setConnection();
            res = dbconn.getResult(sql, conn);
          
                 
            if( res.next() ){
                
                
               result = res.getString("gpa");

               name = res.getString("name");
               roll = res.getString("roll");
               batch = res.getString("batch");
               shift = res.getString("shift");
               
               
               out.write(result);
             request.setAttribute("data1",roll);
             request.setAttribute("data2",name);
             request.setAttribute("data3",batch);
             request.setAttribute("data4",shift);
             request.setAttribute("data5",result);
             
             RequestDispatcher rd =request.getRequestDispatcher("/showresult.jsp");
               rd.forward(request, response);
            }
            
  

        } catch (Exception e) {

        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
