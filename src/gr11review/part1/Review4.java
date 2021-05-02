package gr11review.part1;

import java.io.*;
import java.text.*;

/**
*Ask user for how many inputs to count
* Take the total prices to calculate tax and add the together for the total
* @author: A. Shan 
*/

public class Review4{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    NumberFormat numberFormat = new DecimalFormat("#,###0.00");
    
    //declaring the variables
    int itemNum;
    double Subtotal = 0;
    double Tax;
    double Total;
    int Count;
    double Price;

  // Ask for the number of items
    System.out.println("How many items do you want to buy? ");
    itemNum = Integer.parseInt(key.readLine());
  
  // Ask for the prices of item until the first input and add them together for the subtotal
    for (Count = 1; Count <= itemNum; Count++){
      System.out.println("Enter the price for item " + Count + ": ");
      Price = Double.parseDouble(key.readLine());
      Subtotal += Price;
    }
    // Calculate the tax
    Tax = Subtotal * 0.13;
    
    // Makes it DecimalFormat
    numberFormat.format(Tax);
    
    // Calculate the total
    Total = Tax + Subtotal;
    //Print the tax, subtotal and the total
    System.out.println("Subtotal: $" + numberFormat.format(Subtotal));
    System.out.println("Tax: $" + numberFormat.format(Tax));
    System.out.println("Total: $" + numberFormat.format(Total));
  }
}