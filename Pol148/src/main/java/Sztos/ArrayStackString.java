package Sztos;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStackString implements StackString {
    private String[] stackData = new String[3];
    int index = 0;

    @Override
    public void push(String item) throws StackOverflowError {
        if (index <= stackData.length - 1) {
            stackData[index] = item;
            index++;
        } else {
            throw new StackOverflowError("Full stack exception");
        }
    }

    @Override
    public String pop() throws EmptyStackException {
        if (index == 0) {
            throw new EmptyStackException();
        } else {
            index--;
            String item = stackData[index];
            stackData[index] = null;
            return item;
        }
    }

    @Override
    public String peek() {
        if (index > 0)
            return stackData[index - 1];
        else
            throw new EmptyStackException();
    }

    @Override
    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "stackData=" + Arrays.toString(stackData) +
                '}';
    }
}
