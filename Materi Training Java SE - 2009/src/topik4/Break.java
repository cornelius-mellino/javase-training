/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik4;

/**
 *
 * @author Koo
 */
public class Break {
    public static void main(String[] args) {
        int val = 3;
        
        while (val > 0) {
            System.out.println(val);
            val--;
            
            if (val == 2) break;
        }
        
        System.out.println(val);
    }
}
