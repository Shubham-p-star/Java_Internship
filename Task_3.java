import java.util.Scanner;
public class Task_3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Student Grade Calculator =====");

        System.out.print("Enter number of grades: ");
        int n = sc.nextInt();

        int[] grades = new int[n];
        int total = 0;

        // Taking grades as input
        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextInt();
            total += grades[i];
        }
        // Calculating average
        double average = (double) total / n;

        System.out.println("\n===== Result =====");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Grade = " + average);

        System.out.println("\nThank you for using Student Grade Calculator.");
        sc.close();
    }
}
