/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik4;

/**
 *
 * @author Koo
 */
public class BreakWithLabel {
    
    //explain the flow of the program
    public static void main(String[] args) {
        int val = 3;
        
        Block1:
        {
            Block2:
            {
                Block3:
                for (int i=0; i < 10; i++) {
                    if (i > 9) break;
                    
                    while(val != 0) {
                        System.out.println(val);
                        val--;
                        if (val == 2) break Block1;
                        else break Block2;
                    }
                }
                System.out.println("Break Block3");
            }
                            System.out.println("Break Block2");
        }
                 System.out.println("Break Block1");       
        
    }
}
