package Sztos;

public class Main {

    public static void main(String[] args) {
        Stack stack = new ArrayStack();

        stack.push("Test 1");
        stack.push("Test 2");
        stack.push("Test 3");
        stack.push("Test 3");
        System.out.println(stack.pop());
        stack.push("Test 4");
        System.out.println(stack.peek());


        System.out.println(stack);
    }
}
