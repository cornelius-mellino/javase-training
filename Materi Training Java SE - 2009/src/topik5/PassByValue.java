/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik5;

/**
 *
 * @author Koo
 */
public class PassByValue {
    public static int process(int a) {
        a++;
        ++a;
        
        return a;
    }
    
    public static void main(String[] args) {
        int a = 1;
        int hasil = 0;
        
        hasil = process(a);
        
        //berapa nilai a sekarang ini ?
        
        System.out.println(a);
        System.out.println(hasil);
    }
}
