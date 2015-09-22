/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik3;

/**
 *
 * @author Koo
 */
public class Unary {
    public static void main(String[] args) {
        int a = (int) 1.7;
        int b = 2;
        System.out.println(a);
        
        int result = 0;
        
        System.out.println("a before:" + a);
        result = ++a; //a=1 before incr
        System.out.println("result:" + result);
        System.out.println("a after:" + a); //a=2
        System.out.println("------------------------------");
        
        System.out.println("a before:" + a); //a=2               
        result = a++ + 5 + a++ + a--; //a + 5
        
        System.out.println("result:" + result);
        System.out.println("a after:" + a); //a=3
        System.out.println("------------------------------");
        
        System.out.println("a before:" + a); //a=3
        result = ++a + b;
        System.out.println("result:" + result);
        System.out.println("a after:" + a); //a=4
        System.out.println("------------------------------");
        
        System.out.println("a before:" + a); //a=4
        result = a++ + b;
        System.out.println("result:" + result);
        System.out.println("a after:" + a); //a=5
        System.out.println("------------------------------");
        
        System.out.println("a before:" + a); //a=5
        result = b + ++a;
        System.out.println("result:" + result);
        System.out.println("a after:" + a); //a=6
        System.out.println("------------------------------");
        
        System.out.println("a before:" + a); //a=6
        result = b + a++;
        System.out.println("result:" + result);
        System.out.println("a after:" + a); //a=7
        System.out.println("------------------------------");
        
        boolean kondisi = true;
        System.out.println(!kondisi);
        
        byte varByte = 0;
        System.out.println(~varByte);
        //System.out.println(~kondisi);
        
    }
}
