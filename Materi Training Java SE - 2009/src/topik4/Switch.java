/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik4;

/**
 *
 * @author Koo
 */
public class Switch {
    enum Day {Senin, Selasa, Rabu, Kamis, Jumat, Sabtu, Minggu, Undefined};
    
    public static void main(String[] args) {
        Day hari = Day.Undefined;
        
        switch(hari) {
           
            case Senin  : 
            case Selasa :
            case Rabu   : System.out.println("Nasi Uduk");
            case Kamis  : break;
            default     : System.out.println("Roti Bakar Coklat-Keju");              
            case Jumat  : System.out.println("Nasi Liwet");
            case Sabtu  : {
                System.out.println("Jalan-jalan ke Mall Puri");
                System.out.println("Makan di Seafood Rasane");
                break;
            }
            case Minggu : 
                System.out.println("Puasa");
                System.out.println("Berdoa");
              
            
        }
    }
}
