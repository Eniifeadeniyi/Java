package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {

    MySet set;
    @BeforeEach
    void setUp(){
        set = new MySet();
    }

    @Test
    public void testThatSetIsEmptyUponCreation(){
        assertTrue(set.isEmpty());
    }

    @Test
    public void testThatSizeReturnsTheNumberOfElementsAddedNotTheLength(){
        set.add("hello");
        assertEquals(1, set.size());
    }

    @Test
    public void testContains(){
        assertFalse(set.contains("hello"));
        set.add("hello");
        assertTrue(set.contains("hello"));
    }

    @Test
    public void testThatAddOnlyAddsElementsThatAreNotInTheSetAlready(){
        assertTrue(set.add("hello"));
        assertFalse(set.add("hello"));
    }

    @Test
    public void testThatYouCanOnlyRemoveElementsThatAreInTheSet(){
        set.add("hello");
        set.add("bye");
        assertTrue(set.remove("hello"));
        assertFalse(set.remove("hello"));
    }

    @Test
    public void testClear(){
        set.add("hello");
        set.add("bye");
        set.clear();
        assertTrue(set.isEmpty());
    }


}
