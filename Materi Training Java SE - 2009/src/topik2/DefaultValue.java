/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik2;

/**
 *
 * @author Koo
 */
public class DefaultValue {
    private static byte byteVar;
    private static short shortVar;
    private static int intVar;
    private static long longVar;
    private static float floatVar;
    private static double doubleVar;
    
    private static char charVar;
    private static boolean booleanVar;
    
    public static void main(String[] args) {
        int i=0;
        
        System.out.println(i);
        
        
        System.out.println(byteVar); //0
        System.out.println(shortVar);
        System.out.println(intVar);
        System.out.println(longVar);
        System.out.println(floatVar);
        System.out.println(doubleVar); //0.0
        System.out.println(charVar); //\u0000
        System.out.println(booleanVar); //false
        
        String stringVar; //null
        
        //System.out.println(stringVar);
        
    }
}
