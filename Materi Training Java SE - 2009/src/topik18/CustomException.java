/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik18;

/**
 *
 * @author Koo
 */
public class CustomException extends Exception{
    String message = "custome exception";
    public CustomException(){
    }
    public CustomException(String s){
        super(s);
    }
}
