/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik5;

/**
 *
 * @author Koo
 */
public class IncorrectMethod {
    int x = 0;
    
    public static void IncorrectMethod() {
        int x = 1;
        int y = 1;
        
        for (int i = 0; i < 10; i++) {
            //int x = 0;
            x +=1;
        }
    }
    
    public static void main(String[] args) {
        IncorrectMethod obj = new IncorrectMethod();
        obj.IncorrectMethod();
    }
}
