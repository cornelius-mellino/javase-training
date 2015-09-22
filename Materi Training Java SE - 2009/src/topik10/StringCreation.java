/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik10;

/**
 *
 * @author Koo
 */
public class StringCreation {
    public static void main(String[] args) {
        String message = new String("ini pesan");
        
        String anotherMessage = "   ini pesan lainnya    ";
        
        for(int i=0; i<anotherMessage.length(); i++) {
            System.out.println(anotherMessage.charAt(i));
        }
        
        System.out.println(anotherMessage.substring(3,6));
        System.out.println(anotherMessage.substring(5));
        System.out.println(anotherMessage.toLowerCase());
        System.out.println(anotherMessage.toUpperCase());
        System.out.println(anotherMessage.trim());
        System.out.println(anotherMessage.replace("a", "z"));
    }
}
