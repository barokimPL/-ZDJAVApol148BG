package Sztos;

import java.util.EmptyStackException;

public interface StackInteger {
    void push(Integer item) throws StackOverflowError;

    Integer pop() throws EmptyStackException;
    Integer peek() throws EmptyStackException;
    boolean isEmpty();
}
