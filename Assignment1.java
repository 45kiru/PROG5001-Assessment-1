import java.util.Scanner;

public class Assignment1
{
    public static void main(String[] args)
    {
        // F1: allows the user to input the assignment name
        Scanner scanner = new Scanner(System.in); // import scanner to allow user input

        System.out.print("Enter the assignment name: ");
        String assignmentName = scanner.nextLine();

        // F2: allows the user to input the assignment grade
        float[] studentMarks = new float[30];

        for (int i = 0; i < 30; i++) // assume that there are 30 students in the unit
        {
            do
            {
                System.out.print("Enter mark for Student " + (i + 1) + ": ");
                float mark = scanner.nextFloat();
                if((mark >= 0) && (mark <= 30)) // must accept only valid mark (i.e. between 0 and 30) inputs by users.
                {
                    studentMarks[i] = mark;
                    break;
                } else {
                // F3: allows the user to re-enter the assignment grade if the input is invalid
                    System.out.println("Invalid input!\nPlease enter a mark between 0 and 30.");
                }
            } while (true);
        }

        // F4: prints the assignment name following the 'students' marks after users have finished entering the marks.
        System.out.println("Assignment Name: " + assignmentName);
        for (int i = 0; i < 30; i++) {
            System.out.println("Student " + (i + 1) + " Mark: " + studentMarks[i]);
        }

        // F5: prints the highest mark and the lowest mark on the screen.
        float highestMark = 0;
        float lowestMark = 0;

        for (int i = 0; i < 30; i++)
        {
            if (studentMarks[i] > highestMark)
            {
                highestMark = studentMarks[i];
            } else if (studentMarks[i] < lowestMark)
            {
                lowestMark = studentMarks[i];
            }
        }

        System.out.println("Highest Mark: " + highestMark);
        System.out.println("Lowest Mark: " + lowestMark);

        // F6: calculates the mean and standard deviation of the marks and print the result on the screen.
        float sumOfMarks = 0;
        float mean = 0;
        float sumOfSquaredDifferences = 0;
        double standardDeviation = 0;

        for (int i = 0; i < 30; i++)
        {
            sumOfMarks += studentMarks[i];
        }
        mean = sumOfMarks / 30;

        for (int i = 0; i < 30; i++)
        {
            double squareDifference = Math.pow((studentMarks[i] - mean), 2);
            sumOfSquaredDifferences += squareDifference;
        }
        standardDeviation = Math.sqrt((double)sumOfSquaredDifferences / 30);

        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}
