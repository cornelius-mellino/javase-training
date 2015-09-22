/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik16;

/**
 *
 * @author Koo
 */
interface A {
    int num = 20;
    
    void writeNum();
}

public class TestInterfaceInstantiation {
    public static void main(String[] args) {
        A var1 = new A();
        
        A var2 = new A() {

            public void writeNum() {
                System.out.println(num);
            }
            
        };
    }
}
