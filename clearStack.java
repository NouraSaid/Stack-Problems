
import java.util.*; 
  
public class ClearStack { 
    public static void main(String args[]) 
    { 
        // Creating an empty Stack 
        Stack<String> stack = new Stack<String>(); 
  
        // Add elements into the Stack 
        stack.push("NOURA"); 
        stack.push("SAID"); 
        stack.push("MOHAMMED"); 
        stack.push("AlSAIDI"); 
  
        // Displaying the Stack 
        System.out.println("Stack: " + stack); 
  
        stack.clear(); //Clear the stack
        System.out.println(stack.empty()); // check if the stack is cleared
       
    } 
}