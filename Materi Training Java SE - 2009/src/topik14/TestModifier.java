/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik14;
import topik15.*;

/**
 *
 * @author Koo
 */
public class TestModifier {
    private String nama = "java";
    protected String alamat;
    
    public static void main(String args[]){
        TestModifier testModifier =  new TestModifier();
        System.out.println(testModifier.nama);
        System.out.println(testModifier.alamat);
        
        A a = new A();
    }
}
