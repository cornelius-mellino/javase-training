/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik15;

/**
 *
 * @author Koo
 */
public class TesterDog {
    public static void main(String args[]){
        Dog dog = new Cihuahua();
        dog.bark();
        
        
        dog = new Dalmation();
        dog.bark();
    }
}
