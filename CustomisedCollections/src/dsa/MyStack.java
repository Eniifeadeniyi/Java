package dsa;

import java.util.EmptyStackException;

public class MyStack {
    private int count;
    private String[] elements;

    public MyStack(int maxSize) {
        elements = new String[maxSize];
    }

    public boolean isEmpty(){
        if(count == 0) return true;
        return false;
    }

    public void push(String element) {
        if(!isFull()) elements[count++] = element;
        else throw new IllegalStateException("Full!");
    }

    public String pop(){
        if(!isEmpty()) return elements[--count];
        else throw new EmptyStackException();
    }

    public String peek() {
        if(isEmpty()) throw new EmptyStackException();
        return elements[count - 1];
    }

    public boolean isFull() {
        if(count == elements.length) return true;
        return false;
    }
}
