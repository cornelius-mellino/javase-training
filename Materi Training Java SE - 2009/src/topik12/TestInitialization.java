/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik12;

/**
 *
 * @author Koo
 */
public class TestInitialization {
    TestInitialization() {
        int x;
        
        System.out.println(x);
    }
    
    int i = methodA(j);
    int j = methodB();
    
    public int methodA(int i) {
        return i++;
    }
    
    public int methodB() {
        return 0;
    }
    
    public static void main(String[] args) {
        TestInitialization test = new TestInitialization();
        
        
    }
}
