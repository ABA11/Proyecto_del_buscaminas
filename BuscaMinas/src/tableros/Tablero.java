/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes
package tableros;

import javax.swing.JOptionPane;

/**
 **
 ** @author Andrey B & Jeycon M
 ** @date 2016-07-07 Jueves
 **/
public class Tablero {
    //Variavles de la clase tablero
        private String[][] tablero;
        private String[][] minas;
        private int lados;
        private int x;
        private int y;
 
    /**
     * Constructor de la clase Tablero
     * @param tablero
     * @param minas
     * @param lados
     * @param x
     * @param y
     */
    public Tablero(String[][] tablero, String[][] minas, int lados, int x, int y) {
        this.tablero = tablero;
        this.minas = minas;
        this.lados = lados;
        this.x = x;
        this.y = y;
    }        

    /**
     * Método get para la variable x
     * @return variable x 
     **/
    public int getX() {
        return x;
    }

    /**
     * Método set para la variable x
     * @param x
     **/
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Método get para la variable y
     * @return variable y
     **/
    public int getY() {
        return y;
    }

    /**
     * Método set para variable y
     * @param y
     **/
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Método get para variable tablero
     * @return tablero
     **/
    public String[][] getTablero() {
        return tablero;
    }

    /**
     * Método set para variable tablero
     * @param tablero
     **/
    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    /**
     * Método get para la variable minas
     * @return minas
     **/
    public String[][] getMinas() {
        return minas;
    }

    /**
     * Método set para la variable minas
     * @param minas
     **/
    public void setMinas(String[][] minas) {
        this.minas = minas;
    }

    /**
     * Método get para la variable lados
     * @return lados
     **/
    public int getLados() {
        return lados;
    }

    /**
     * Método set para la variable lados
     * @param lados
     **/
    public void setLados(int lados) {
        this.lados = lados;
    }

    /**
     * Método para llenar tablero
     * @param lados
     * @param tablero
     * @return tablero
     **/
    public String[][] llenarTablero(int lados,String[][] tablero){  
            for(int i = 0;i<lados;i++){
               for(int j = 0;j<lados;j++){
                tablero[i][j] = "[ ]";
               
            }
        }
        return tablero;
     }
    public void perder(String[][] minas,String[][] tablero,int lados,int x,int y,boolean jugar){
        if((minas[x][y] == "[M]")&&(tablero[x][y]!="[x]")){
            System.out.println("====Has perdido====");
            String columnasM = " ";
            for(int i = 0;i<=lados-1;i++){
                if(i==0){
                    columnasM += "   "+i;
                }else if(i<10){
                    columnasM += "  "+i; 
                }else
                    columnasM += " "+i;
            }
            System.out.println(columnasM);
            for(int i = 0;i<lados;i++){
                String tableroM = " ";
                for(int j = 0;j<lados;j++){
                tableroM += minas[i][j];
            }
                if(i>=10){
                    System.out.println(i+tableroM);
                }else
                    System.out.println(i+" "+tablero);
            }
            JOptionPane.showMessageDialog(null,"<html><font color = red>Has perdido","Mensaje",JOptionPane.WARNING_MESSAGE);
//            JOptionPane.showInternalConfirmDialog(null)
            jugar = false;
        }else if(tablero[x][y]=="[x]"){
            tablero[x][y]="[x]";
        }
    }
    public void ganar(String[][] minas,String[][] tablero,int lados,int x,int y,boolean jugar,int aciertos){
        if(aciertos == (((lados*lados)+1)-(lados*2))){
            String columnasM = " ";
            for(int i = 0;i<=lados-1;i++){
                if(i==0){
                    columnasM += "   "+i;
                }else if(i<10){
                    columnasM += "  "+i;
                }else
                    columnasM+= " "+i;
            }
            System.out.println(columnasM);
            for(int i = 0;i<lados;i++){
                String tableroM = " ";
                for(int j = 0;j<lados;j++){
                tableroM += minas[i][j];
                }
                if(i>=10){
                    System.out.println(i+tableroM);
                }else
                    System.out.println(i+" "+tableroM);
            }
            JOptionPane.showMessageDialog(null,"¡Has ganado felicidades!");
            jugar = false;
        }
    }
    public void tablerojuego(String tablero[] [],int lados,int ganadas, int perdidas,int aciertos){
        System.out.println(" =======´BUSCA MINAS´=======");
        System.out.println("jugadas:"+(ganadas+perdidas)+" Ganadas:"+ganadas+" Perdidas:"+perdidas);
        System.out.println("Minas:"+(lados*2)+" Espacios sin minas:"+aciertos+"/"+((lados*lados)-(lados*2)));
        String columnasC = " ";
        for(int i = 0;i<=lados-1;i++){
            if(i==0){
                columnasC += "   "+i;
            }else if(i<10){
                columnasC += "  "+i;
            }else
                columnasC += " "+i;
        }
        System.out.println(columnasC);
        for(int i = 0;i<lados;i++){
            String tableroM = " ";
            for(int j = 0;j<lados;j++){
                tableroM += tablero[i][j];
            }
            if(i>=10){
                System.out.println(i+tableroM);
            }else
                System.out.println(i+" "+ tableroM);
        }
    }
}
