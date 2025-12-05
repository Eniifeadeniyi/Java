package dsa;

import java.util.NoSuchElementException;

public class ChiQueue {
        private int count;
        private int front;
        private int rear = -1;
        private String[] elements;

        public  ChiQueue(int size){
            elements = new String[size];
        }

        private boolean checkIfLastIndexIsOccupied(){
            return rear == elements.length-1 && front != 0;
        }

        private void shiftElements(){
            int temp = front;
            for(int i = 0; i < count; i++){
                elements[i] = elements[temp++];
            }
        }

        public int getFront(){
            return front;
        }

        public int getRear(){
            return rear;
        }

        public int getCount(){
            return count;
        }

        public boolean add(String element){
            if(count == elements.length) throw new IllegalStateException("Queue is full");
            if(checkIfLastIndexIsOccupied()) {
                shiftElements();
                front = 0;
                rear = count + front;
                elements[count++] = element;
                return true;
            }
            elements[count++] = element;
            rear++;
            return true;
        }

        public boolean offer(String element){
            if(count == elements.length) return false;
            if(checkIfLastIndexIsOccupied()){
                shiftElements();
                front = 0;
                rear = count + front;
                elements[count++] = element;
                return true;
            }
            elements[count++] = element;
            rear++;
            return true;
        }

        public String remove(){
            if(count == 0) throw new IllegalStateException("Queue is full");
            count--;
            return elements[front++];
        }

        public String poll(){
            if(count == 0) return null;
            count--;
            return elements[front++];
        }

        public String element() {
            if(count != 0) return elements[front];
            else throw new NoSuchElementException("Queue is empty");
        }

        public String peek() {
            if(count != 0) return elements[front];
            else return null;
        }
}
