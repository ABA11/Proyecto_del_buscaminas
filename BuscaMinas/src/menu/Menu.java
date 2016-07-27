/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes
package menu;

import tableros.Tablero;

/**
 **
 ** @author Andrey B & Jeycon M
 ** @date 2016-07-07 Jueves
 **/
public class Menu {
    String [] [] minas = null;
    String [] [] elegida = null;
    String [] [] tablero = null;
    int lados = 0;
    int x = 0;
    int y = 0;

//    public Menu(String[][] tablero, String[][] minas, int lados, int x, int y) {
//        super(tablero, minas, lados, x, y);
//    }
    Tablero t = new Tablero(minas,tablero,lados,x,y);
   
}
