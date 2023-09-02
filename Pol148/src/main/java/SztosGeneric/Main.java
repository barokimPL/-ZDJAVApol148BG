package SztosGeneric;

public class Main {

    public static void main(String[] args) {
        testInteger();
    }

    public static void testString() {
        Stack<String> stack = new ArrayStack<>();

        stack.push("Test 1");
        stack.push("Test 2");
        stack.push("Test 3");
        System.out.println(stack.pop());
        System.out.println(stack.peek());


        System.out.println(stack);
    }

    public static void testInteger() {
        Stack<Integer> stack = new ArrayStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());


        System.out.println(stack);
    }


}
