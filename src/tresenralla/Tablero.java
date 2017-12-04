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
public class Tablero {

    String[][] str = new String[3][3];

    public void CrearTablero() {

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                str[i][j] = " ";
            }
        }

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

    }
<<<<<<< HEAD

    public void ComprobarTablero(int filas, int columnas, String fichas) {

        if (str[filas - 1][columnas - 1].equals("X") || str[filas - 1][columnas - 1].equals("0")) {

            
        } else {
            RellenarTablero(filas, columnas, fichas);
            
=======
    
    public void mostrarTablero(){
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (j == 2) {
                    System.out.println("");
                }
                System.out.print(str[i][j] + "|");
            }
        }
    }
    public void ComprobarTablero(int filas, int columnas, String fichas) {

        if (str[filas - 1][columnas - 1].equals("X") || str[filas - 1][columnas - 1].equals("0")) {
            
        } else {
            RellenarTablero(filas, columnas, fichas);
>>>>>>> c9491f2a8f43b212b52244dd528110d9cafe1278

        }
    }

    public void RellenarTablero(int filas, int columnas, String fichas) {
        str[filas - 1][columnas - 1] = fichas;

    }

}
