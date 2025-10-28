
package Entidades;

/**
 *
 * @author Bustos Guada
 */
public class Asiento {
    
    private char fila;
    private int número;
    private boolean disponible;
    private Proyeccion proyeccion;

    public Asiento(char fila, int número, boolean disponible, Proyeccion proyeccion) {
        this.fila = fila;
        this.número = número;
        this.disponible = disponible;
        this.proyeccion = proyeccion;
    }

    public Asiento() {
    }
    

    public Proyeccion getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(Proyeccion proyeccion) {
        this.proyeccion = proyeccion;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
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
