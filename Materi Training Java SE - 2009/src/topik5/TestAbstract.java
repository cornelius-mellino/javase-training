/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package topik5;


/**
 *
 * @author Koo
 */
abstract class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }
    
    //ublic abstract int Animal();
    
    private String color;
    private String food;
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public abstract void walk();
    public abstract void sound();
}
public class TestAbstract {

    public static void main(String[] args) {
        //Animal beruang = new Animal();
        
        Animal katak = new Animal() {

            @Override
            public void walk() {
                //throw new UnsupportedOperationException("Not supported yet.");
                System.out.println("Lompat-lompat");
            }

            @Override
            public void sound() {
                //throw new UnsupportedOperationException("Not supported yet.");
                System.out.println("Kwok kwok kwok");
            }
            
        };
    }
}
