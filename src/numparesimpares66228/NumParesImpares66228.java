/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares66228;

/**
 *
 * @author End User
 */
public class NumParesImpares66228 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        int par = 0;
        int impar = 0;
        while (i < 101) {
            if (i%2==0){
                 par = par + i;
            System.out.println("La suma de los pares es = "+ par);
                  
        } else{
               impar = impar + i; 
            System.out.println("La suma de los impares es = " + impar);
            }
            i++;
    }
    }
    
}
