/**
*
* @author devarshi
* @since 2020-07-04
*
* The Collatz conjecture is a conjecture in mathematics that concerns a sequence defined as follows:
*     
*       f(n) = { n/2        if n is even
*              { 3n + 1     if n is od
*
* 
*  Start with a number n > 1.
*  Find the number of steps it takes to reach 1.
*/

import java.util.Scanner;


public class CollatzSequence
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        

        System.out.print("Starting number: ");      // asks for number
        int num = sc.nextInt();
        int count = 0;
        
        
        System.out.print(num + "   ");      // prints beginning number
        
        
        while(num > 1)
        {
            if(num % 2 == 0)
            {
                num = num/2;
                count++;
                
            } else {
                num = 3*num + 1;
                count++;
            }
            
            System.out.print(num + "   ");
        }

        System.out.printf("%n%n%n Count: %d%n", count);     // prints how many iterations it took to get to 1 from the start #
        sc.close();

	}
}
