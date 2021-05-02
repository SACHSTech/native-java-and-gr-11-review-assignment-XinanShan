package gr11review.part1;

import java.io.*;

public class Review3{
  public static void main(String[] args) throws IOException{
    int Count;
    int Max = 100;
    int Min = 2;
    
    for (Count = 20; Count < Max; Count++){
      if (Count % 2 > 0){
        System.out.println(Count);
      }
    }
    System.out.println(" ");
    for (Count = 29; Count >= Min; Count--){
        System.out.println(Count);
    }
  }
}