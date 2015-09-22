/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik5;

/**
 *
 * @author Koo
 */
public class TestAbstractMethod {
    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass() {

            @Override
            public int add(int a, int b) {
                return a+b;
            }

            @Override
            public int multiply(int a, int b) {
                return a*b;
            }
        };
        
    }
}
