/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenralla;

/**
 *
 * @author USER
 */
public class Jugador {

    private int idJugador;
    private String nombreJugador;
    private String fichas;
    private int partidasGanadas;

    public Jugador() {
        
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public void setFichas(String fichas) {
        this.fichas = fichas;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public Jugador(int idJugador, String fichas) {
        this.fichas = fichas;
        this.idJugador = idJugador;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public String getFichas() {
        return fichas;
    }

}
