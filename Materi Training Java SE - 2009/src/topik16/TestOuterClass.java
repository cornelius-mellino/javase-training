/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik16;

/**
 *
 * @author Koo
 */
public class TestOuterClass {
    public static void main(String[] args) {
        //create instance inner class
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        
        //create static inner class
        OuterClass.StaticInnerClass innerClassStatic = new OuterClass.StaticInnerClass();
    }
}
