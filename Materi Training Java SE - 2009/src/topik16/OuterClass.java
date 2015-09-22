/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik16;

/**
 *
 * @author Koo
 */
public class OuterClass {
	private int data;	// outer class data
	public void method() {  // outer class method
	    InnerClass instance = new InnerClass();
	}
	
	//inner class
	class InnerClass {
		//method inside inner class
		public void method() {
		    data++;	//can directly reference data and method defined in outer class
		    method();
		}	
	}

        private static int staticData;	// outer class data
	public void staticMethod() {  // outer class method
	    InnerClass instance = new InnerClass();
	}
        
        static class StaticInnerClass {
		//method inside inner class
		public void staticMethod() {
		    staticData++;	//can directly reference data and method defined in outer class
		    staticMethod();
		}	
	}
}

