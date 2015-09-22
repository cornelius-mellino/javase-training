/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik12;

/**
 *
 * @author Koo
 */
class Vehicle {
    private int wheel = 0;
    Vehicle(int wheel) {
        this.wheel = wheel;
    }
    
    public void printWheel() {
        System.out.println(this.wheel);
    }
}

class Motorcycle extends Vehicle {
    Motorcycle() {
        super(2);
    }
    
    @Override
    public void printWheel() {
        super.printWheel();
    }
}

public class TestInvokingSuperConstructor {
    public static void main(String[] args) {
        
    }
}
