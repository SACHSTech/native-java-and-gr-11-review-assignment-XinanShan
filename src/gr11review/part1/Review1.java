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

    System.out.println("Enter the month number:");
    Month = Integer.parseInt(key.readLine());

    System.out.println("Enter the date number:");
    Days = Integer.parseInt(key.readLine());

    for (Count = 1; Count < Month; Count++){
      if (Count == 2){
        MonthinDays += 28;
      }else if (Count == 4 || Count == 6 || Count == 9 || Count == 11){
        MonthinDays += 30;
      }else{
        MonthinDays += 31;
      }

    DaysinTotal = MonthinDays + Days;
    System.out.println("Your days in the year is: " +DaysinTotal+ "days");

    }
  }
}