/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik9;

/**
 *
 * @author Koo
 */
public interface ParentInterface {
    public static final double PHI = 3.14;
    public final double PHI2 = 3.14;
    
    final int LENGTH = 200;
    int WIDTH = 30;
    
    public static abstract void printPhi();
    public abstract void printPhi2();
    public void printPhi3();
    void printPhi4();
}
