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

    public boolean ComprobarTablero(int filas, int columnas, String fichas) {

        if (str[filas - 1][columnas - 1].equals("X") || str[filas - 1][columnas - 1].equals("0")) {

            return true;
        } else {
            RellenarTablero(filas, columnas, fichas);
            return false;

        }
    }

    public void RellenarTablero(int filas, int columnas, String fichas) {
        str[filas - 1][columnas - 1] = fichas;

    }

}
