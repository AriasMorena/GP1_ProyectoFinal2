/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Asiento;
import Entidades.conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Entidades.Pelicula;

/**
 *
 * @author arias
 */
public class AsientoData {
    
        private Connection con = null;
        private PeliculaData pd = new PeliculaData();
    
    public AsientoData () {
        
        con = conexion.getConexion();   
    }
    
    public void agregarAsiento (Asiento asiento) {
    
        String sql = "INSERT INTO asiento (fila, numero, estado, id_proyeccion)" + "VALUES (?, ?, ?, ?)";
    
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, asiento.getFila());
                ps.setInt(2, asiento.getNúmero());
                ps.setBoolean(3, asiento.isDisponible());
                
                
                
            } catch (SQLException ex) {
               
            }
    
    
    }
    
}
