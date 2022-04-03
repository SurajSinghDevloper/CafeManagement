/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
/**
 *
 * @author suraj
 */
public class ConnctionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
//            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false","suraj","8988");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false","root","8988");  
            return con;
        }
         catch(Exception e){
         return null;
           }
    }
}
