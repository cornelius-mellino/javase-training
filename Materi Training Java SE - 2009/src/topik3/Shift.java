/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik3;

/**
 *
 * @author Koo
 */
public class Shift {
    public static void main(String[] args) {
        int bytes = 0x80000000;
        
        System.out.println(bytes);  // 1000 0000 0000 0000 0000 0000 0000 0000
        System.out.println(bytes>>4); // 1000 1000 0000 0000 0000 0000 0000 0000
        System.out.println(bytes<<4); // 0000 0000 0000 0000 0000 0000 0000 0000
        System.out.println(bytes>>>4); // 0000 1000 0000 0000 0000 0000 0000 0000
    }
}
