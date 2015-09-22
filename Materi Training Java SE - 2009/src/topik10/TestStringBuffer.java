/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik10;

/**
 *
 * @author Koo
 */
public class TestStringBuffer {

    public static void main(String[] args){
        StringBuffer strBfr = new StringBuffer();
        System.out.println(strBfr.length());
        System.out.println(strBfr.capacity());
        strBfr.setLength(17);
        System.out.println(strBfr.length());
        System.out.println(strBfr.capacity());
        
        strBfr.append("Welcome");
        strBfr.append(" ");
        strBfr.append("To");
        strBfr.append(" ");
        strBfr.append("Java School");
        
        System.out.println(strBfr.length());
        System.out.println(strBfr.capacity());
        
        System.out.println("isi string buffer "+ strBfr);
        System.out.println("delete isi string buffer "+ strBfr.delete(1, 10));
                System.out.println(strBfr.length());
        System.out.println(strBfr.capacity());
        System.out.println("reverse isi string buffer " + strBfr.reverse());
        System.out.println("replace isi string buffer " + strBfr.replace(5, 12, "HELLO WORLD"));

        
        System.out.println("delete isi string buffer "+ strBfr.replace(2, 5, "ya"));
        System.out.println("delete isi string buffer "+ strBfr.reverse());
        System.out.println(strBfr.charAt(21));
    }
}
