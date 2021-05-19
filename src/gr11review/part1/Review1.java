package gr11review.part1;

import java.io.*;

/**
* Create a program that asks the user to enter month number and date number
* Exchange the month into days and calculate the total number of days in the year
* Assume it is not a leap year which means February has 28 days
* @author: A. Shan
*/

public class Review1{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    //declaring the variables
    int Month;
    int Days;
    int MonthinDays = 0;
    int Count;
    int DaysinTotal;
    
  // Asking the user for the value of the variables
    System.out.print("Enter the month number: ");
    Month = Integer.parseInt(key.readLine());
     
    System.out.print("Enter the day number: ");
    Days = Integer.parseInt(key.readLine());
    
    //converting the month number into days of the year before that month
    for (Count = 1; Count < Month; Count++){
      if (Count == 2){
        MonthinDays += 28;
      }else if (Count == 4 || Count == 6 || Count == 9 || Count == 11){
        MonthinDays += 30;
      }else{
        MonthinDays += 31;
      }
      
    }
   
    //Adding all the days together to get the total number of days in the year
    DaysinTotal = MonthinDays + Days;
    
    System.out.println(DaysinTotal);
  }
}