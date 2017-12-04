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
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
               str[i][j] = " ";
            }
        }
        
        boolean b = true;
        int count = 1;
        int filas;
        int columnas;
        
        while(b){
            
            if (count == 9) {
                b = false;
            } else {
                for (int i = 0; i < str.length; i++) {
                    for (int j = 0; j < str[i].length; j++) {
                        if (j == 2) {
                            System.out.print(str[i][j]);
                        } else {
                            System.out.print(str[i][j] + "|");
                        }

                    }
                    System.out.println("");
                }
                System.out.println("Inserta Fila (1-3)");
                filas = Integer.parseInt(br.readLine());
                System.out.println("Inserta Columna (1-3)");
                columnas = Integer.parseInt(br.readLine());
               
                str[filas-1][columnas-1] = "X";
              
                
                count++;
            }
        }
    }
    
    
}
