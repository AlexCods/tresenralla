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
    private String fichas;
    
    public Jugador(int idJugador,String fichas){
    this.fichas=fichas;
    this.idJugador=idJugador;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public String getFichas() {
        return fichas;
    }
    
    
}
