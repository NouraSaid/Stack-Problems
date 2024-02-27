import java.util.Stack;
import java.util.Scanner;

public class ReverseStack
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       
        Stack<Integer> stack = new Stack<>(); //add new stack

        
        System.out.println("Enter Stack length:");
        Integer length = scanner.nextInt(); // ASK user to enter lenght for the stack

       
        System.out.println("\nEnter "+ length +" elements");
        for (Integer i=0; i<length; i++){
            Integer element = scanner.nextInt();
            stack.push(element); //adding  n elements to the stack
        }

        
        System.out.println("\nElements in reversed order: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop()); //print elements from the stack using pop() method
        }
    }
}