package dsa;

public class MyMap {
    private int count;
    private MySet keys;
    private MyArraylist values;

    public MyMap() {
        keys = new MySet();
        values = new MyArraylist();
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void put(String key, String value) {
        if(keys.add(key)){
            keys.add(key);
            values.add(value);
            count++;
        }
    }

    public int size() {
        return count;
    }

    private int searchKeys(String key){
        for(int count = 0; count < keys.size(); count++){
            if(keys.get(count).equals(key)) return count;
        }
        return -1;
    }
    public String get(String key) {
        if (keys.contains(key)) {
            int index = searchKeys(key);
            return values.get(index);
        }
        return null;
    }

    public boolean containsKey(String key) {
        return keys.contains(key);
    }

    public boolean containsValue(String value) {
        return values.contains(value);
    }

    public void clear() {
         keys.clear();
         values.clear();
         count = 0;
    }
}
