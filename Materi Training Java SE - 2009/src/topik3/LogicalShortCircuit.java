/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik3;

/**
 *
 * @author Koo
 */
public class LogicalShortCircuit {
    public static void main(String[] args) {
        int x = 2; //+1 = 3
        int y = 3; //+1 = 4
        int z = 4; //+1 = 5
        
        
        /*if ((++x > 0) && (++y < 6) && (++z ==5)) {
            System.out.println(x+y);
            System.out.println(z);
            System.out.println(true);
        }*/
        
        
        if ((++x > 0) && (++y > 6) && (++z ==5)) {
            System.out.println(x+y);
            System.out.println(z);
            System.out.println(true);
        }
        
        /*
        if ((++x > 0) || (++y < 6) && (++z ==5)) {
            System.out.println(x+y);
            System.out.println(z);
            System.out.println(true);
        }
        */
        
        /*
        if ((++x > 0) || (++y > 6) && (++z ==5)) {
            System.out.println(x+y);
            System.out.println(z);
            System.out.println(true);
        }
        */
        
        else {
            System.out.println(x+y);
            System.out.println(z);
            System.out.println(false);
        }
    }
}
