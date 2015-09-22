/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik4;

/**
 *
 * @author Koo
 */
public class For {
    public static void main(String[] args) {
        int i = 0;
        
        //without initialization
        System.out.println("without initialization");
        for (;i < 4; i++) {
            System.out.println(i);
        }
        
        //with initialization
        System.out.println("with initialization");
        for (int a=0 ;a < 4; a++) {
            System.out.println(i);
        }       
        
        //without conditional testing - forever loop
        System.out.println("without conditional");
        for (i=0 ;; i++) {
            System.out.println(i);
        }
        
        //without incremental statement - forever loop
        System.out.println("without increment");
        for (i=0 ;i < 4;) {
            System.out.println(i);
        }
    }
}
