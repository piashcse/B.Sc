/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.json.Json;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import result.DatabaseConnection;

/**
 * REST Web Service
 *
 * @author Mehedi Hassan Piash
 */
@Path("generic")
public class GenericResource {

     String name1, pass1,add1,add2;
      String personInJson;
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of api.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    
    
    public void getJson() {
     
       
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @POST
    @Consumes("application/json")
    public String postJson(String content) {
        
        Connection conn;
    Statement sat;
    ResultSet res;

   
    String sql;

    DatabaseConnection dbconn;
    try {

       // String piash = "8";
            sql = "Select * from result where roll='" +content+ "'";

            dbconn = new DatabaseConnection();
            conn = dbconn.setConnection();
            res = dbconn.getResult(sql, conn);

            if (res.next()) {
                add1 = res.getString("name");

                add2 = res.getString("gpa");

               
            }
            //return add1 + "," + add2;
           return personInJson = new Gson().toJson(add1 +","+ add2);

        } catch (Exception e) {
            return null;
        }

    }  
    
}
