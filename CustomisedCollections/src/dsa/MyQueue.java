package dsa;

import java.util.NoSuchElementException;

public class MyQueue {
    private int count;
    private String[] elements;

    public MyQueue(int maxSize){
        elements = new String[maxSize];
    }
    public boolean add(String element) {
        if(count != elements.length) {
            elements[count++] = element;
            return true;
        }
        else throw new IllegalStateException("Queue is full");
    }

    public boolean offer(String element) {
        if(count != elements.length) {
            elements[count++] = element;
            return true;
        }
        else return false;
    }

    public String remove() {
        if(count != 0) {
            String firstElement = elements[0];
            for(int counter = 1; counter < count; counter++) {
                elements[counter - 1] = elements[counter];
            }
            count --;
            return firstElement;
        }
        else throw new NoSuchElementException("Queue is empty");
    }

    public String poll() {
        if(count != 0){
            String firstElement = elements[0];
            for(int counter = 1; counter < count; counter++) {
                elements[counter - 1] = elements[counter];
            }
            count --;
            return firstElement;
        }
        else return null;
    }

    public String element() {
        if(count != 0) return elements[0];
        else throw new NoSuchElementException("Queue is empty");
    }

    public String peek() {
        if(count != 0) return elements[0];
        else return null;
    }
}
