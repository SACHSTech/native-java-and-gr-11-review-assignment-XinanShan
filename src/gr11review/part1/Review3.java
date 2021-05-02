package gr11review.part1;

import java.io.*;

public class Review3{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    int Count;
    int Number = 100;
    
    for (Count = 20; Count < Number; Count++){
      if (Count % 2 > 0){
        System.out.println(Count);
      }
    }
    for (Count = 20; Count < Number; Count++){
      if (Count % 2 > 0){
        System.out.println(Count);
      }
    }
  }
}