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
        String answer;

    do {
        //Initialize at 1 because 0 multiplication returns 0
        long factorial = 1;

        //Get Number From User
        //Changed to reflect 20 being the largest integer to return a factorial
        int num = Validation.getInt(scan, userName + ", Please enter a " +
                "number between 1 and 20:\n", 1, 20);

        //Generates Factorial
        factorial(num);

        //Output Results
        System.out.println(userName + ",\nThe factorial of " + num + " is " + factorial);


        answer = Validation.getString(scan, "Would you like to Continue?" +
                "\n(Type yes or no)").toLowerCase();

    } while (answer.toLowerCase().charAt(0) == 'y');

        //GoodBye
        GreetExit.bye(userName);
        scan.close();

    }



    public static long factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

}
