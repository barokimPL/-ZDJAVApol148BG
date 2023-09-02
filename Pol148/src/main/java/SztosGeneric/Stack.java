package SztosGeneric;

import java.util.EmptyStackException;

public interface Stack <T> {
    void push(T item) throws StackOverflowError;

    T pop() throws EmptyStackException;
    T peek() throws EmptyStackException;
    boolean isEmpty();
}
