/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;
import javax.swing.*;

/**
 *
 * @author bryan.valderrama
 */
public class Resta {
    
   static int aux=0;
    
    public static int res(int a, int b){
        
    
        if(a==b){
            
            return 0;
            
        }else
            if(b==a){
                
                return 1;
                
            }else
                    // houston we got a problmen...
                    return aux+( res(a+1,b-1) );        
    }
    
    public static void main(String[] args) {
        
        int ans;
        ans = JOptionPane.showConfirmDialog(null, "Este programa permitira al usuario \n"
                + "calcular la multiplicacion de 2 numeros dados","Multiplicacion recursiva", 0);
        if(ans==0){
            
            int a,b;
            
            do{
                
                JOptionPane.showMessageDialog(null,"Se le recuerda que en la resta, para que de un resultado exacto \n"
                        + "el minuendo debe ser mayor que el sustraendo. \n"
                        + "este menu se repetira para cumplir esta condicion.");
                
            String in1,in2;
            in1 = JOptionPane.showInputDialog(null,"Digite el 1er termino a restar, minuendo");
            
            a= Integer.parseInt(in1);
            in2 = JOptionPane.showInputDialog(null,"Digite el 2do termino a restar, sustraendo");            
            b= Integer.parseInt(in2);
            }while(a<b);    
            
            int resultado;
            resultado= res(a,b);
           
            JOptionPane.showMessageDialog(null, "la resta de : "+a+" - "+b+" es = "+Math.abs(resultado));           
        }else
            
         JOptionPane.showMessageDialog(null,"Gracias por su tiempo");
        
    }
}

//a es el minuendo de la resta
//b es el sustraendo de la resta

//no terminado, error en el caso base