import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t

        do
        {
            System.out.print('\n' + prompt + ": "); // show prompt add space

            retString = pipe.nextLine();

        }while(retString.length() == 0);

        return retString;
    }

    /**
     * gets an int val from the user with no constraints (any int)
     *
     * @param pipe   scanner to use for the input
     * @param prompt msg to user for what to enter
     * @return any valid int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        int value = 0;

        do {

            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);

            }

        }while(!done);
        return value;
    }

    /**
     * returns an unconstrained double value
     * @param pipe user value input
     * @param prompt prompt for user
     * @return returns the value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        double valueD = 0;

        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                valueD = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);

            }
        }while(!done);
        return valueD;
    }

    /**
     * gets an in val from the user with no constraints
     * @param pipe scanner to use for input
     * @param prompt user input
     * @param low the bottom value for the inclusive range
     * @param high the top value for the inclusive range
     * @return any valid int
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        String trash = "";
        int value = 0;

        do
        {

            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine();

                if(value >= low && value <= high)
                    done = true;
                else
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + "]: " + value);
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);

            }
        }while(!done);
        return value;
    }

    /**
     * gets an in val from the user with no constraints
     * @param pipe scanner to use for input
     * @param prompt
     * @param low the bottom value for the inclusive range
     * @param high the top value for the inclusive range
     * @return any valid int
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        String trash = "";
        double value = 0;

        do
        {

            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine();

                if(value >= low && value <= high)
                    done = true;
                else
                    System.out.println("\nYou must enter a value within the range [" + low + " - " + high + "]: " + value);
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou must enter a number. You entered: " + trash);

            }
        }while(!done);
        return value;
    }

    /**
     * confirms whether the user has entered a Y or N and then returns a boolean accordingly
     * @param pipe scanner to use for input
     * @param prompt string to prompt user for input
     * @return boolean that is either true or false
     */
    public static boolean getYNconfirm(Scanner pipe, String prompt)
    {
        boolean done = false;
        boolean retVal = false;
        String response = "";
        do
        {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();
            if(response.matches("[Yy]"))
            {
                retVal = true;
                done = true;
            }
            else if(response.matches("[Nn]"))
            {
                retVal = false;
                done = true;
            }
            else
            {
                System.out.println("You have entered an incorrect string, please resubmit a correct response [YN]: ");
            }
        }while(!done);

        return retVal;
    }

    /**
     * takes a RegEx String and returns a valid match from the user
     * @param pipe scanner to use
     * @param prompt user input
     * @param regEx the string that's a Regular Expression used to search
     * @return a string value that matches the RegEx
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        boolean done = false;
        String response = "";
        do {
            System.out.print(prompt + " " + regEx + ": ");
            response = pipe.nextLine();

            if(response.matches(regEx))
                done = true;
            else
                System.out.println("\nYou must enter a string that matches the pattern!");
        }while(!done);

        return response;

    }

    /**
     * surrounds a message with stars
     * @param msg user inputs message
     */
    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgWidth = msg.length();

        if (msgWidth > totalWidth - 6) {
            msg = msg.substring(0, totalWidth - 6);
            msgWidth = msg.length();
        }

        int padding = (totalWidth - msgWidth - 6) / 2;

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");
        System.out.print(" ".repeat(padding));
        System.out.print(msg);
        System.out.print(" ".repeat(padding));
        if (msgWidth % 2 != 0) {
            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();

        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
