/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */

/** The program's purpose is to take two numbers and check if the first number is divisible by the second.
 * The Program accomplishes this by invoking instanced method isDivisible, which checks using the modulus of two
 * parameters, n & m, output a remainder or are equal to 0. If the results of (n % m == 0),
 * then isDivisible returns a True boolean value. If (n % m == any other value), the method returns False value.
 *
 * Using conditional statements, the program then outputs a message declaring if the first number is divisible by the
 * second. */


import java.util.Scanner; // Import Scanner

public class Lab006 {
    /**
     * Declared instanced variables.
     */
    public int n; // Instance variable n
    public int m; // Instance variable m

    /**
     * Constructor that initializes instance variables (n & m) with parameters:
     * @param n initialized to instanced variable n
     * @param m initialized to instanced variable m
     */
    public Lab006(int n, int m) { // Constructor that initializes instance variables to accessible
        // parameters
        this.n = n;
        this.m = m;
    }

    /**
     * This method tests if n is divisible by m by using the modulus operator to look for a remainder.
     * If no remainder is found then the if conditional executes returning a True value. If a remainder is found
     * that the else conditional executes returning a False value.
     * @return Returns either a True or False value based on if (n % m == 0)
     */
    public boolean isDivisible() { // Tests is n is divisible by m and returns true/false
        if (n % m == 0) {
        return true;
        } else
        return false;
    }

    public static void main(String[] args) {

        /**
         * User is asked to input first integer and that value is stored as:
         * @param firstNumber
         * User is then asked to input second integer amd that value is stored as:
         * @param secondNumber
         */
        Scanner in = new Scanner(System.in); // Scanner constructor

        System.out.println("Please enter first integer: "); // Asks for first integer

        int firstNumber = in.nextInt(); // Stores first integer as firstNumber

        System.out.println("Please enter second integer"); // Asks for second integer

        int secondNumber = in.nextInt(); // Stores second integer as secondNumber

        /**
         * Uses lab006 constructor to create lb006 object that takes:
         * @param firstNumber Input is taken from Scanner object, stored as variable firstNumber then input into
         *                    object lab006. lab006 then initializes firstNumber = n, and executes method isDivisible.
         * @param secondNumber Input is taken from Scanner object, stored as variable secondNumber then input into
         *                     object lab006. lab006 then initializes secondNumber = m, and executes method isDivisible.
         */
        Lab006 lab006 = new Lab006(firstNumber, secondNumber); /* Constructor object? that
        takes variables firstNumber & secondNumber and = tp int variables, n and m */

        /**
         * Creates and initializes boolean variable isDivisible and stores the returned value of object lab006,
         * method isDivisible
         */
        boolean isDivisible = lab006.isDivisible(); /* Calls lab006 object method isDivisible
        and stores output as variable isDivisible */

        /**
         * Uses the value stored in variable isDivisible to determine which logic branch to return to System.out
         */
        if (lab006.isDivisible() == true) { // Conditional based on results of isDivisible method with
            // appropriate output text
            System.out.println(firstNumber + " is divisible by " + secondNumber);
        } else {
            System.out.println(firstNumber + " is not divisible by " + secondNumber);
        }

    }

}
