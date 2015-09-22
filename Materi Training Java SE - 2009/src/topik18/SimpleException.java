/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik18;

/**
 *
 * @author Koo
 */
public class SimpleException {
    public static int bagi(int a, int b) throws CustomException {
        if(b==0){
            //throw new ArithmeticException("pembagi sama dengan nol");
            throw new CustomException("pembagi sama dengan nol");
        }
        return a/b;
    }
    public static void main(String args[]){
        int i = 1;
        int result = 0;
        try{
            result = 2/i;
            System.out.println("ok");
            result = bagi(2,0);
        }
        catch(CustomException err){
            System.out.println(err.getMessage());
        }
        catch(ArithmeticException err ){
            System.out.println(err.getMessage());
        }
        catch(Exception err ){
            System.out.println(err.getMessage());
        }
        finally{
            System.out.println("finally");
        }
    }
}
