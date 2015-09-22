/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik5;

/**
 *
 * @author Koo
 */
public class TestMethod {
    public static void nPrintln(String message, int n) {
        for (int i =1; i<=n; i++) {
            System.out.println(message);
        }
    }
    
    public static void main(String[] args) {
        nPrintln("Hello", 3);
    }
}
