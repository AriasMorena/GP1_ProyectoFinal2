/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Sala;
import java.sql.Connection;
import Entidades.conexion;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author arias
 */
public class SalaData {
    
    private Connection con = null;
    
    public SalaData (){
    
        con = conexion.getConexion();   
    }
    
    public void crearSala (Sala sala) {
    
        String sql = "INSERT INTO sala (NroSala, apta3D, capacidad, estado)" + "VALUES(?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, sala.getNroSala());
            ps.setBoolean(2, sala.isApta3D());
            ps.setInt(3, sala.getCapacidad());
            ps.setString(4, sala.getEstado());
            int exito =  ps.executeUpdate();
            
            if (exito == 1){
            
            JOptionPane.showMessageDialog(null, "Sala creada correctamente.");       
          }  
            
        } catch (SQLException ex) {
         
            JOptionPane.showMessageDialog(null, "Error al crear la sala." + ex.getMessage());
        }  
    }
    
    public Sala buscarSala (int id_sala){
        
        Sala sala = null;
        
        String sql = "SELECT * FROM sala WHERE id_sala = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_sala);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                
                sala = new Sala();
                
                sala.setNroSala(rs.getInt("NroSala"));
                sala.setApta3D(rs.getBoolean("apta3D"));
                sala.setCapacidad(rs.getInt("capacidad"));
                sala.setEstado(rs.getString("estado"));
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la sala" + ex.getMessage());
        }
        return sala;
    }
    
    public void borrarSala (int id_sala){
        
        String sql = "DELETE FROM sala WHERE id_sala = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_sala);
            int exito = ps.executeUpdate();
            
            if (exito == 1){
            
                JOptionPane.showMessageDialog(null, "Sala borrada con exito.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar la sala" + ex.getMessage());
        }  
    
    }
    
    public void modificarSala (int id_sala){
        
        String sql = "UPDATE sala SET NroSala = ?, apta3D = ?, capacidad = ?, estado = ? WHERE id_sala = ?";
        
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_sala);
            
            int filas = ps.executeUpdate();
            
            if(filas > 0){
            
                JOptionPane.showMessageDialog(null, "Sala modificada exitosamente.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al modificar la sala." + ex.getMessage());  
        }  
    }
      
}

