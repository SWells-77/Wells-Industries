package week3;

import java.util.Scanner;

public class Week3 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // declaring a variable
        int yourNumber;
        // assign your variable a number
        yourNumber = 10;
        System.out.println("Your Number is " + yourNumber);

        // declare AND assign your variable
        int myFavoriteNumber = 42;
        System.out.println("My favorite number is " + myFavoriteNumber);

        //double = number with a decimal number
        double numberWithADecimal = 7.7;

        yourNumber = 12;
        System.out.println("Your Number is " + yourNumber);

        //double can hold an int
        numberWithADecimal = 12;

        //int cannot hold double
        // yourNumber = 12.2

        //      Naming values should typically be nouns with descriptive adj., that
        // are meaningful.
        // Java doesn't care about our variable names, people care

        numberWithADecimal = yourNumber;
        System.out.println("Your decimal number is " + numberWithADecimal);
        System.out.println(yourNumber);

        //Please Excuse My Dear Aunt Sally
        //(Parentheses) Exponent (Multiplication Division) (Addition Subtraction)
        System.out.println("What is 5 - 2 +3");
        System.out.println(5 - 2 + 3);

        System.out.println("most people cannot figure this out: 9 / 3 * 3 + 2");
        System.out.println(9 /3 * 3 +2);

        myFavoriteNumber = 10 + 2;
        myFavoriteNumber = myFavoriteNumber + 10;
        //combined assignment operator
        myFavoriteNumber += 10;
        System.out.println(myFavoriteNumber);

        //Not a combined assignment operator the sets the value of the variable to 10
        myFavoriteNumber =+ 10;
        System.out.println(myFavoriteNumber);

        myFavoriteNumber = yourNumber * 3 + 6;
        System.out.println("My favorite number is " + myFavoriteNumber);

        //integer division produces integer results - % is the modulus operator that gives us the remainder
        System.out.println("5/2 == " + 5 / 2 + " with a remainder of " + 5 % 2);

        //to get a double result, one or both need to be a double
        double answer = 5.0 / 2;
        System.out.println("The answer to 5 / 2, with a decimal result  is " + answer);
        // To treat a value as a double, you can cast it using (double)
        double dividendOfMyandYourFavoriteNumbers = (double) myFavoriteNumber / yourNumber;
        System.out.println("My Favorite Number Divided by Your Favorite Number = "  + dividendOfMyandYourFavoriteNumbers);

        String firstName = "Steve";
        String lastName = "Wells";
        System.out.println(firstName + " " +  lastName);

        String fullName = firstName + " " +  lastName;
        System.out.println("My name is " + fullName);

        String stevesFavoriteNumber = fullName + " " + myFavoriteNumber;
        System.out.println(stevesFavoriteNumber);

        // The backslash is an "escape" character. It means the next letter is special.
        System.out.println("My friend Dan said \n \"Hi Steve!\"");

        // \n new line - Goes down a line
        System.out.println("New Line == \n \\n");
        System.out.println("Roman Reigns == \n \\The OTC");
        // \t is a tab
        System.out.println("");
        System.out.println("\t Full Gospel                1-Romans");
        System.out.println("\t Completion of the Gospel   2-Revelation");
        System.out.println("\t Heart and character of God 3-Psalms");

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello, what's your name?");
        String name = keyboard.nextLine();

        System.out.println("Nice to meet you, " + name);

        System.out.println("How many coffees would you like to buy today?");
        int coffeesForToday = Integer.parseInt(keyboard.nextLine());

        System.out.println("How much does a coffee cost?");
        double costPerCoffee = Double.parseDouble(keyboard.nextLine());

        double totalCostForCoffee =costPerCoffee * coffeesForToday;

        System.out.println("How much money do you have?");
        double pocket = Double.parseDouble(keyboard.nextLine());
        // If the expression inside the ( ) is true, the if block runs
        if (pocket >= totalCostForCoffee) {
            System.out.println("That will cost you $" + costPerCoffee * coffeesForToday);
        }    else { // If the if statement is false
            System.out.println("You don't have enough money.");
        }





    }



    }


