/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik16;

import java.util.*;
/**
 *
 * @author Koo
 */
interface RandVals {
  Random rand = new Random();
  int randomInt = rand.nextInt(10);
  long randomLong = rand.nextLong() * 10;
  float randomFloat = rand.nextLong() * 10;
  double randomDouble = rand.nextDouble() * 10;
}

public class TestRandVals {
  public static void main(String[] args) {
    System.out.println(RandVals.randomInt);
    System.out.println(RandVals.randomLong);
    System.out.println(RandVals.randomFloat);
    System.out.println(RandVals.randomDouble);
  }
}
