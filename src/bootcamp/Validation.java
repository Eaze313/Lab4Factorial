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

public class Validation {
        public static String getString(Scanner sc, String prompt) {
            System.out.print(prompt);
            String s = sc.next();  // read user entry
            sc.nextLine();  // discard any other data entered on the line
            return s;
        }

        public static int getInt(Scanner sc, String prompt) {
            int i = 0;
            boolean isValid = false;
            while (isValid == false) {
                System.out.print(prompt);
                if (sc.hasNextInt()) {
                    i = sc.nextInt();
                    isValid = true;
                } else {
                    System.out.println("Error! That's not a valid number. Try again.");
                }
                sc.nextLine();  // discard any other data entered on the line
            }
            return i;
        }

        public static int getInt(Scanner sc, String prompt,
                                 int min, int max)
        {
            int i = 0;
            boolean isValid = false;
            while (isValid == false) {
                i = getInt(sc, prompt);
                if (i < min)
                    System.out.println(
                            "Negative. That number doesn't have a factorial. Try Again.");
                else if (i > max)
                    System.out.println("Number Too High!!! Answer will not display correctly");
                else
                    isValid = true;
            }
            return i;
        }

    }

