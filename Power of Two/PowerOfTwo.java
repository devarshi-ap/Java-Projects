/*
*
*  @author dev
*  @since 2020-09-11
*
*  Checks if a given number is a power of two using
*  a static method with Math.log implementation
*
*/

import java.util.Scanner;
import java.lang.Math;


public class PowerOfTwo{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        for(int i=0; i<n; i++){
            
            long x = sc.nextLong();

            if(isPowerOfTwo(x)){
                System.out.println("T");
            } else {
                System.out.println("F");
            }
        }

        sc.close();
    }


    public static boolean isPowerOfTwo(long y) {
        return (long)(Math.ceil((Math.log(y) / Math.log(2))))  == (long)(Math.floor(((Math.log(y) / Math.log(2)))));
    }

}
