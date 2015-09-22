/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik16;

/**
 *
 * @author Koo
 */

final class Days {
  private String name;
  
  private Days(String nm) { name = nm; }
  
  @Override
  public String toString() { return name; }
  
  public static final Days
    SEN = new Days("Senin"),
    SEL = new Days("Selasa"),
    RAB = new Days("Rabu"),
    KAM = new Days("Kamis"),
    JUM = new Days("Jumat"),
    SAB = new Days("Sabtu"),
    MIN = new Days("Minggu");
    
  public static final Days[] days =  {  SEN, SEL, RAB, KAM, JUM, SAB, MIN  };
  
  public static final Days number(int ord) {
    return days[ord - 1];
  }
}

public class TestGroupingConstants {
  public static void main(String[] args) {
    Days d = Days.SEN;
    
    System.out.println(d);
    d = Days.number(3);
    System.out.println(d);
    System.out.println(d == Days.MIN);
    System.out.println(d.equals(Days.KAM));
    System.out.println(Days.days[3]);
  }
}
