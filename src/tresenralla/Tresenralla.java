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
        int turno=1;
        Tablero t = new Tablero();
        Jugador j1 = new Jugador(1,"X");
        Jugador j2 = new Jugador(2,"0");
        t.CrearTablero();
        while(b){
            
            
            if(turno==1){
            System.out.println("Introduce filas 1-3");
            filas = Integer.parseInt(br.readLine());
            System.out.println("Introduce columnas 1-3");
            columnas = Integer.parseInt(br.readLine());
            t.ComprobarTablero(filas, columnas, j2.getFichas());
            turno=2;
            }
            if(turno==2){
            System.out.println("Introduce filas 1-3");
            filas = Integer.parseInt(br.readLine());
            System.out.println("Introduce columnas 1-3");
            columnas = Integer.parseInt(br.readLine());
            t.ComprobarTablero(filas, columnas, j2.getFichas());
            }
            if(count==9){
            b=false;
            }else{
            count++;
            }
            
    }
    }
    
    
}
