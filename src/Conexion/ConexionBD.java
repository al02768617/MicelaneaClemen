/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author davidramos
 */
public class ConexionBD {
    
    Connection conect = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/botanasplebes", "root", "root"); 
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
        }
        return conect;
    } 
}
