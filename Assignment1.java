import java.util.Scanner;

public static Assignment1
{
    public static void main(String[] args)
    {
        // F1: allows the user to input the assignment name
        Scanner scanner = new Scanner(); // import scanner to allow user input

        System.out.print("Enter the assignment name: ");
        String assignmentName = scanner.nextLine();

        // F2: allows the user to input the assignment grade
        int[] studentMarks = new int[30];

        for (int i = 0; i < 30; i++) // assume that there are 30 students in the unit
        {
            do
            {
                System.out.print("Enter mark for Student " + (i + 1) + ": ");
                int mark = scanner.nextInt();
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
    }
}