package gr11review.part1;

import java.io.*;
import java.text.*;

/**
*Create a program that let the user kept entering prices until
* the user enters 0, then calculate the subtotal, tax and total
* @author: A. Shan 
*/
public class Review6{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    NumberFormat numberFormat = new DecimalFormat("#,##0.00");
    
    //declaring the variables
    int itemNum;
    double Subtotal = 0;
    double Tax;
    double Total;
    int Count = 1;
    double Price = 1;

    // If the input is not a 0, the loop continues
    while (Price != 0){
      System.out.print("Enter the price for item "+Count+":");
      Price = Double.parseDouble(key.readLine());

      Subtotal += Price
      Count++;
    }
    
  }
}