import java.util.Scanner;
public class Task_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Temperature Converter =====");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        double convertedTemp;

        // Choice 1: Celsius -> Fahrenhiet
        if (choice == 1)
        {
            convertedTemp = (temperature * 9 / 5) + 32;
            System.out.println("\nConversion Result:");
            System.out.println(temperature + " °C = " + convertedTemp + " °F ");
        }
        // Choice 2: Fahrenhiet -> Celsius
        else if (choice == 2)
        {
            convertedTemp = (temperature - 32) * 5 / 9;
            System.out.println("\nConversion Result:");
            System.out.println(temperature + " °F = " + convertedTemp + " °C");
        }
        // Invalid menu choice
        else
        {
            System.out.println("Invalid Choice! Please enter 1 or 2.");
        }
        System.out.println("\nThank you for using Temperature Converter.");
        sc.close();
    }
}
