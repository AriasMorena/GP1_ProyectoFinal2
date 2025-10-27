/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Proyeccion;
import Entidades.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.List;
/**
 *
 * @author arias
 */
public class ProyeccionData {
    
   private Connection con = null;
   
   public ProyeccionData (){
       
       con = conexion.getConexion();
   }
    
    public void guardarProyeccion (Proyeccion proyeccion, int id_pelicula, int id_sala){
       
       String sql = "INSERT INTO proyeccion (id_pelicula, id_sala, idioma, es3D, subtitulada, horaInicio, horaFin, precio)" + "VALUES (?,?,?,?,?,?,?,?)";
       
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1, id_pelicula);
           ps.setInt(2, id_sala);
           ps.setString(3, proyeccion.getIdioma());
           ps.setBoolean(4, proyeccion.isEs3D());
           ps.setBoolean(5, proyeccion.isSubtitulada());
           ps.setTime(6, proyeccion.getHoraInicio());
           ps.setTime(7, proyeccion.getHoraFin());
           ps.setDouble(8, proyeccion.getPrecioLugar());
           int exito = ps.executeUpdate();
           
           if (exito == 1){
           
           JOptionPane.showMessageDialog(null, "Proyeccion guardada exitosamente.");
           }
                  
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al guardar la proyeccion." + ex.getMessage());
       }              
   }
    
    public void actualizarProyeccion (int id_proyeccion){
        
        String sql = "UPDATE proyeccion SET idioma = ?, es3D = ?, horaInicio = ?, horaFin = ?, precio = ? WHERE id_proyeccion = ?";
            
       try {
           PreparedStatement ps = con.prepareStatement(sql); 
           ps.setInt(1, id_proyeccion);
           
           int filas = ps.executeUpdate();
           
           if(filas > 0){
           
               JOptionPane.showMessageDialog(null, "Proyeccion actualizada.");         
           }
           ps.close();
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al actualizar la proyeccion." + ex.getMessage());
       }
       
    }
    
    public void borrarProyeccion (int id_pelicula, int id_sala){
        
        String sql = "DELETE FROM proyeccion WHERE id_pelicula = ? AND id_sala = ?";
    
        try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id_pelicula);
        ps.setInt(2, id_sala);
        
        int exito = ps.executeUpdate();
        
        if (exito == 1){
        
            JOptionPane.showMessageDialog(null, "Proyeccion borrada exitosamente.");
        }
        ps.close();
        
        }catch (SQLException ex){
        
            JOptionPane.showMessageDialog(null, "Error al borrar la proyeccion." + ex.getMessage());
        }        
    }
    
    public List<Proyeccion>listarProyecciones(){
    
        ArrayList<Proyeccion>Proyecciones = new ArrayList<>();
        
        String sql = "SELECT * FROM proyeccion";
        
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
            
           while (rs.next()) {
               
             Proyeccion proyeccion = new Proyeccion();
             proyeccion.setIdioma(rs.getString("idioma"));
             proyeccion.setEs3D(rs.getBoolean("es3D"));
             proyeccion.setSubtitulada(rs.getBoolean("subtitulada"));
             proyeccion.setHoraInicio(rs.getTime("horaInicio"));
             proyeccion.setHoraFin(rs.getTime("horaFin"));
             Proyecciones.add(proyeccion);
           }
           ps.close();
           
       } catch (SQLException ex) {
           
           JOptionPane.showMessageDialog(null, "Error al listar las proyecciones." + ex.getMessage());
           
       }
       return Proyecciones;
    }
    
    public Proyeccion buscarProyeccion (int id_proyeccion) {
    
        Proyeccion proyeccion = null;
        
        String sql = "SELECT * FROM proyeccion WHERE id_proyeccion = ?";
        
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1, id_proyeccion);
           ResultSet rs = ps.executeQuery();
           
            if (rs.next()){
           
               proyeccion = new Proyeccion();
               
               proyeccion.setIdioma(rs.getString("idioma"));
               proyeccion.setEs3D(rs.getBoolean("es3D"));
               proyeccion.setSubtitulada(rs.getBoolean("subtitulada"));
               proyeccion.setHoraInicio(rs.getTime("horaInicio"));
               proyeccion.setHoraFin(rs.getTime("horaFin"));
               proyeccion.setPrecioLugar(rs.getDouble("precio"));
           }
            ps.close();
           
       } catch (SQLException ex) {
           
           JOptionPane.showMessageDialog(null, "Error al buscar la proyeccion" + ex.getMessage());
       }
       return proyeccion;
    }    
}
