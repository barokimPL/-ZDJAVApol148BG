package Sztos;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack implements Stack {
    private String[] stackData = new String[3];
    int buffor = 0;

    @Override
    public void push(String item) throws StackOverflowError {
        if (buffor <= stackData.length-1) {
            stackData[buffor] = item;
            buffor++;
        } else {
            throw new StackOverflowError("Full stack exception");
        }
    }

    @Override
    public String pop() throws EmptyStackException {
        if (buffor == 0) {
            throw new EmptyStackException();
        } else {
            buffor--;
            String item = stackData[buffor];
            stackData[buffor] = null;
            return item;
        }
    }

    @Override
    public String peek() {
        if (buffor > 0)
            return stackData[buffor-1];
        else
            throw new EmptyStackException();
    }

    @Override
    public boolean isEmpty() {
        if (buffor > 0)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "stackData=" + Arrays.toString(stackData) +
                '}';
    }
}
