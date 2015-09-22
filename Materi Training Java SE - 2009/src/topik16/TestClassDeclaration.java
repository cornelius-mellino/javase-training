/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik16;

/**
 *
 * @author Koo
 */
interface Contents {
  int value();
}

public class TestClassDeclaration {
    public static void main(String args[]){
        new Contents(){
          int value(){
              return 0;
          }  
        };
    }
}
