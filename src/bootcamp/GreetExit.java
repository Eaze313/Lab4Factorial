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
class GreetExit {
    Scanner scan = new Scanner(System.in);
    //Method - Greets the User
    static String hello(Scanner scan) {
        //Greeting and UserName Request

        String user = Validation.getString(
                scan, "Hi. Welcome to the Factorial Calculator!!!\n" +
                        "Please tell me your name?\n");

        return user;
    }

    //Method - Farewells the User
    static String bye(String userName) {
        return "\nFarewell " + userName + ",\nUntil Next Time!!!";
    }




}

