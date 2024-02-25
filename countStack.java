import java.util.Stack;

public class CountStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        
         System.out.println(stack.empty()); //check if the stack is empty or not
         
         System.out.println("Stack: " + stack); // print the elements in stack 
         
         System.out.println("The size is: " + stack.size()); //print the size of stack

    }
}