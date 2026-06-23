import java.util.Scanner;
public class Task_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Palindrome Checker ====");

        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();
        
        // Remove spaces and special characters
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        String reversed = "";

        // Reverse the string
        for (int i = cleaned.length() - 1; i >= 0; i--)
        {
            reversed += cleaned.charAt(i);
        }

        // Compare original and reversed strings
        if (cleaned.equals(reversed))
        {
            System.out.println("\nResult:");
            System.out.println("\"" + input + "\" is a Palindrome.");
        }
        else
        {
            System.out.println("\nResult");
            System.out.println("\"" + input + "\" is Not a Palindrome.");
        }
        System.out.println("\nThank you for using Palindrome Checker.");
        sc.close();
    }
}
