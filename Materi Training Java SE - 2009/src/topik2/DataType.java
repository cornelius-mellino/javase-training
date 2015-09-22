/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik2;

/**
 *
 * @author Koo
 */
public class DataType { //DataTypes and Literals
    private static byte byteVar;
    private static short shortVar;
    private static int intVar;
    private static long longVar;
    private static float floatVar;
    private static double doubleVar;
    
    private static char charVar;
    private static boolean booleanVar;
    
    public static void main(String[] args) {
        
            byteVar = 2;
            byteVar = 129; //int literal
            byteVar = 077; //int literal
            byteVar = 0xF; //int literal
            
            shortVar = 0;
            shortVar = byteVar;
            shortVar = 200000; //int literal
            shortVar = 077777;
            shortVar = 0xFF;
            
            intVar = -12;
            intVar = shortVar;
            intVar = (int)2000000000000; //int literal
            intVar = 07777777777;
            intVar = 0xCAFEBABE;
            
            longVar = -12;
            longVar = shortVar;
            longVar = 2000000000000; //int literal
            longVar = 07777777777;
            longVar = 0xCAFEBABE;
            longVar = 0.938;
            longVar = 999999999999999999L; //long literal (with L or l behind)
            
            floatVar = -12.34; //double literal
            floatVar = intVar;
            floatVar = 239489343490390483098409384093809430943.349830989384092380982093; //double literal
            floatVar = 07777777777777777777777777777777777777777777; //int literal
            floatVar = 07777777777; //int literal
            floatVar = 0xFFFFFFFFFFFF; //int literal
            floatVar = 0xFFFFFFFF; //int literal
            floatVar = - 333.943e2F; //float literal (with F or f behind)
            floatVar = 0.45e-4f; //float literal (with F or f behind)
            
            doubleVar = -4444.239;
            doubleVar = floatVar;
            doubleVar = 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.322323;
            doubleVar = 07777777777777777777777777777777777777777777;
            doubleVar = 07777777777;
            doubleVar = 0xFFFFFFFFFFFF;
            doubleVar = 0xFFFFFFFF;
            doubleVar = true;
            doubleVar = -45.888e-32434;
            doubleVar = 10e2;
            doubleVar = 30e4F;
            
            booleanVar = true; //boolean literal
            booleanVar = True;
            booleanVar = TRUE;
            booleanVar = false; //boolean literal
            
            charVar = 'a'; //character literal
            charVar = 'ab';
            charVar = '\u8892'; //character literal (unicode) \u0000-\uFFFF
            charVar = '\uFF';
            charVar = '\101';
            charVar = '\777';
            
            System.out.println('\101'); // 'A'
            
            String varString = "1234567890AbcDefGHiJKlmnOpqrstuvwxyz"; //string literal
            
            
    }
}
