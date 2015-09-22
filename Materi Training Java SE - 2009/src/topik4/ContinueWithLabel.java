/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik4;

/**
 *
 * @author Koo
 */
public class ContinueWithLabel {
    
    //explain the flow of the program
    public static void main(String[] args) {
        int val = 3;
        
        Block1:
        {
            Block2:
            {
                Block3:
                for (int i=0; i < 10; i++) {
                    if (i == 1) {
                        System.out.println("masuk if");
                        continue;
                    }
                    
                    while(val != 0) {
                        System.out.println(val);
                        val--;
                        if (val == 2) continue Block1;
                        else continue Block2;
                    }
                    return; //exit from method
                }
            }
        }
    }
}
