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

    public void mostrarTablero() {
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
            System.out.println("Ya hay una ficha en ese tablero.");
            return true;
        } else {
            RellenarTablero(filas, columnas, fichas);
            return false;
        }
    }

    public void RellenarTablero(int filas, int columnas, String fichas) {
        str[filas - 1][columnas - 1] = fichas;
    }
    
    public boolean comprobarVictoria(){
         for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (str[i][j] == "X" ){
                    if (str[i][j+1] == "X") {
                        if (str[i][j+2] == "X") {
                            return true;
                        }
                    } else if(str[i][j+1] == "X"){
                        if (str[i][j+2] == "X") {
                            return true;
                        }
                    } else if (str[i+1][j+1] == "X") {
                        if (str[i+2][j+2] == "X") {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}
