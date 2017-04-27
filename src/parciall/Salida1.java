/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciall;

/**
 *
 * @author javier
 */
public class Salida1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            int j=0;
            while (j<i){
                System.out.print(j+" ");
                j++;
            }
        }
    }
}
