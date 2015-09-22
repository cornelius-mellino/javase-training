/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik9;

/**
 *
 * @author Koo
 */
public class TryInterfaceInheritance implements ChildInterface {
    public static void main(String[] args) {
        System.out.println(ChildInterface.SPEED);        
    }
    
    public void printPhi() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void printPhi2() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void printPhi3() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
