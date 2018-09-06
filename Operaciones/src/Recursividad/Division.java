package recursividad;
import javax.swing.*;

public class Division{
    
    public static int div(int a, int b){
        
        if(a==b){
            
            return 1;
            
        }else            
            if (a==1){
            
                return 0;
            
            }else            
                if(b==1){
                
                    return 1;
                
                }else
                
                        return a-div(a-1,b);      
    }
    
    public static void main(String[] args) {
        
        int ans;
        ans = JOptionPane.showConfirmDialog(null, "Este programa permitira al usuario \n"
                + "calcular la division de 2 numeros dados. \n"
                + "el resultado se mostrara como entero y no como decimal","division recursiva", 0);
        if(ans==0){
            
            String in1,in2;
            in1 = JOptionPane.showInputDialog(null,"Digite el 1er termino a dividir, el dividiendo");
            int a,b;
            a= Integer.parseInt(in1);
            in2 = JOptionPane.showInputDialog(null,"Digite el 2do termino a dividir, el divisor");            
            b= Integer.parseInt(in2);
            
            
            int resultado;
            resultado= div(a,b);
           
            JOptionPane.showMessageDialog(null, "la division de : "+a+" / "+b+" es = "+Math.abs(resultado));           
        }else
            
         JOptionPane.showMessageDialog(null,"Gracias por su tiempo");
        
        
    }
    
}
//a es el dividiendo
//b es el divisor//b es el divisor

//no terminado... hay que corregir.