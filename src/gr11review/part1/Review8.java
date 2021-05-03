package gr11review.part1;

import java.io.*;

/**
*Create a program that simulates 1000 pulls from a slot machine
* prints out all the outcomes and how many timess a triple was pulled out
* @author: A. Shan 
*/
public class Review8{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
   
    //declaring the variables
    int slot1;
    int slot2;
    int slot3;
    int Count;
    int Triple = 0;

    // The loop will continue until the count is equal to 1000
    for (Count = 0; Count < 1000; Count++){
      //Genereate a random number between 1 and 8
      // Print the outcomes
      slot1 = (int)(Math.random()*8+1);
      slot2 = (int)(Math.random()*8+1);
      slot3 = (int)(Math.random()*8+1);

      System.out.print(slot1 + " ");
      System.out.print(slot2 + " ");
      System.out.println(slot3);

      //Check if theres any triple being pulled
      if (slot1 == slot2 && slot1 == slot3){
        Triple++;
      }
    }
    //Print the number of triples 
    System.out.println(Triple);
  }
}