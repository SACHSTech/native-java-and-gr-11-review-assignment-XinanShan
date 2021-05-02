package gr11review.part1;

import java.io.*;

/**
* prints a list of choices and asks for an input
* dependings on the inputs, print out the joke that the input asks
* If the input doesn't match any of the cases, print Invalid menu option
* @author: A. Shan
*/

public class Review2{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    //declaring the variables
    int MenuOption;

  // prints all the menu options and asking the user to choose one of them
    System.out.println("0 - print a joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes");
    System.out.println("3 - print a joke about your teacher");
    System.out.print("Choose a menu option: ");
    
    MenuOption = Integer.parseInt(key.readLine());
  switch (MenuOption) {
    case 0:
    // if the input is 0, it prints out the joke about hair and then break.
      System.out.println("Why do bees have sticky hair?");
      System.out.println("They always use honeycombs.");
      break;
      
    case 1: 
    // if the input is 1, it prints out the joke about feet and then break.
      System.out.println("A man can grow up to 8 feet");
      System.out.println("But they usually only have two.");
      break;
      
    case 2:
    // if the input is 2, it prints out the joke about clothes and then break.
      System.out.println("What is DNA’s favourite piece of clothing?");
      System.out.println("Jeans (genes)");
      break;
      
    case 3:
      // if the input is 3, it prints out the joke about teacher and then break.
      System.out.println("Why Did the Teacher Write on the Window?");
      System.out.println("Because the the lesson needed to be clear.");
      break;
    
    default:
     // if the input is non of the cases above, it prints "Invalid menu option"
      System.out.println("Invalid menu option");
     
    } 
  }
}