
package Entidades;

/**
 *
 * @author Bustos Guada
 */
public class Sala {
    
    private int nroSala;
    private boolean apata3D;
    private int capacidad;
    private String estado;

    public Sala(int nroSala, boolean apata3D, int capacidad, String estado) {
        this.nroSala = nroSala;
        this.apata3D = apata3D;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getNroSala() {
        return nroSala;
    }

    public void setNroSala(int nroSala) {
        this.nroSala = nroSala;
    }

    public boolean isApata3D() {
        return apata3D;
    }

    public void setApata3D(boolean apata3D) {
        this.apata3D = apata3D;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
