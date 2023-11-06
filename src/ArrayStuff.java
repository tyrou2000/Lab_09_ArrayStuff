import java.util.Random;
import java.util.Scanner;

public class ArrayStuff
{

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int[] dataPoints = new int[100];
        double mean = 0.0;
        double sum = 0;

        for (int i = 0; i <= 99; i++)
        {
            dataPoints[i] = random.nextInt(100);
        }
        for (int i = 0; i <= 99; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }
        for (int i = 0; i <= 99; i++)
        {
            sum += dataPoints[i];
        }
        mean = sum / 100;

        System.out.printf("\n The sum is: " + sum + " The mean is: " + mean);


        int usrNum = SafeInput.getRangedInt(in, "\n Enter a number", 1, 100);
        int timesFound = 0;

        for(int i = 0; i <= 99; i++)
        {
            if(usrNum == dataPoints[i])
                timesFound++;
        }

        System.out.print("Your number " + usrNum + ", was found " + timesFound + " times!");

        int usrNum2 = SafeInput.getRangedInt(in, "\n Enter a number", 1, 100);

        int whenFound = -1;

        for(int i = 0; i <= 99; i++)
        {
            if(usrNum == dataPoints[i]) {
                whenFound = i;
                System.out.println("\n Your number " + usrNum2 + " was found at index " + whenFound);
                break;
            }
        }
        if(whenFound == -1)
            System.out.println("\n Your number " + usrNum2 + " was not found. :( ");



        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int i = 0; i <= 99; i++)
        {
            if(dataPoints[i] < min)
                min = dataPoints[i];
            if(dataPoints[i] > max)
                max = dataPoints[i];
        }
        System.out.println("\n The max of dataPoints is: " + max + " and the min is: " + min);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    /**
     * gets the average of an array
     * @param values the array to be analyzed
     * @return the mean
     */
    public static double getAverage(int values[]) {
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    double mean1 = 0.0;
    double sum1 = 0.0;

    for (int i = 0; i <= 99; i++) {
        sum1 += values[i];
    }
    mean1 = sum1 / 100;

    return mean1;
}


}


