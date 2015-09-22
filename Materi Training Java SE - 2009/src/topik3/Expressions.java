/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik3;

/**
 *
 * @author Koo
 */
public class Expressions {
    
    static int hasil = 0;
    //System.out.println("tiga"); //just statement
    
    {
        System.out.println("tiga"); //just statement
    }
    
    public static void main(String[] args) {
        int satu = 1; //declaration statements
        int dua = 2;
        int tiga = satu + dua; //declaration + assignment
        //int adder = 0;
        {
            //System.out.println(adder); //just statement
        }
        
        { //try to open this comment and see what happen
        int adder;
        
        hasil = adder + 5;
        }
        
        double offset = 0.5;
        
        //float result = 30 + adder / 2 * offset; // loss of precision, why ?
        
        double result2 = 30 + hasil * offset;
        
        System.out.println(result2);
        
        result2 = (30 + hasil) * offset; //expression or assignment statement
        
        result2 = ~((int)result2);
        
        System.out.println(result2);
        
        //control flow statement
        if (!(result2 > 0)) {
            System.out.println("ok");
        }
        else {
            System.out.println("not ok");
        }
        
        //operator ?: bukan pengganti if-else
        /*(result > 0) ?
            System..out.println("ok"t2);
        :
            System.out.println("not ok");*/
            
        //pemakaian ?: yang benar
        System.out.println(result2 > 0 ? result2++ : result2--);
        result2 = result2 > 0 ? result2++ : result2--;
        
        String str = new String("ABCD");
        if (str instanceof String) {
            System.out.println("Tipe string");
        }
    }
}
