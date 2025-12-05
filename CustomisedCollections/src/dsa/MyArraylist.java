package dsa;

public class MyArraylist {
    private int count;
    private int capacity = 10;
    private String[] elements = new String[capacity];

    private void resetCapacity(){
        capacity *= 2;
        String[] newElements = new String[capacity];
        for(int count = 0; count < this.count; count++){
            newElements[count] = elements[count];
        }
        elements = newElements;
    }

    private void isFull(){
        if(count == capacity) resetCapacity();
    }

    public boolean isEmpty() {
        if(count == 0) return true;
        return false;
    }

    public int size() {
        return count;
    }

    public boolean contains(String key) {
        if(count == 0) return false;
        for(int count = 0; count < this.count; count++){
            if(elements[count].equalsIgnoreCase(key)) return true;
        }
        return false;
    }

    public boolean add(String word) {
        if(contains(word))return false;
        isFull();
        elements[count++] = word;
        return true;
    }

    public boolean remove(String element) {
        if(!contains(element)) return false;
        for(int counter = 0; counter < elements.length; counter++){
            if(element.equalsIgnoreCase(elements[counter])) {
                elements[counter] = elements[count - 1];
                elements[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public void clear(){
        count = 0;
    }

    public String get(int index){
        if(index < 0 || index > count) throw new IndexOutOfBoundsException();
        return elements[index];
    }

    public String set(int index, String element){
        if(index < 0 || index > count) throw new IndexOutOfBoundsException();
        String oldValue = elements[index];
        elements[index] = element;
        return oldValue;
    }


    public int indexOf(String element){
        if(!contains(element)) return -1;
        for(int counter = 0; counter < elements.length; counter++){
            if(element.equalsIgnoreCase(elements[counter]))
                return counter;
        }
        return -1;
    }

    public int lastIndexOf(String element){
        if(!contains(element)) return -1;
        for(int counter = elements.length - 1; counter >= 0; counter--){
            if(element.equalsIgnoreCase(elements[counter]))
                return counter;
        }
        return -1;
    }
}
