/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik13.parent.child;

/**
 *
 * @author Koo
 */
public class TestPackage {
    public void methodB() {
        System.out.println("methodB - Child");
    }
    
    public static void main(String[] args) {
        topik13.parent.TestPackage tp = new topik13.parent.TestPackage();
        tp.methodA();
    }
}
