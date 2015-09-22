/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik12;

/**
 *
 * @author Koo
 */
class Static {
    private static int[] staticArray;
    
    static {
        System.out.println("it will run just once!");
        
        staticArray = new int[4];
        
        for (int i = 0; i < staticArray.length; i++) {
            staticArray[i] = (int) (Math.random()*10);
        }
    }
    
    public static void print() {
        for (int i = 0; i < staticArray.length; i++) {
            System.out.print(staticArray[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}

class NonStatic {
    private int[] nonStaticArray;
    
    {
        System.out.println("it will run everytime the object created!");
                
        nonStaticArray = new int[4];
        
        for (int i = 0; i < nonStaticArray.length; i++) {
            nonStaticArray[i] = (int) (Math.random()*10);
        }
    }
    
    public void print() {
        for (int i = 0; i < nonStaticArray.length; i++) {
            System.out.print(nonStaticArray[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}

public class TestStaticInitialization {
    public static void main(String[] args) {
        Static s1 = new Static();
        s1.print();
        
        Static s2 = new Static();
        s2.print();
        
        NonStatic ns1 = new NonStatic();
        ns1.print();
        
        NonStatic ns2 = new NonStatic();
        ns2.print();        
    }
}
