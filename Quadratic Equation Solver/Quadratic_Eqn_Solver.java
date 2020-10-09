/*
*
*  @author dev
*  @since 2018-02-12
*
*  An early program that receives values of a, b, and c coefficients from the user
*  and provides information about the quadratic equation such as its quadratic equation, discriminant , and roots (if any)
*
*  Disclaimer to anyone who has eyes, this code is very hard to read and understand as this was made by a grade 10 me.
*  I haven't the time in my grasp to rebuild and recondition this and implement OOP principles. In the meantime, good luck !
*
*/

import java.util.Scanner;
import java.lang.Math;


public class QuadraticFormulaSolver {

    public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
	    
        
        System.out.print("Enter the (a) value in your Quaratic Formula: ");
        double a = sc.nextDouble();

        System.out.print("Enter the (b) value in your Quaratic Formula: ");
        double b = sc.nextDouble();

        System.out.print("Enter the (c) value in your Quaratic Formula: ");
        double c = sc.nextDouble();
        
        System.out.printf("%nYour Quadratic Eq'n: %fx^2 + %fx + %f%n", a, b, c);    // creates quadratic equation from which a,b,c originate



        // This portion finds the # of solutions using the discriminant (b^2 + 4ac)

        double discriminant = b * b - 4 * a * c;
        System.out.printf("Discriminant : %f%n", discriminant);


        //determines if the QuadraticEq'n given has two, one, or no solutions
        if( discriminant > 0 ) {
            System.out.printf("ROOTS : This QuadraticEq'n has two roots.%n");
            
        } else if( discriminant == 0 ) {
            System.out.printf("ROOTS : This QuadraticEq'n has one root.%n");
            
        } else {
            System.out.printf("ROOTS : This QuadraticEq'n has no roots.%n");
        }


        // this next portion finds the actual roots of the QuadraticEq'n by using the Quadratic Formula.


        //this will find the values of the 2 roots if it the discriminant is positive
        if( discriminant > 0 ) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The value of x is %f and %f.", root1, root2);
            
        } else if( discriminant == 0 ) {
            double root1 = -b  / (2 * a);
            System.out.printf("The value of x is %f.", root1);  // this will print the value of 'x' if the discriminant is 0
            
        } else {
            System.out.printf("There are no real roots for this QuadraticEq'n.%n");


    }
}
