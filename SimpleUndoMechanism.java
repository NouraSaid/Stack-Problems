/*Simulate a very simple undo mechanism using a stack. Every time a user types a character, push it onto the stack. If the user hits undo (you can simulate this with a command), pop the last character from the stack and print the current state of the text*/


import java.util.Stack;

import  java.util.Scanner;


public class SimpleUndoMechanism {

  public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> undo = new Stack<>();
        
        
        System.out.println("PLEASE ENTER A CHARACTER to push it in the Stack "+ ""); //User give the input
       
        System.out.println("Or Write 'UNDO' to  pop the last character from the stack "); //User want to push the last element from stack

        while (true) {
            String UserInput = scanner.nextLine();

            if (UserInput.equals("UNDO")) {
               
               
                if (!undo.isEmpty()) {
                    undo.pop(); // pop the element
                }
                
                
            } else {
                  for (char c : UserInput.toCharArray()) {
                    undo.push(c); // push the element
                }
            }

            

            System.out.print("Current text: ");
            for (char c : undo) {
                System.out.print(c);
            }
            System.out.println(); //print the stack
        }
    }
}