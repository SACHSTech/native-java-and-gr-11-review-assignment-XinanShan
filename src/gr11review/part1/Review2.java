package gr11review.part1;

import java.io.*;

public class Review2{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    int MenuOption;

    System.out.println("0 - print a joke about your hair");
    System.out.println("1 - print a joke about your feet");
    System.out.println("2 - print a joke about your clothes");
    System.out.println("3 - print a joke about your teacher");
    System.out.println("Choose a menu option: ");
    MenuOption = Integer.parseInt(key.readLine());

  switch (MenuOption) {
    case 0:
      System.out.println("Why do bees have sticky hair?");
      System.out.println("They always use honeycombs.");
      break;
    case 1: 
      System.out.println("A man can grow up to 8 feet");
      System.out.println("But they usually only have two.");
      break;
    case 2:
      System.out.println("What is DNA’s favourite piece of clothing?");
      System.out.println("Jeans (genes)");
      break;
    case 3:
      System.out.println("Why Did the Teacher Write on the Window?");
      System.out.println("Because the the lesson needed to be clear.");
      break;
    default:
      System.out.println("Invalid menu option");
    } 
  }
}