/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik10;

/**
 *
 * @author Koo
 */
public class TestString {
       public static void main(String[] args) {
           String msg="   Welcome To Java";
           System.out.println(msg.substring(3,6));
           System.out.println(msg.substring(5));
           
           System.out.println(msg.toLowerCase());
           System.out.println(msg.toUpperCase());
           System.out.println(msg.trim());
           System.out.println(msg.replace('a','x'));
           
           System.out.println(msg.indexOf('a'));
           System.out.println(msg.indexOf('a',16));  
           
           System.out.println(msg.indexOf("Java"));
           
           StringBuffer strBuf=new StringBuffer();
           System.out.println(strBuf.capacity());
           
           strBuf.append("Welcome");
           strBuf.append(" ");
           strBuf.append("to");
           strBuf.append(" ");
           strBuf.append("Java");
           
           strBuf.delete(5, 6);
           System.out.println(strBuf);
           
           strBuf.replace(5, 5, "PHP");
           System.out.println(strBuf);
           
           strBuf.reverse();
           System.out.println(strBuf);
           
           System.out.println(strBuf.capacity());
           
           System.out.println(strBuf.length());
           strBuf.setLength(36);
           System.out.println(strBuf);
           
           System.out.println(strBuf.capacity());           
       }
               
}
