package Sztos;

import java.util.EmptyStackException;

public interface StackString {
    void push(String item) throws StackOverflowError;

    String pop() throws EmptyStackException;
    String peek() throws EmptyStackException;
    boolean isEmpty();
}
