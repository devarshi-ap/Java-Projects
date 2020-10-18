import java.util.Scanner;

public class SimpleRoman{

    public static String toRoman(int input) {

        if (input < 1) return "Input a positive integer";

        String numeralString = "";

        while (input >= 1000) {
            numeralString += "M";
            input -= 1000;        
        }
        while (input >= 900) {
            numeralString += "CM";
            input -= 900;
        }
        while (input >= 500) {
            numeralString += "D";
            input -= 500;
        }
        while (input >= 400) {
            numeralString += "CD";
            input -= 400;
        }
        while (input >= 100) {
            numeralString += "C";
            input -= 100;
        }
        while (input >= 90) {
            numeralString += "XC";
            input -= 90;
        }
        while (input >= 50) {
            numeralString += "L";
            input -= 50;
        }
        while (input >= 40) {
            numeralString += "XL";
            input -= 40;
        }
        while (input >= 10) {
            numeralString += "X";
            input -= 10;
        }
        while (input >= 9) {
            numeralString += "IX";
            input -= 9;
        }
        while (input >= 5) {
            numeralString += "V";
            input -= 5;
        }
        while (input >= 4) {
            numeralString += "IV";
            input -= 4;
        }
        while (input >= 1) {
            numeralString += "I";
            input -= 1;
        }    

        return numeralString;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to onvert to Roman Numeral: ");
        int number = sc.nextInt();

        System.out.println(number + "     =     " + toRoman(number));

        sc.close();
    }
}
