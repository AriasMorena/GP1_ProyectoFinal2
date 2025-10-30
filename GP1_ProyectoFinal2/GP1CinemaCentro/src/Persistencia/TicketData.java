/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Ticket;
import java.sql.Connection;
import Entidades.conexion;
import java.sql.SQLException;
import java.sql.PreparedStatement;


/**
 *
 * @author arias
 */
public class TicketData {
    
    private Connection con = null;
    
    public TicketData (){
    
        con = conexion.getConexion();    
    }
    /*
    public void generarTicket (Ticket ticket) {
        
        String sql = "INSERT INTO ticket_ compra (fechaCompra, fechaFuncion, monto, dni)" + "VALUES(?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.set
            
            
            
        } catch (SQLException ex) {
            
        }
    }
*/
}
