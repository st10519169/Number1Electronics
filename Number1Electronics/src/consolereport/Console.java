/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package consolereport;

public abstract class Console implements IConsoles {
    // Normal fields
    String consoleType;
    String storeName;
    int totalSales;

    // Normal student constructor matching input parameters
    public Console(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Implementing the getters simply
    @Override
    public String getConsoleType() {
        return this.consoleType;
    }

    @Override
    public String getStore() {
        return this.storeName;
    }

    @Override
    public int getTotalSales() {
        return this.totalSales;
    }
    
    // Abstract method for the child class to do
    public abstract void printReport();
}