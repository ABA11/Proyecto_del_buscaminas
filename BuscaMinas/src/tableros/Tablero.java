/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes
package tableros;

/**
 *
 ** @author Andrey B & Jeycon M
 ** @date 2016-07-07 Jueves
 **/
public class Tablero {
        private String[][] tablero;
        private String[][] minas;
        private int lados;
        private int x;
        private int y;
        //

    public Tablero(String[][] tablero, String[][] minas, int lados, int x, int y) {
        this.tablero = tablero;
        this.minas = minas;
        this.lados = lados;
        this.x = x;
        this.y = y;
    }        

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public String[][] getMinas() {
        return minas;
    }

    public void setMinas(String[][] minas) {
        this.minas = minas;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

     public String[][] llenarTablero(int lados,String[][] tablero){  
            for(int i = 0;i<lados;i++){
               for(int j = 0;j<lados;j++){
                tablero[i][j] = "[ ]";
               
            }
        }
        return tablero;
     }
}
