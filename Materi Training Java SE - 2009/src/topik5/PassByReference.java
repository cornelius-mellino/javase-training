/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik5;

    
/**
 *
 * @author Koo
 */
class Motorcycle {
    private int wheel = 2;

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
    
}

public class PassByReference {
    static void modifyMotorcycle(Motorcycle m, int num) {
        m.setWheel(num);
    }
    
    public static void main(String[] args) {
        Motorcycle bajaj = new Motorcycle();
        
        //berapa nilai wheel di object bajaj ?
        
        modifyMotorcycle(bajaj,3);
        
        //berapa nilai wheel di object bajaj ?
    }
}
