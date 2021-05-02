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
    
    for (Count = 21; Count <= Max; Count+=2){
        System.out.println(Count);
    }
    System.out.println("");
    for (Count2 = 29; Count2 >= Min; Count2--){
        System.out.println(Count2);
    }
  }
}