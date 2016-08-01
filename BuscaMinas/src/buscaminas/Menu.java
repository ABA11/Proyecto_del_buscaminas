/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Paquetes
package buscaminas;

import javax.swing.JOptionPane;
import tableros.Tablero;

/**
 **
 ** @author Andrey B & Jeycon M
 ** @date 2016-07-07 Jueves
 **/
public class Menu extends Object{
    int opc;
    public Menu(int opc){
        this.opc = opc;
    }
    public Menu(){}
    public void menu(){
        boolean comenzar = true;
        while(comenzar==true){
//            try{
             this.opc = Integer.parseInt(JOptionPane.showInputDialog("Elija una de las opciones\n1.Jugar \n2.Salir"));
             switch(opc){
                 case 1:{
                  String [] [] minas = null;
                  String [] [] elegida = null;
                  String [] [] tablero = null;
                  int lados = 0;
                  int x = 0;
                  int y = 0;
                  //
                  tableros.Tablero t = new tableros.Tablero(tablero, minas, lados, x, y);                 
                  tableros.TableroMinas tm = new tableros.TableroMinas(tablero, minas, lados, x, y);
                   while(lados<=3){
                  lados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del tablero")); 
                  if(lados<=3){
                      JOptionPane.showMessageDialog(null,"El tamaño ingresado no es valido, el mìnimo es 4","Error",JOptionPane.WARNING_MESSAGE);
                     }
                  }  
                  tablero = new String[lados][lados];
                  minas = new String[lados][lados];
                  t.llenarTablero(lados, tablero);
                  tm.llenarMinas(minas, lados);
                 
                  t.tableroJuego(tablero, minas, lados, lados, lados, lados, x, y);
                 }break;
                 case 2:{
                   System.out.println("2");   
                 }break;
                 case 10010:{
                    System.out.println("01");  
                 }break;
                 default:{
                     System.out.println("nada1");
                 }
             }
//            }catch(Exception e){
//                System.out.println("error");
//            }
            comenzar = false;
        }

    }
   
    
}
