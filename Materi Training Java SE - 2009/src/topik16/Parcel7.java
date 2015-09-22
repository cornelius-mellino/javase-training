/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik16;

/**
 *
 * @author Koo
 */
class Wrapping {
  private int i;
  public Wrapping(int x) { i = x; }
  public int value() { return i; }
} 

public class Parcel7 {
  public Wrapping wrap(int x) {
    // Base constructor call:
    return new Wrapping(x) { // Pass constructor argument.
      public int value() {
        return super.value() * 47;
      }
    }; // Semicolon required
  }
  
  public static void main(String[] args) {
    Parcel7 p = new Parcel7();
    Wrapping w = p.wrap(10);
    System.out.println(w.value());
  }
} 
