package gr11review.part1;

import java.io.*;

/**
*Calculate the amount of time for the compount interest to reach 
* the tagert amount which is enter by the user
* And then print out the amount of time
* @author: A. Shan 
*/
public class Reviewa5{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    //declaring the variables
    int Year = 0;
    double Total = 0;
    double Target;
    double Rate;
    double Invest;

    //Ask the user for the variables
    System.out.print("Enter the yearly invested amount: ");
    Invest = Double.parseDouble(key.readLine());

    System.out.print("Enter the compound interest rate: ");
    Rate = Double.parseDouble(key.readLine());

    System.out.print("Enter the target amount: ");
    Target = Double.parseDouble(key.readLine());
    //Calculates the amount of years neeeded to reach the taget amount 
    //The while loop stops when the condition is false
    while (Total < Target){
      Total += Invest;
      Total += (Total * ( / 100);

    }
  }
}