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
public class Tablero extends Object{
    //Variavles de la clase tablero
        public String[][] tablero;
        public String[][] minas;
        public int lados;
        public int x;
        public int y;
 
    /**
     * Constructor de la clase Tablero
     * @param tablero
     * @param minas
     * @param lados
     * @param x
     * @param y
     **/
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
    public String[][] mostrar(String[][] tablero,String[][] minas,int x, int y){
          
          return tablero;
    }
    public void marcar(String[][] tablero,String[][] minas,int x, int y){
        while(tablero[x][y]=="[ ]"){
            if(tablero[x][y] == "[ ]"){
                tablero[x][y]="[x]";
            }
             if(minas[x][y]=="[M]"){
             tablero[x][y] = "[x]";
         }
          if(minas[x][y]=="[1]"){
             tablero[x][y] = "[x]";
         }
           if(minas[x][y]=="[2]"){
             tablero[x][y] = "[x]";
         }
            if(minas[x][y]=="[3]"){
             tablero[x][y] = "[x]";
         }
             if(minas[x][y]=="[4]"){
             tablero[x][y] = "[x]";
         }
              if(minas[x][y]=="[5]"){
             tablero[x][y] = "[x]";
         }
               if(minas[x][y]=="[6]"){
             tablero[x][y] = "[x]";
         }
                if(minas[x][y]=="[7]"){
             tablero[x][y] = "[x]";
         }
                 if(minas[x][y]=="[8]"){
             tablero[x][y] = "[x]";
         }
                 if(minas[x][y]=="[M]"){
                     tablero[x][y]="[x]";
                 }  
         }              
    }
    public void perder(String[][] minas,String[][] tablero,int lados,int x,int y,boolean jugar){
        if(("[M]".equals(minas[x][y]))&&(!"[x]".equals(tablero[x][y]))){
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
                    System.out.println(i+" "+tableroM);
            }
            JOptionPane.showMessageDialog(null,"<html><font color = red>Has perdido","Mensaje",JOptionPane.WARNING_MESSAGE);
            jugar = false;
        }else if("[x]".equals(tablero[x][y])){
            tablero[x][y]="[x]";
        }
    }
    public void ganar(String[][] minas,String[][] tablero,int lados,int x,int y,boolean jugar,int aciertos){
        for (int i = 0; i<lados;i++){
            for (int j = 0; j<lados;j++){
                 if("[ ]".equals(tablero [i][j])){
                    aciertos++;
                 }
             }
        }
        if(aciertos == lados*2){
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
    public void pedir(int x, int y, int lados){
      
    }
    public void encabezado(String tablero[] [],int lados,int ganadas, int perdidas,int aciertos){
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
    public void tableroJuego(String tablero[][],String[][] minas,int lados,int ganadas, int perdidas,int aciertos,int x, int y){
        //Variables
        this.encabezado(tablero, lados, ganadas, perdidas, aciertos);
          boolean pedir = true;
        while(pedir==true){
            x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna"));
            if((x>=lados-1)||(y>=lados-1)){
                JOptionPane.showMessageDialog(null,"Las cordenadas no coinciden \ncon el tamaño del tablero\ningrese nuevas coordenadas","Error",JOptionPane.WARNING_MESSAGE);
            }
            if((x<=lados-1)||(y<=lados-1)){
                pedir = false;
            }
        }
        if(!"[x]".equals(tablero[x][y])){
             if("[1]".equals(minas[x][y])){
             tablero[x][y] = "[1]";      
         }
           if("[2]".equals(minas[x][y])){
             tablero[x][y] = "[2]";
         }
            if("[3]".equals(minas[x][y])){
             tablero[x][y] = "[3]";
         }
            if("[4]".equals(minas[x][y])){
             tablero[x][y] = "[4]";
         }
            if("[5]".equals(minas[x][y])){
             tablero[x][y] = "[5]";
         }
            if("[6]".equals(minas[x][y])){
             tablero[x][y] = "[6]";
         }
            if("[7]".equals(minas[x][y])){
             tablero[x][y] = "[7]";
         }
            if("[8]".equals(minas[x][y])){
             tablero[x][y] = "[8]";
         }
            if("[0]".equals(minas[x][y])){
              tablero[x][y] = "[0]";
             }
         }
        this.mostrar(tablero, minas, x, y);
       
    }
}
