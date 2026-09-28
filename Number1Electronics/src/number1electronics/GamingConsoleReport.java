/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number1electronics;

public class GamingConsoleReport {

    public static void main(String[] args) {
        
        // 1. Single-dimensional arrays for headings and names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        // 2. Two-dimensional array to store the table values exactly
        int[][] salesData = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };

        // Variables for tracking the city with the highest total sales
        int highestSales = 0;
        String highestCity = "";

        // --- PRINTING THE CORE REPORT ---
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println();
        System.out.println("\t\t\t" + consoles[0] + "\t" + consoles[1] + "\t" + consoles[2]);
        
        // Nested loops to print out the table rows
        for (int i = 0; i < 3; i++) {
            System.out.print(cities[i] + "\t");
            
            // Adjust tabs if city name is short to keep things lined up
            if (cities[i].length() < 12) {
                System.out.print("\t");
            }
            
            for (int j = 0; j < 3; j++) {
                System.out.print(salesData[i][j] + "\t");
            }
            System.out.println(); // Next line
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println();

        // --- CALCULATING THE TOTALS ---
        for (int i = 0; i < 3; i++) {
            int currentCityTotal = 0;
            
            // Sum up columns for the current city row
            for (int j = 0; j < 3; j++) {
                currentCityTotal = currentCityTotal + salesData[i][j];
            }
            
            // Print the total for this city
            System.out.print(cities[i] + "\t");
            if (cities[i].length() < 12) {
                System.out.print("\t");
            }
            System.out.println(currentCityTotal);
            
            // Logic check to find the top-performing city
            if (currentCityTotal > highestSales) {
                highestSales = currentCityTotal;
                highestCity = cities[i];
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + highestCity);
    }
}
