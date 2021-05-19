package gr11review.part1;

import java.io.*;

/**
* Asks the user the input a sentence
* Count the number of characters, spaces and "a"s in the sentence.
* Prints a dash for every odd numbered characters in the sentence 
* @author: A. Shan 
*/
public class Review7{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
  //declearing the varaibles
  String Sentence;
  int Characters;
  int Spaces = 0;  
  int LetterA = 0; 
  int Count;
  String Dashes = ""; 

  //Ask the user for the sentence
  Sentence = key.readLine();
  //Count the number of letters in the sentence
  Characters = Sentence.length();

  for (Count = 0; Count < Characters; Count++){
    
    // Extracting a single character from the sentence and put it in a char varaible
    char OneCharacter = Sentence.charAt(Count);
    
    // check if the character equal to space or the letter "a" and count them
    if(OneCharacter == ' '){
      Spaces++;
    }else if(OneCharacter == 'a'){
      LetterA++;
      }
    // Check if the letter is an odd numbered number of not.
    // The count must plus 1 because when declearing the varaible, it is zero.
    // However, when we are looking at each of the characters in the sentence, we start from 1.
    if ((Count+1) % 2 != 0){
      Dashes += "-";
      }
    }
    // print out how many characters, spaces and letter "a" in the sentence.
    // And then print out the dashes
    System.out.println("There are " + Characters + " characters in the sentence.");
    System.out.println("There are " + Spaces + " spaces in the sentence.");
    System.out.println("There are " + LetterA + " letter a in the sentence.");
    System.out.println(Dashes);
  }
}