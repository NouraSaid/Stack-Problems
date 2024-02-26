import java.util.Stack;

public class PrintStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); //add new stacl with integer data type
        
        stack.push(12); //push number in the stack
        stack.push(13);
        stack.push(14);
        stack.push(15);
       
         
        System.out.println(stack); //print the elements 

    }
}
