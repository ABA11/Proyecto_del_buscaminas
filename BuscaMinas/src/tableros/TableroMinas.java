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
public class TableroMinas {
    private String[][] minas;
    private int lados;

    public TableroMinas(String[][] minas, int lados) {
        this.minas = minas;
        this.lados = lados;
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
    
    
    
     public String[][] llenarMinas(String[][] minas, int lados){
         int contador = 0;
            for(int i = 0;i<lados;i++){
               for(int j = 0;j<lados;j++){
                 minas[i][j] = "[0]";
            }
        }
         while(contador<lados*2){            
           int minaAleatoria1 = (int) (Math.random()*lados);
           int minaAleatoria2 = (int) (Math.random()*lados);
           if(minas[minaAleatoria1][minaAleatoria2]!= "[M]"){
               minas[minaAleatoria1][minaAleatoria2] = "[M]";
               contador++;
           }          
         }
         for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if(minas[i][j]== "[M]"){
                       j++;
                     if(j<=(lados-1)){
                        if(minas[i][j]=="[0]"){
                         minas[i][j] = "[1]";
                         j--;
                     }else if(minas[i][j]=="[1]"){
                         minas[i][j] = "[2]";
                         j--;
                     }else if(minas[i][j]=="[2]"){
                         minas[i][j]="[3]";
                         j--;
                     }else if(minas[i][j]=="[3]"){
                         minas[i][j]="4";
                         j--;
                     }else if(minas[i][j]=="[4]"){
                         minas[i][j]="[5]";
                         j--;
                     }else if(minas[i][j]=="[5]"){
                         minas[i][j]="[6]";
                         j--;
                     }else if(minas[i][j]=="[6]"){
                         minas[i][j]="[7]";
                         j--;
                     }else if(minas[i][j]=="[7]"){
                         minas[i][j]="[8]";
                         j--;
                     }else if(minas[i][j]=="[M]"){
                         j--;
                     }
                    }
                     if(j>lados){
                         j--;
                     }
                 }              
             }
         }
          for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if(minas[i][j]== "[M]"){
                       j--;
                     if(j >= 0){
                        if(minas[i][j]=="[0]"){
                         minas[i][j] = "[1]";
                         j++;
                     }else if(minas[i][j]=="[1]"){
                         minas[i][j] = "[2]";
                         j++;
                     }else if(minas[i][j]=="[2]"){
                         minas[i][j]="[3]";
                         j++;
                     }else if(minas[i][j]=="[3]"){
                         minas[i][j]="4";
                         j++;
                     }else if(minas[i][j]=="[4]"){
                         minas[i][j]="[5]";
                         j++;
                     }else if(minas[i][j]=="[5]"){
                         minas[i][j]="[6]";
                         j++;
                     }else if(minas[i][j]=="[6]"){
                         minas[i][j]="[7]";
                         j++;
                     }else if(minas[i][j]=="[7]"){
                         minas[i][j]="[8]";
                         j++;
                     }else if(minas[i][j]=="[M]"){
                         j++;
                     }
                    }
                     if(j<0){
                         j++;
                     }
                 }              
             }
         }
              for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if(minas[i][j]== "[M]"){
                       i--;
                     if(i >= 0){
                        if(minas[i][j]=="[0]"){
                         minas[i][j] = "[1]";
                         i++;
                     }else if(minas[i][j]=="[1]"){
                         minas[i][j] = "[2]";
                         i++;
                     }else if(minas[i][j]=="[2]"){
                         minas[i][j]="[3]";
                         i++;
                     }else if(minas[i][j]=="[3]"){
                         minas[i][j]="4";
                         i++;
                     }else if(minas[i][j]=="[4]"){
                         minas[i][j]="[5]";
                         i++;
                     }else if(minas[i][j]=="[5]"){
                         minas[i][j]="[6]";
                         i++;
                     }else if(minas[i][j]=="[6]"){
                         minas[i][j]="[7]";
                         i++;
                     }else if(minas[i][j]=="[7]"){
                         minas[i][j]="[8]";
                         i++;
                     }else if(minas[i][j]=="[M]"){
                         i++;
                     }
                    }
                     if(i<0){
                         i++;
                     }
                 }              
             }
         }
              
            for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if(minas[i][j] == "[M]"){
                       i++;
                     if(i < lados){
                        if(minas[i][j]=="[0]"){
                         minas[i][j] = "[1]";
                         i--;
                     }else if(minas[i][j]=="[1]"){
                         minas[i][j] = "[2]";
                         i--;
                     }else if(minas[i][j]=="[2]"){
                         minas[i][j]="[3]";
                         i--;
                     }else if(minas[i][j]=="[3]"){
                         minas[i][j]="[4]";
                         i--;
                     }else if(minas[i][j]=="[4]"){
                         minas[i][j]="[5]";
                         i--;
                     }else if(minas[i][j]=="[5]"){
                         minas[i][j]="[6]";
                         i--;
                     }else if(minas[i][j]=="[6]"){
                         minas[i][j]="[7]";
                         i--;
                     }else if(minas[i][j]=="[7]"){
                         minas[i][j]="[8]";
                         i--;
                     }else if(minas[i][j]=="[M]"){
                         i--;
                     }
                    }
                     if(i>lados-1){
                         i--;
                     }
                 } 
             }
         }
            for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if(minas[i][j] == "[M]"){
                       j++;
                       i--;
                     if((i >= 0) && (j<=lados-1)){
                        if(minas[i][j]=="[0]"){
                         minas[i][j] = "[1]";
                         i++;
                         j--;
                     }else if(minas[i][j]=="[1]"){
                         minas[i][j] = "[2]";
                         i++;
                         j--;
                     }else if(minas[i][j]=="[2]"){
                         minas[i][j]="[3]";
                         i++;
                         j--;
                     }else if(minas[i][j]=="[3]"){
                         minas[i][j]="[4]";
                         i++;
                         j--;
                     }else if(minas[i][j]=="[4]"){
                         minas[i][j]="[5]";
                         i++;
                         j--;
                     }else if(minas[i][j]=="[5]"){
                         minas[i][j]="[6]";
                         i++;
                         j--;
                     }else if(minas[i][j]=="[6]"){
                         minas[i][j]="[7]";
                         i++;
                         j--;
                     }else if(minas[i][j]=="[7]"){
                         minas[i][j]="[8]";
                         i++;
                         j--;
                     }else if(minas[i][j]=="[M]"){
                         i++;
                         j--;
                     }
                    }
                     if((i<0)||(j>lados-1)){
                         i++;
                         j--;
                     }
                 } 
             }
         }
             for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if(minas[i][j] == "[M]"){
                       j--;
                       i--;
                     if((i >= 0) && (j>=0)){
                        if(minas[i][j]=="[0]"){
                         minas[i][j] = "[1]";
                         i++;
                         j++;
                     }else if(minas[i][j]=="[1]"){
                         minas[i][j] = "[2]";
                         i++;
                         j++;
                     }else if(minas[i][j]=="[2]"){
                         minas[i][j]="[3]";
                         i++;
                         j++;
                     }else if(minas[i][j]=="[3]"){
                         minas[i][j]="[4]";
                         i++;
                         j++;
                     }else if(minas[i][j]=="[4]"){
                         minas[i][j]="[5]";
                         i++;
                         j++;
                     }else if(minas[i][j]=="[5]"){
                         minas[i][j]="[6]";
                         i++;
                         j++;
                     }else if(minas[i][j]=="[6]"){
                         minas[i][j]="[7]";
                         i++;
                         j++;
                     }else if(minas[i][j]=="[7]"){
                         minas[i][j]="[8]";
                         i++;
                         j++;
                     }else if(minas[i][j]=="[M]"){
                         i++;
                         j++;
                     }
                    }
                     if((i<0)||(j<0)){
                         i++;
                         j++;
                     }
                 } 
             }
         }
             for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if(minas[i][j] == "[M]"){
                       j++;
                       i++;
                     if((i <= lados-1) && (j<=lados-1)){
                        if(minas[i][j]=="[0]"){
                         minas[i][j] = "[1]";
                         i--;
                         j--;
                     }else if(minas[i][j]=="[1]"){
                         minas[i][j] = "[2]";
                         i--;
                         j--;
                     }else if(minas[i][j]=="[2]"){
                         minas[i][j]="[3]";
                         i--;
                         j--;
                     }else if(minas[i][j]=="[3]"){
                         minas[i][j]="[4]";
                         i--;
                         j--;
                     }else if(minas[i][j]=="[4]"){
                         minas[i][j]="[5]";
                         i--;
                         j--;
                     }else if(minas[i][j]=="[5]"){
                         minas[i][j]="[6]";
                         i--;
                         j--;
                     }else if(minas[i][j]=="[6]"){
                         minas[i][j]="[7]";
                         i--;
                         j--;
                     }else if(minas[i][j]=="[7]"){
                         minas[i][j]="[8]";
                         i--;
                         j--;
                     }else if(minas[i][j]=="[M]"){
                         i--;
                         j--;
                     }
                    }
                     if((i>lados-1)||(j>lados-1)){
                         i--;
                         j--;
                     }
                 } 
             }
         }
             for(int i = 0; i<lados;i++){
             for(int j = 0; j<lados;j++){
                 if(minas[i][j] == "[M]"){
                       j--;
                       i++;
                     if((i <= lados-1) && (j>=0)){
                        if(minas[i][j]=="[0]"){
                         minas[i][j] = "[1]";
                         i--;
                         j++;
                     }else if(minas[i][j]=="[1]"){
                         minas[i][j] = "[2]";
                         i--;
                         j++;
                     }else if(minas[i][j]=="[2]"){
                         minas[i][j]="[3]";
                         i--;
                         j++;
                     }else if(minas[i][j]=="[3]"){
                         minas[i][j]="[4]";
                         i--;
                         j++;
                     }else if(minas[i][j]=="[4]"){
                         minas[i][j]="[5]";
                         i--;
                         j++;
                     }else if(minas[i][j]=="[5]"){
                         minas[i][j]="[6]";
                         i--;
                         j++;
                     }else if(minas[i][j]=="[6]"){
                         minas[i][j]="[7]";
                         i--;
                         j++;
                     }else if(minas[i][j]=="[7]"){
                         minas[i][j]="[8]";
                         i--;
                         j++;
                     }else if(minas[i][j]=="[M]"){
                         i--;
                         j++;
                     }
                    }
                     if((i>lados-1)||(j<0)){
                         i--;
                         j++;
                     }
                 } 
             }
         }
        return minas;
     }
}
