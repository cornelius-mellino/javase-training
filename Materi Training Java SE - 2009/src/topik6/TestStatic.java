/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik6;

/**
 *
 * @author Koo
 */
class Sepeda{
    public static int counter=0;
    public String lamp;
    public static int gear;
    
    public Sepeda(){
        counter++;
    }
}
public class TestStatic {
    public static void main(String args[]){
        Sepeda federal = new Sepeda();
        Sepeda bmx = new Sepeda();
        federal.lamp = "on";
        federal.gear = 1;
        
        System.out.println(federal.gear);
        
        bmx.lamp = "off";
        bmx.gear = 5;
        
        System.out.println(federal.lamp);
        System.out.println(federal.gear);
        System.out.println(Sepeda.counter);
        
    } 
}
