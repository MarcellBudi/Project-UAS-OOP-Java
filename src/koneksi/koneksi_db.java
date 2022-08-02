/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 
import javax.swing.JOptionPane;
/**
 *
 * @author Arikusuma
 */
public class koneksi_db {
    private static Connection conn;
    public static Connection getKoneksi(){
        String host="jdbc:mysql://localhost/dbgudang",
                user="root",
                pass="";
        try{
            conn=(Connection) DriverManager.getConnection(host,user,pass);
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
        return conn; 
    }
}
