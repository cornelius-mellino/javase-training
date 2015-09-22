/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik10;

/**
 *
 * @author Koo
 */
public class Intern {
    public static void main(String[] args) {
        String s1 = "Javaschool";
        String s2 = new String("Javaschool");
        String s3 = s2.intern();

        //Perbandingan isi    
        System.out.println("s1 eq s2 is "+(s1.equals(s2)));
        System.out.println("s1 eq s3 is "+(s1.equals(s3)));       
        System.out.println("s2 eq s3 is "+(s2.equals(s3)));
        
        //Perbandingan alamat
        System.out.println("s1 = s2 is "+(s1==s2));
        System.out.println("s1 = s3 is "+(s1==s3));       
        System.out.println("s2 = s3 is "+(s2==s3));        
        
    }
}
