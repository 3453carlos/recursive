
package Recursividad;

import javax.swing.JOptionPane;

/**
 *
 * @author bryan.valderrama
 */
public class Potencia {
    
    
    public static int pot(int b, int e){      
        
        if(b==1){
            
            return 1;
        }
        
        else
            if (e==1){
                
                return b;
            }
        else              
                    
            return  b*pot(b,e-1);                   
        }
    
    
    public static void main(String[] args) {
        
        int ans;
        ans=JOptionPane.showConfirmDialog(null,"Este programa permitira al usuario \n"
                + "calcular la potencia de un numero dado", "Calculadora de potencias",0);
        
        if(ans==0){
            
            JOptionPane.showMessageDialog(null,"Se le recuerda al usuario que al calcular una base 0 y un exponente 0,\n"
                + "dara un error matematico, por lo cual se repetira el ingreso de datos. Gracias por su comprension.");
            
            String ingreso_1,ingreso_2;
            int b,e;
            
            do{
            ingreso_1=JOptionPane.showInputDialog(null,"Ingrese la base de la potencia a calcular","Calculadora de potencias",JOptionPane.YES_OPTION);  
            b=Integer.parseInt(ingreso_1);
                        
            ingreso_2=JOptionPane.showInputDialog(null,"Ingrese el exponente de la potencia a calcular","Calculadora de potencias",JOptionPane.YES_OPTION);           
            e=Integer.parseInt(ingreso_2);
            
            }while(b==0 && e==0);      
            
            int resultado;
            resultado=pot(b,e);
            
            JOptionPane.showMessageDialog(null,"Potencia del numero "+b+"^"+e+" es: "+resultado);                  
        }else
            if(ans>0){
                JOptionPane.showMessageDialog(null,"Gracias por su tiempo.");
            }
    }
    
}
