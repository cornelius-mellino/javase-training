/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik15;

import topik14.TestModifier;

class Dog {
    private void bark() {
        System.out.println("guk guk guk");
    }
}

class SiberianHusky extends Dog {
    void bark() {
        System.out.println("woof woof");
    }
}

/**
 *
 * @author Koo
 */
public class TestPrivateMethodCall extends TestModifier {

    public TestPrivateMethodCall() {
        System.out.println(alamat);
    }
    
    public static void main(String[] args) {
        Dog dog = new SiberianHusky();
        dog.bark();
        
        TestModifier testModifier = new TestModifier();
        System.out.println(testModifier.alamat);
    }
}
