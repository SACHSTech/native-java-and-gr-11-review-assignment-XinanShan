package gr11review.part1;

import java.io.*;

public class Review1{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    int Month;
    int Days;
    int MonthinDays = 0;
    int Count;
    int DaysinTotal;
    //initializing the variables

    System.out.print("Enter the month number: ");
    Month = Integer.parseInt(key.readLine());

    System.out.print("Enter the day number: ");
    Days = Integer.parseInt(key.readLine());
    // Asking the user for the value of the variables
    for (Count = 1; Count < Month; Count++){
      if (Count == 2){
        MonthinDays += 28;
      }else if (Count == 4 || Count == 6 || Count == 9 || Count == 11){
        MonthinDays += 30;
      }else{
        MonthinDays += 31;
      }
      //converting the month number into days of the year before that month
    }
    DaysinTotal = MonthinDays + Days;
    //Adding all the days together to get the total number of days in the year
    System.out.println(DaysinTotal);
  }
}