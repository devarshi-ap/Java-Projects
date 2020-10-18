/*
*
* @author devarshi
* @since 2020-10-18
*
* User-promtped int is converted to roman numerals using
* treemap and OOP
*/

import java.util.TreeMap;
import java.util.Scanner;



public class Roman {

    //private instance treemap
    private static TreeMap<Integer, String> numerals = new TreeMap<Integer, String>();


    //empty static method used to add table of roman numeral ints and their corresponding letters to treemap
    static {

        numerals.put(1000, "M");
        numerals.put(900, "CM");
        numerals.put(500, "D");
        numerals.put(400, "CD");
        numerals.put(100, "C");
        numerals.put(90, "XC");
        numerals.put(50, "L");
        numerals.put(40, "XL");
        numerals.put(10, "X");
        numerals.put(9, "IX");
        numerals.put(5, "V");
        numerals.put(4, "IV");
        numerals.put(1, "I");

    }



    /* Finds closest roman numeral int from treemap that's <= int parameter.
    *  Then returns the value of that roman numeral int's key from the treemap using get().
    */
    public static String toRoman(int num) {
        int x =  numerals.floorKey(num);
        
        if ( num == x ) {
            return numerals.get(num);
        }

        return numerals.get(x) + toRoman(num - x);
    }



    // Uses the toRoman method in the Roman class to get Roman numeral of the int.
    // If user enters something other than int, the try-catch will catch the exception and output message.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter whole number to convert to Roman Numeral: ");
            int number = sc.nextInt();
            System.out.println( number + "\t =\t " + Roman.toRoman(number) );

        } catch(Exception e) {
            System.out.printf("%n%nEnter Valid Whole Number!%n%n%n");
        }

        sc.close();
    }


}
