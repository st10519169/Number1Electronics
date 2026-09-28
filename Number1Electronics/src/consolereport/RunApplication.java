/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package consolereport;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String finalConsole = "";

        // Matching the exact wording from the assignment page typo
        System.out.println("Select the Beverage Type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("Selection: ");
        int userSelection = scanner.nextInt();
        scanner.nextLine(); // Clear the text entry buffer line

        // Basic student if-else block to pick the console
        if (userSelection == 1) {
            finalConsole = "PS5";
        } else if (userSelection == 2) {
            finalConsole = "XBOX";
        } else if (userSelection == 3) {
            finalConsole = "SWITCH";
        } else {
            finalConsole = "Unknown";
        }

        // Asking for text inputs
        System.out.print("Enter the store: ");
        String chosenStore = scanner.nextLine();

        // Big concatenated print statement matching the screenshot prompt
        System.out.print("Enter the total sales of " + finalConsole + " consoles for " + chosenStore + ": ");
        int finalSales = scanner.nextInt();

        // Making the object from our class
        ConsoleSales myReport = new ConsoleSales(finalConsole, chosenStore, finalSales);

        // Run the print statement
        myReport.printReport();
    }
}
