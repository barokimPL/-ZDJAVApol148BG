package Sztos;

import java.util.EmptyStackException;

public interface Stack {
    public void push(String item) throws StackOverflowError;
    public String pop() throws EmptyStackException;
    public String peek() throws EmptyStackException;
    public boolean isEmpty();
}
