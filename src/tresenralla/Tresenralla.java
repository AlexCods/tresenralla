/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenralla;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumne
 */
public class Tresenralla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] str = new String[3][3];

        boolean b = true;
        int count = 1;
        int filas;
        int columnas;
        int turno = 1;
        Tablero t = new Tablero();
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        
        t.CrearTablero();
            System.out.println("Nombre del Jugador1");
            j1.setNombreJugador(br.readLine());
            j1.setFichas("X");
            System.out.println("Nombre del Jugador2");
            j2.setNombreJugador(br.readLine());
            j2.setFichas("0");
            
        while(b){
            
            
            if(turno==1){
            System.out.println("Jugador 1 Introduce filas 1-3");
            filas = Integer.parseInt(br.readLine());
            System.out.println("Jugador 1 Introduce columnas 1-3");
            columnas = Integer.parseInt(br.readLine());
            t.ComprobarTablero(filas, columnas, j1.getFichas());
            turno=2;
            t.mostrarTablero();
            }
            if(turno==2){
            System.out.println("Jugador 2 Introduce filas 1-3");
            filas = Integer.parseInt(br.readLine());
            System.out.println("Jugador 2 Introduce columnas 1-3");
            columnas = Integer.parseInt(br.readLine());
            t.ComprobarTablero(filas, columnas, j2.getFichas());
            t.mostrarTablero();
            }
            if(count==9){
                b=false;
            }else{
            count++;
            }
            
    }

}
}
