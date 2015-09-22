/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik4;

/**
 *
 * @author Koo
 */
public class While {
    public static void main(String[] args) {
        int val = 3;
        
        while (val > 0) {
            System.out.println(val);
            val--;
        }
        
        //without variable adjustment, lead to forever loop
        val = 3;
        while (val > 0) {
            System.out.println(val);
        }
    }
}
