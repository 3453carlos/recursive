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
public class Raiz {
    
    public static int root(int r, int e){      
        
        if(r==1){
            
            return 1;
            
        }else
            if(e==2){
                
                return r/2;
            }
        
        else
                              
            return  r/root(r,e-1);                   
        }
    
    public static void main(String[] args) {
        
        
        int ans;
        ans=JOptionPane.showConfirmDialog(null,"Este programa permitira al usuario \n"
                + "calcular la raiz de un numero dado", "Calculadora de raiz",0);
        
        if(ans==0){
            
            JOptionPane.showMessageDialog(null,"Se le recuerda al usuario que al calcular un radicando 0 y un exponente cualquiera,\n"
                    + "dara como resultado 0. \n"
                    + "Tener en cuenta tambien que no se puede efectuar raiz con un indice de raiz menor a 2 \n"
                    + "por lo cual se repetira el ingreso de datos. Gracias por su comprension.");
            
            String ingreso_1,ingreso_2;
            int r,e;
            
            do{
            ingreso_1=JOptionPane.showInputDialog(null,"Ingrese el radicando de la raiz a calcular","Calculadora de raiz",JOptionPane.YES_OPTION);  
            r=Integer.parseInt(ingreso_1);
                        
            ingreso_2=JOptionPane.showInputDialog(null,"Ingrese el indice de la raiz a calcular","Calculadora de raiz",JOptionPane.YES_OPTION);           
            e=Integer.parseInt(ingreso_2);
            
            }while(r==0 && e<2); 
            
            float resultado;
            resultado=root(r,e);
            
            JOptionPane.showMessageDialog(null,"Raiz del numero "+r+" es: "+resultado); 
            
        }else
            if(ans>0){
                JOptionPane.showMessageDialog(null,"Gracias por su tiempo.");
            }
    }
    
}
