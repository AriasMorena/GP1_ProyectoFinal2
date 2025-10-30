
package Persistencia;

import Entidades.Comprador;


/**
 *
 * @author arias
 */
public class CompradorData {
    
    private Connection con= null;
    
    public CompradorData(){
        con = conexion.getConexion();
    }
    
    public void guardarComprador(Comprador comprador){
         String sql = "INSERT INTO comprador (nombre, apellido, dni, email) VALUES (?,?,?,?,?) ";
         try{
             PreparedStatement ps = con.prepareStatement(sql, 
                     Statement.RETURN_GENERATED_KEYS);
              
              ps.setInt(1, comprador.getDni());
              ps.setString(2,comprador.getNombre());
              ps.setDate(3, new java.sql(comprador.getFechaNac().getTime()));
              ps.setString(4,comprador.getPassword());
              ps.setString(5,comprador.getMedioPago());
              
              ps.executeUpdate();
              ps.clase();
              JOptionPane.showMessageDialog(null, "Comprador agregado con éxito");
           }catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error al guardar comprador: " + ex.getMessage());
           }
        }
    
    public Comprador buscarComprador(int dni){
        Comprador comprador = null;
        String sql = "SELECT * FROM comprador WHERE dni =?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,dni);
            ResultSet rs= ps.executeQuery();
            
            if(rs.next()){
                comprador = new Comprador (
                        rs.getInt("dni"),
                        rs.getString("nombre"),
                        rs.getDate("fechaNac"),
                        rs.getStrting("password"),
                        rs.getString("medioPago")
                );
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró comprador con ese DNI.");
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar comprador: " + ex.getMessage());
        }
    }
    return comprador;
    
    public List<Comprador> listarCompradores(){
        List<Comprador> compradores = new ArrayList<>();
        String sql= "SELECT * FROM comprador";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.excuteQuery();
            
            while(rs.next()){
                Comprador c = new Comprador (
                    rs.getInt("dni"),
                    rs.getString("nombre"),
                    rs.getDate("fechaNac"),
                    rs.getString("password"),
                   rs.getString("medioPago")
                );
                comprador.add(c);
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al listar compradores:" + ex.getMessage());
        }
        return compradores;
    }
    
    public void actualizarComprador(Comprador comprador){
        String sql = "UPDATE comprador SET nombre =?, fechaNac = ?, password =?, medioPago =? WHERE dni =?";
        try{
            PreparedStatement ps = con.prapareStatement(sql);
            ps.setString(1,comprador.getNombre());
            ps.setDate(2, new java.sql.Date(comprador.getFechaNac().getTime()));
            ps.setString(3, comprador.getPassword());
            ps.setString(4, comprador.getDni());
            
            int filas = ps.excuteUpdate();
            if(filas > 0){
                JOptionPane.show.MessageDialog(null, "Comprador actualizado con éxito");
            } else {
                JOptionPane.show.MessageDialog(null,"No se encontro comprador con ese DNI.");
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.show.MessageDialog(null, "Error al actualizar comprador:" + ex.getMessage());
        }
    }
    
    public void eliminarComprador(int dni){
        String sql = "DELETE FROM comprador WHERE dni =?";
        try{
            PreparedStatement ps = con.prepareStatement (sql);
            ps.setInt(1,dni);
            int filas = ps.executeUpdate();
            
            if(filas >0){
                JOptionPane.show.MessageDialog(null,"Comprardor eliminado con éxito");
            } else {
                JOptionPane.show.MessageDialog(null, "No se encontró comprador con ese DNI.");
            }
            ps.close();
        } catch (SQLException ex ){
            JOptionPane.show.MessageDialog(null,"Error al eliminar comprador:" + ex.getMessage());
        }
    }
}
