/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author suraj
 */
public class DbOperations {
    public static void setDataorDelete(String Query, String msg){
        try{
            Connection con= ConnctionProvider.getCon();
            System.out.println("Connection established");
            Statement st=con.createStatement();
            st.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
        }
    }
}
