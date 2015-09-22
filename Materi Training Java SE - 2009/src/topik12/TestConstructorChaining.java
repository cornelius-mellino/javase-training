/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik12;

/**
 *
 * @author Koo
 */
abstract class Animal {
    //Animal() {
        //System.out.println("Animal's constructor");
    //}
   
    Animal(int i) {
        System.out.println("Animal's constructor "+ i);
    }
    
    public abstract void sound();
}


class Mammal extends Animal {
    Mammal() {
        super(6);
        System.out.println("Mammal's constructor");
    }
    
    @Override
    public void sound() {
        System.out.println("Mammal's sound");
    }

}
class Horse extends Mammal {
    Horse() {
        System.out.println("Horse's constructor");
    }
    
    public void sound() {
        System.out.println("Hihihihi");
    }    
}

public class TestConstructorChaining {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        
        //How to create the class and implement methods instantly ?
        
        
        //Mammal mammal = new Mammal();
        Horse horse = new Horse();
    }
}
