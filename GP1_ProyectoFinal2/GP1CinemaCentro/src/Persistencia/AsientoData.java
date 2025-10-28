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
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author arias
 */
public class AsientoData {
    
        private Connection con = null;
    
    public AsientoData () {
        
        con = conexion.getConexion();   
    }
    
    public void agregarAsiento (Asiento asiento) {
    
        String sql = "INSERT INTO asiento (fila, numero, estado, id_proyeccion)" + "VALUES (?, ?, ?, ?)";
    
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, asiento.getFila());
                ps.setInt(2, asiento.getNúmero());
                ps.setBoolean(3, asiento.isDisponible());
                ps.setInt(4, asiento.getProyeccion().getIdProyeccion());
                int exito = ps.executeUpdate();
                
                if (exito == 1){
                
                   JOptionPane.showMessageDialog(null, "Asiento agregado exitosamente.");
                }
                              
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"Error al agregar el asiento." + ex.getMessage());
            }
    }
    
    public void modificarAsiento (int id_asiento){
    
        String sql = "UPDATE asiento SET fila = ?, numero = ?, estado = ?, id_proyeccion = ? WHERE id_lugar = ?";
        
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id_asiento);
                
                int filas = ps.executeUpdate();
                
                if(filas > 0){
                
                    JOptionPane.showMessageDialog(null, "Asiento modificado exitosamente.");    
                }
                
            } catch (SQLException ex) {
               
                JOptionPane.showMessageDialog(null, "Error al modificar el asiento" + ex.getMessage());
            }  
    }
    
    public Asiento buscarAsiento (int id_lugar) {
    
        Asiento asiento = null;
        
        String sql = "SELECT * FROM asiento WHERE id_lugar = ?";
        
        try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id_lugar);
        ResultSet rs = ps.executeQuery();
                
        if (rs.next()){
        
            asiento = new Asiento();
       
            asiento.setFila(rs.getString("fila"));
            asiento.setNúmero(rs.getInt("numero"));
            asiento.setDisponible(rs.getBoolean("estado"));
            asiento.setProyeccion(rs.getInt("id_proyeccion"));
        }
           ps.close();
        } catch (SQLException ex){
        
            JOptionPane.showMessageDialog(null, "Error al buscar el asiento." + ex.getMessage());
        }
       return asiento;
    }
    
    public void borrarAsiento (int id_lugar){
    
        String sql = "DELETE FROM asiento WHERE id_lugar = ?";
        
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id_lugar);
                int exito = ps.executeUpdate();
                
                if (exito == 1){
                    
                  JOptionPane.showMessageDialog(null, "Asiento borrado exitosamente.");
                
                }          
            } catch (SQLException ex) {
               
                JOptionPane.showMessageDialog(null, "Error al borrar el asiento." + ex.getMessage());
            }
    }
    
    public List<Asiento>listarAsientos(){
        
        List<Asiento>listarAsientos = new ArrayList<>();
    
        String sql = "SELECT * FROM asiento WHERE";
    
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                while (rs.next()){
                
                    Asiento asientos = new Asiento();
                
                    if (true){
                        
                    }                 
                    asientos.setFila(rs.getString("fila"));
                    asientos.setNúmero(rs.getInt("numero"));
                    asientos.setDisponible(rs.getBoolean("estado"));
                    asientos.setProyeccion(rs.getInt("id_proyeccion"));
                    listarAsientos.add(asientos);
                
                }
                ps.close();
            } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(null, "Error al listar las salas." + ex.getMessage());
            }
          return listarAsientos;
    }
}
