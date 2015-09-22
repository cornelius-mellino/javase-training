/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik13.parent;

/**
 *
 * @author Koo
 */
public class TestPackage {
    public void methodA() {
        System.out.println("methodA - Parent");
    }
    
    public static void main(String[] args) {
        topik13.parent.child.TestPackage tp = new topik13.parent.child.TestPackage();
        tp.methodB();        
    }
}
