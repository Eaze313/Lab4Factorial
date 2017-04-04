/**
 * James Bryant II
 * 4/3/17
 * Lab4Factorial.java
 *
 * This program calculates the factorial of a number
 *
 * Extended Challenges :
 * (1)Test to find the int for the highest factorial that can be accurately calculated,
 * then modify prompt to go from 1 to the highest possible integer
 *
 * (2)Use Recursion to implement the factorial
 */

package bootcamp;
import java.util.Scanner;

public class Lab4Factorial {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String userName = GreetExit.hello(scan);

        //Initialize at 1 because 0 multiplication returns 0
        long factorial = 1;

        //Get Number From User
        int num = Validation.getInt(scan, userName + ", Please enter a " +
                "number between 1 and 10:\n", 1, 10);

        //Generates Factorial
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }

        //Output Results
        System.out.println(userName + ",\nThe factorial of " + num + " is " + factorial);
        scan.close();

        //GoodBye
        GreetExit.bye(userName);

    }
}
