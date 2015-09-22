/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik12;

/**
 *
 * @author Koo
 */
class TestExample {
    private TestExample() {
        System.out.println("default");
    }
    
    TestExample(String a) {
        System.out.println(a);
    }
}

public class Example {
    public static void main(String[] args) {
        TestExample te = new TestExample("david"); 
        te = new TestExample();
        
        Math m = new Math();
        Math.random();
    }
}