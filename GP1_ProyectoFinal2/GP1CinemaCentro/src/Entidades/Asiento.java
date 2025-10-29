
package Entidades;

/**
 *
 * @author Bustos Guada
 */
public class Asiento {
    
    private String fila;
    private int número;
    private boolean disponible;
    private int idProyeccion;

    public Asiento(String fila, int número, boolean disponible, int idProyeccion) {
        this.fila = fila;
        this.número = número;
        this.disponible = disponible;
        this.idProyeccion = idProyeccion;
    }

    public Asiento() {
    }

    public int getIdProyeccion() {
        return idProyeccion;
    }

    public void setIdProyeccion(int idProyeccion) {
        this.idProyeccion = idProyeccion;
    }
    
    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getNúmero() {
        return número;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
       
}
