/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik9;

/**
 *
 * @author Koo
 */
public interface Bicycle {
    int numberOfGear = 5;
    int currentSpeed = 60;
    int currentCadence = 50;
    int currentGear = 2;
    
    void changeGear();
    void changeCadance();
    void Break();
}
