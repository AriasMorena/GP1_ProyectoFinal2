
package Entidades;

import java.sql.*;
/**
 *
 * @author Bustos Guada
 */
public class Proyeccion {
    
    private String idioma;
    private boolean es3D;
    private boolean subtitulada;
    private Time horaInicio;
    private Time horaFin;
    private double precioLugar;

    public Proyeccion(String idioma, boolean es3D, boolean subtitulada, Time horaInicio, Time horaFin, double precioLugar) {
        this.idioma = idioma;
        this.es3D = es3D;
        this.subtitulada = subtitulada;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.precioLugar = precioLugar;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isEs3D() {
        return es3D;
    }

    public void setEs3D(boolean es3D) {
        this.es3D = es3D;
    }

    public boolean isSubtitulada() {
        return subtitulada;
    }

    public void setSubtitulada(boolean subtitulada) {
        this.subtitulada = subtitulada;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }

    public double getPrecioLugar() {
        return precioLugar;
    }

    public void setPrecioLugar(double precioLugar) {
        this.precioLugar = precioLugar;
    }
    
    
}
