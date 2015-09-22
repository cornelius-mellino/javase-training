/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Koo
 */
class Arithmatic{
    static short add(short a, short b) throws IOException {
        return (short)(a+b);
    }    
}

class Calculator extends Arithmatic{
    protected byte add(byte a, byte b) throws Exception {
        return (byte)(a+b);
    }   

    static short add(short a, short b) throws IOException {
        return (short)(a+b);
    } 
}
public class Overloaded {
    
    //buat method add dengan tipe-tipe lain
    
    public static int add(int a, int b) throws IOException {
        System.out.println("int");
        return a+b;
    }

    private static long add(long a, long b) throws FileNotFoundException {
        System.out.println("long");
        return a+b;
    }
        
    protected static short add(short a, short b)  throws IOException {
        System.out.println("short");
        return (short) (a + b);
    }
    
    public static void coba(String s){
        System.out.println("Void Method" + s);
    }
    
    public int coba(int s){
        System.out.println("int Method"+ s);
        return 0;
    }
    
    public static void main(String[] args) {
        try {
            // panggil methodnya satu persatu di sini
            add((short)1, (short)2);
        } catch (IOException ex) {
            Logger.getLogger(Overloaded.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
