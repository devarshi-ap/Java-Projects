/*
*
* @author dev
* @since 2020-03-09
*
* Prompts user for number, uses a while loop and counter variable to determine the number of digits X has.
* Program accounts for both positive and negative inputs.
*/


import java.util.Scanner;

public class Num_Digits
{
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	    
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
        
        
                // Initializes counter called 'digit' to 0
		int digits = 0;
        
        
		/*while the number inputted isn't 0, it will divide the number by 10 
		and set it as the new value. The value of digit will be incremented 
		by 10 to represent one digit.
		*/
		while (Math.abs(num) != 0)
		{
		    num = num/10;
		    digits++;
		}
		
		System.out.printf("%n%nNumber of digits in the number: %d", digits);
		
	}
}

