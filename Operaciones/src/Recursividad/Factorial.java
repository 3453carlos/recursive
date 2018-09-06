
package Recursividad;
import javax.swing.*;
/**
 *
 * @author bryan.valderrama
 */
public class Factorial {
    
    public static int fac (int evaluado) {   
        
        if(evaluado==0){
            return 1;   
        }
        else     
                               
            return evaluado* fac(evaluado-1);        
}   
    
    public static void main(String[] args) {
        
        int ans;
        ans = JOptionPane.showConfirmDialog(null, "Este programa permitira al usuario \n"
                + "calcular el factorial de un numero dado","Calculadora de factorial", 0);
        if(ans==0){
            
            String ingreso;
            ingreso = JOptionPane.showInputDialog(null,"Digite el numero a evaluar");
            int evaluado;
            evaluado= Integer.parseInt(ingreso);
            
            int resultado;
            resultado= fac(evaluado);
           
            JOptionPane.showMessageDialog(null, "Fatorial de "+evaluado+" = "+Math.abs(resultado));           
        }else
            
         JOptionPane.showMessageDialog(null,"Gracias por su tiempo");
    }
    
}
