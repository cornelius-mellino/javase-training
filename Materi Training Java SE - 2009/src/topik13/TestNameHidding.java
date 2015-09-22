/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik13;

/**
 *
 * @author Koo
 */
class A{
    private int methodX(int x){
        System.out.println(x);
        return 0;
    }
}

class B extends A{
    public double methodX(final double x){
        System.out.println(x);
        //x = 5;
        return 0;
    }
}

public class TestNameHidding {
    public static void main(String args[]){
        B b = new B();
        int a = 5;
        double c = 8;
        
        b.methodX(a);
        b.methodX(c);
    }
}
