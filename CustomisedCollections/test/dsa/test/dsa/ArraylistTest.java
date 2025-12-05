package dsa.test.dsa;

import dsa.MyArraylist;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraylistTest {

    MyArraylist arrayList;
    @BeforeEach
    public void setUp(){
        arrayList = new MyArraylist();
    }

    @Test
    public void testThatArraylistIsEmptyUponCreation(){
       assertTrue(arrayList.isEmpty());
    }

    @Test
    public void testThatSizeReturnsTheNumberOfElementsInTheArraylist(){
        assertEquals(0,arrayList.size());
    }

    @Test
    public void testAddElement(){
        assertTrue(arrayList.add("elope"));
    }
    @Test
    public void testThatContainsWorks(){
        arrayList.add("elope");
        arrayList.add("epole");
        arrayList.add("epele");
        arrayList.add("pele");
        arrayList.add("pool");
        assertFalse(arrayList.contains("hi"));
        assertTrue(arrayList.contains("epele"));
    }

    @Test
    public void testRemoveElement(){
        arrayList.add("elope");
        arrayList.add("epele");
        arrayList.add("epole");
        arrayList.add("pool");
        assertTrue(arrayList.remove("elope"));
        assertFalse(arrayList.remove("pele"));
    }

    @Test
    public void testClear(){
        arrayList.add("elope");
        arrayList.add("epele");
        arrayList.add("epole");
        arrayList.clear();
        assertTrue(arrayList.isEmpty());
        assertTrue(arrayList.add("trial"));
    }

    @Test
    public void testGet(){
        arrayList.add("elope");
        arrayList.add("epele");
        arrayList.add("epole");
        assertEquals("epele",arrayList.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> arrayList.get(5));

    }

    @Test
    public void testSet(){
        arrayList.add("elope");
        arrayList.add("epele");
        arrayList.add("epole");
        assertEquals("epele",arrayList.set(1,"eniife"));
        assertThrows(IndexOutOfBoundsException.class, () -> arrayList.set(4,"eniife"));
    }

    @Test
    public void testIndexOf(){
        arrayList.add("elope");
        arrayList.add("epele");
        arrayList.add("epole");
        arrayList.add("epele");
        assertEquals(1,arrayList.indexOf("epele"));
        assertEquals(-1,arrayList.indexOf("pool"));
    }

    @Test
    public void testLastIndexOf(){
        arrayList.add("elope");
        arrayList.add("epele");
        arrayList.add("epole");
        arrayList.add("epele");
        arrayList.add("pool");
        assertEquals(3,arrayList.lastIndexOf("epele"));
    }


}
