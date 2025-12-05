package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest {

    MyMap map;
    @BeforeEach
    public void setup() {
        map = new MyMap();
    }

    @Test
    public void testThatMapIsEmptyUponCreation() {
        assertTrue(map.isEmpty());
    }

    @Test
    public void testPut(){
        map.put("name","eniife");
        assertFalse(map.isEmpty());
        assertEquals(1,map.size());
    }

    @Test
    public void testThatPutDoesntAllowForMultipleKeysWithSameName() {
        map.put("name", "eniife");
        assertEquals(1, map.size());
        map.put("name", "bob");
        assertEquals(1, map.size());
    }

    @Test
    public void testGet(){
        map.put("name","eniife");
        map.put("age","100");
        assertEquals("eniife", map.get("name"));
    }

    @Test
    public void testContainsKey(){
        map.put("name","eniife");
        assertFalse(map.containsKey("specie"));
        assertTrue(map.containsKey("name"));
    }

    @Test
    public void testContainsValue(){
        map.put("name","eniife");
        assertFalse(map.containsValue("tissue"));
        assertTrue(map.containsValue("eniife"));
    }

    @Test
    public void testClearMapBecomesEmpty(){
        map.put("name","eniife");
        assertFalse(map.isEmpty());
        map.clear();
        assertTrue(map.isEmpty());
        assertEquals(0,map.size());
    }

}
