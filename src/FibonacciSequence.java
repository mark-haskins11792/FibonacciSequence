import java.util.Scanner;

public class FibonacciSequence
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int initial = 0, days = 0, previous = 0, finalOutput = 0, cycle = 0;
        System.out.println("Please enter initial size of green crud of a negative number to quit program: ");
        initial = input.nextInt();
        while (initial > 0)
        {

            System.out.println("Please enter number of days: ");
            days = input.nextInt();
            cycle = days / 5;
            for (int i = 0; i < cycle; i++)
            {
                finalOutput = initial + previous;
                previous = initial;
                initial = finalOutput;
            }
            System.out.println("Final output of green crud: " + finalOutput);
            System.out.println("Please enter initial size of green crud of a negative number to quit program: ");
            initial = input.nextInt();
        }


        System.out.println("Exit Program");
        System.exit(0);

    }
}
