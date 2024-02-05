import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // Create a Scanner object to receive input from Keyboard
        Scanner input = new Scanner(System.in);

        // Display a question asking the user for the temperature in F they wish to convert
        System.out.print("Enter the temperature in Fahrenheit: ");

        // Read the users F input using double to allow for decimals
        double fahrenheitInput = input.nextDouble();

        // Convert F to C and K by reading the F input and applying the equations to it
        double celsiusResult = (fahrenheitInput - 32) * 5 / 9;
        double kelvinResult = celsiusResult + 273.15;

        // Display conversion result to 3 decimal places and format the results to be on separate lines
        System.out.printf("Temperature in Celsius: %.3f\n", celsiusResult);
        System.out.printf("Temperature in Kelvin: %.3f", kelvinResult);
    }
}
