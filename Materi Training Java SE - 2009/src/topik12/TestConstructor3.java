/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik12;

/**
 *
 * @author Koo
 */
public class TestConstructor3 {
    private int i = 20;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    public void printI() {
        System.out.println(this.i);
        System.out.println(this.getI());
    }
    
    public static void main(String[] args) {
        TestConstructor3 test = new TestConstructor3();
        test.setI(50);
        test.printI();
    }
}
