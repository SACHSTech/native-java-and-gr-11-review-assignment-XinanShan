package gr11review.part1;

import java.io.*;
/**
* Prints all the odd number between 20 and 100
* Prints all the numbers counting down from 29 to 2
* @author: A. Shan
*/
public class Review3{
  public static void main(String[] args) throws IOException{
    int Count;
    int Count2;
    int Max = 100;
    int Min = 2;

    // Prints out all the odd number between 100 to 21
    for (Count = 21; Count <= Max; Count+=2){
        System.out.println(Count);
    }
    // Skip a line between two loops
    System.out.println("");
  // Prints out all the numbers from 29 to 2 from a decreasing order 
    for (Count2 = 29; Count2 >= Min; Count2--){
        System.out.println(Count2);
    }
  }
}