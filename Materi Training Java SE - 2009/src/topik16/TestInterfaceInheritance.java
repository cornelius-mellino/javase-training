/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik16;

/**
 *
 * @author Koo
 */
interface IParent1 {
    int par1 = 2;
    
    void showPar1();
}

interface IParent2 {
    int par2 = 3;
    
    void showPar2();
}

interface IChild extends IParent1, IParent2 {
    
}


class TestClass implements IChild {

    public void showPar1() {
        System.out.println(par1);
    }

    public void showPar2() {
        System.out.println(par2);
    }
    
}

public class TestInterfaceInheritance {
    public static void main(String[] args) {
        IParent1 varA = new TestClass();
        IParent2 varB = new TestClass();
        IChild varC = new TestClass();
    }
}
