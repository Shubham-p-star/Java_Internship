import java.util.Scanner;
public class Task_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "")
                              .toLowerCase();
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--)
        {
            reversed += cleaned.charAt(i);
        }

        if (cleaned.equals(reversed))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}