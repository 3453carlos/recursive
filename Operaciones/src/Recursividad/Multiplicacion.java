package recursividad;
import javax.swing.*;

public class Multiplicacion {
    
    public static int multi (int a, int b){
        
        //caso base default 1
        if(a==0){
            
            return 0;            
        }else
            //caso base default 2
            if(b==0){
                
                return 0;
                
            }else
                //caso base 1
                if(a==1){
            
                    return b;
                    
                }else
                    //caso base 2
                    if (b==1){
                
                        return a;
                        
                    }else
                        //llamadas recursivas al metodo
                        return a+multi(a, b-1);        
    }
    
    public static void main(String[] args) {
        
        int ans;
        ans = JOptionPane.showConfirmDialog(null, "Este programa permitira al usuario \n"
                + "calcular la multiplicacion de 2 numeros dados","Multiplicacion recursiva", 0);
        if(ans==0){
            
            String in1,in2;
            in1 = JOptionPane.showInputDialog(null,"Digite el 1er termino a multiplicar");
            int a,b;
            a= Integer.parseInt(in1);
            in2 = JOptionPane.showInputDialog(null,"Digite el 2do termino a multiplicar");            
            b= Integer.parseInt(in2);
            
            
            int resultado;
            resultado= multi(a,b);
           
            JOptionPane.showMessageDialog(null, "la multiplicacion de : "+a+" * "+b+" es = "+Math.abs(resultado));           
        }else
            
         JOptionPane.showMessageDialog(null,"Gracias por su tiempo");
        
        
    }
}