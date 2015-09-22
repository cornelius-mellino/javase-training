/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik3;

/**
 *
 * @author Koo
 */
public class TypeCasting {
    public static void main(String[] args) {
        byte varB = 12;
        short varS = 503;
        int varI = 989;
        long varL = 2000000L;
        
        float varF = 5943e20F;
        double varD = 982938.09823;
        
        char varC = 'i';
        boolean varBool = true;
        
        //byte to anything
        varB = varS;
        varB = varI;
        varB = varL;
        varB = varF;
        varB = varD;
        varB = varC;
        varB = varBool;
        
        //short to any
        varS = varB;
        varS = varI;
        varS = varL;
        varS = varF;
        varS = varD;
        varS = varC;
        varS = varBool; //boolean is boolean

        //int to any
        varI = varB;
        varI = varS;
        varI = varL;
        varI = varF;
        varI = varD;
        varI = varC; //char can be converted to number types
        varI = varBool;
        
        //long to any
        varL = varB;
        varL = varS;
        varL = varI;
        varL = varF;
        varL = varD;
        varL = varC; 
        varL = varBool;
        
        //float to any
        varF = varB;
        varF = varS;
        varF = varI;
        varF = varL;
        varF = varD;
        varF = varC;
        varF = varBool;
        
        //double to any
        varD = varB;
        varD = varS;
        varD = varI;
        varD = varL;
        varD = varF;
        varD = varC;
        varD = varBool;
        
        //char to any
        varC = varB;
        varC = varS;
        varC = varI;
        varC = varL;
        varC = varF;
        varC = varD;
        varC = varBool;
    }
}
