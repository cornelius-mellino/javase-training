/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik7;

import java.io.IOException;

/**
 *
 * @author Koo
 */
public class Parent {
    private int val = 0;
    
    public float add(float a, float b) {
        return a+b;
    }
    
    final int add(int a, int b) throws Exception, IOException {
        return a+b;
    }
    
    public static int substract(int a, int b) {
        return a-b;
    }
}
