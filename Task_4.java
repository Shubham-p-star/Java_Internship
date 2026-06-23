import java.util.Random;
import java.util.Scanner;
public class Task_4
{
      public static void main(String[] args)
      {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();

            System.out.println("===== Random Password Generator =====");

            System.out.print("Enter password length: ");
            int length = sc.nextInt();

           System.out.print("Include Uppercase Letters? (Y/N): ");
           char upper = sc.next().toUpperCase().charAt(0);

           System.out.print("Include Lowercase Letters? (Y/N): ");
           char lower = sc.next().toUpperCase().charAt(0);

           System.out.print("Include Numbers? (Y/N): ");
           char numbers = sc.next().toUpperCase().charAt(0);

           System.out.print("Include Special Characters? (Y/N): ");
           char special = sc.next().toUpperCase().charAt(0);

           String characters = "";

           // Add uppercase letters
           if(upper == 'Y')
           {
               characters += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
           }

           // Add lowercase letters
           if(lower == 'Y')
           {
               characters += "abcdefghijklmnopqrstuvwxyz";
           }

           // Add numbers
           if(numbers == 'Y')
           {
               characters += "0123456789";
           }

           // Add special characters
           if(special == 'Y')
           {
               characters += "!@#$%^&*()_+-=[]{}|;:,.<>?";
           }
           if(characters.length() == 0)
           {
               System.out.println("Please select at least one character type.");
           }
           else
           {
               String password = "";
               // Generate random password
               for(int i = 0; i < length; i++)
               {
                  int index = random.nextInt(characters.length());
                  password += characters.charAt(index);
               }
               System.out.println("\nGenerated Password:");
               System.out.println(password);
           }
           sc.close();
    }
}
