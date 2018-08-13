import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FinalProject {  
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner in = new Scanner(System.in); 
        
    // INPUT NAME AND # OF HOUSES //    
        System.out.print("What is your first name? ");
        String firstName = in.nextLine();      
        System.out.print("How many houses do you have? ");
        int length = in.nextInt();    
    
    // CODE FOR POSITIVE NUMBER OF HOUSES //  
    if (length > 0) {
        double[] houses = new double[length];        
        double totalPrice = 0;
        double numHouses = 0;
        
    // INPUT HOUSE PRICES // 
        for (int i=0; i < length; i++) { 
           System.out.print("Enter price for house #" + (i+1) + ": ");
           double housePrice = in.nextDouble();
           totalPrice = totalPrice + housePrice;
           numHouses++;
           houses[i] = housePrice; }      

    // CALCULATE MIN, MAX, AVG PRICES // 
        double minPrice = houses[0];
        double maxPrice = houses[0];
        double avgPrice;
        
        avgPrice = totalPrice / numHouses;
        
        for (int i = 1; i < houses.length; i++) {
            if (houses[i] > maxPrice) {
                maxPrice = houses[i]; } }      
        for (int i = 1; i < houses.length; i++) {
            if (houses[i] < minPrice) {
                minPrice = houses[i]; } }
        
        System.out.println("----------");
        System.out.println("Hello, " + firstName + ". ");
        System.out.println("You have " + length + " houses.");  
        System.out.println("The most expensive house is $" + maxPrice + ".");
        System.out.println("The least expensive house is $" + minPrice + ".");
        System.out.println("The average price for " + numHouses + " houses is $" + avgPrice);
        
    // ASKS TO PRINT, PRINTS //   
        System.out.println("----------");
        System.out.println("Would you like to print your results to a file? ");
        System.out.print("Type 'Y' for yes: ");
        String print = in.next();
        
        String path;
        
    if (print.equals("Y")) {
        System.out.println("----------");
        System.out.println("Please enter output file path: ");
        path = in.next();
        PrintWriter out = new PrintWriter(path);
        out.println("----------");
        out.println("Hello, " + firstName + "."); 
        out.println("You have " + length + " houses.");
        out.println("The most expensive house is $" + maxPrice + ".");
        out.println("The lease expensive house is $" + minPrice + ".");
        out.println("The average price for " + numHouses + " houses is $" + avgPrice);
        out.println("----------");
        in.close();
        out.close(); } 
    else {
        System.out.println("----------");
        System.out.println("Will not print to file"); } }   
    
    // CODE FOR ZERO NUMBER OF HOUSES //   
    else if (length == 0) {          
    // ASKS TO PRINT, PRINTS //   
        System.out.println("----------");    
        System.out.println("Would you like to print your results to a file? ");
        System.out.print("Type 'Y' for yes: ");
        String print = in.next();    
        
        String path;       
        
    if (print.equals("Y")) {
        System.out.println("----------");
        System.out.println("Please enter output file path: ");
        path = in.next();
        PrintWriter out = new PrintWriter(path);
        out.println("----------");
        out.println("Hello, " + firstName + "."); 
        out.println("You have 0 houses.");
        out.println("The most expensive house is $0.");
        out.println("The lease expensive house is $0.");
        out.println("The average price for 0 houses is $0.");
        out.println("----------");
        in.close();
        out.close(); } }
    else if (length < 0) {
        System.out.println("----------");
        System.out.println("Hello, " + firstName + ". ");
        System.out.println("You have 0 houses.");  
        System.out.println("The most expensive house is $0.");
        System.out.println("The least expensive house is $0.");
        System.out.println("The average price for 0 houses is $0"); }  
    }    
}

/* File path used for testing
 C:\Users\blake\Desktop\testOutputFile.txt */
