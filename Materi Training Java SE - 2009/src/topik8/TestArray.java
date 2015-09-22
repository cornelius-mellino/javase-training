/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package topik8;

/**
 *
 * @author Koo
 */
public class TestArray {
    private int[] myArr;

    public int[] getMyArr() {
        return myArr;
    }

    public void setMyArr(int[] myArr) {
        this.myArr = myArr;
    }
    
    public void printArray(){
        for(int i=0;i<myArr.length;i++){
            System.out.println("Isi Array Index "+ i + myArr[i]);
        }
    }
    
    public static void main(String[] arg) {
        double[] myList;
        myList = new double[] {2,3};
        System.out.println(myList.length);
        
        byte[] arByte = {1,2,3,4};
        arByte = new byte[4];
        
        arByte[0] = 1;
        arByte[1] = 2;
        arByte[2] = 3;
        arByte[3] = 4;
        
        for (int i=0; i<arByte.length; i++)
        {
            System.out.println(arByte[i]);
        }
        
        int[] arInt;
        arInt = new int[2];
        
        arInt[0] = 1;
        arInt[1] = 4;
        
             
        TestArray a = new TestArray();
        a.setMyArr(arInt);
        
        a.printArray();
        
        double[] arDouble = new double[5];
        
        long[] arLong1 = {101, 202, 303, 404, 505};
        
        long[] arLong2;
        arLong2 = new long[] {100, 200, 300, 400, 500};
        System.out.print(arLong1.length);
        //looping copy
        //.arraycopy(arg, srcPos, arInt, destPos, length);
        int[] arInt1 = new int[5];
        System.arraycopy(arInt, 0, arInt1, 2, arInt.length);
        //a.setMyArr(arInt1);
        //a.printArray();
        
        int[] arInt2;
        arLong2 = arLong1.clone();
        arInt2 = arInt1.clone();
        a.setMyArr(arInt2);
        a.printArray();
        
        String[] strlist = new String[]{"satu","dua",new String("tiga")};
        
        
        String str[] = new String[3];
        str[0] = new String("1");
        str[1] = new String("2");
        str[2] = new String("3");
        
        for(int i=0; i<str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
