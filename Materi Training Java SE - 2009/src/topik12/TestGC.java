/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik12;

/**
 *
 * @author Koo
 */
class Garbage {
    @Override
    protected void finalize() {
        System.out.println("finalize executed");
    }
}

public class TestGC {
        static int i;    
    public static void main(String[] args) {
        int a;
        System.out.println(i);
        System.out.println("variable "+i);
        Garbage g = new Garbage();
        g = null;
        System.gc();
    }
}
