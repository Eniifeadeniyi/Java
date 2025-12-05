package dsa.test.dsa;

import dsa.MyQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    MyQueue queue;
    @BeforeEach
    public void setUp()
    {
        queue = new MyQueue(2);
    }

    @Test
    public void testThatYouCanAddElements(){
        assertTrue(queue.add("Hi"));
    }

    @Test
    public void testThatExceptionIsThrownIfQueueIsFull(){
        assertTrue(queue.add("Hi"));
        assertTrue(queue.add("Bye"));
        assertThrows(IllegalStateException.class, () -> queue.add("Hello"));
    }

    @Test
    public void testThatOfferReturnsTrueOrFalse(){
        assertTrue(queue.offer("Hi"));
        assertTrue(queue.offer("Bye"));
        assertFalse(queue.offer("See you!"));
    }

    @Test
    public void testThatRemoveRemovesAndReturnsTheElementAddedFirst(){
        queue.add("Hi");
        queue.add("Bye");
        assertEquals("Hi",queue.remove());
        queue.remove();
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    public void testThatPollRemovesAndReturnsTheElementAddedFirst(){
        queue.add("Hi");
        queue.add("Bye");
        assertEquals("Hi",queue.poll());
        queue.poll();
        assertNull(queue.poll());
    }

    @Test
    public void testThatElementReturnsTheElementAddedFirst(){
        queue.add("Hi");
        queue.add("Bye");
        assertEquals("Hi",queue.element());
        queue.remove();
        queue.remove();
        assertThrows(NoSuchElementException.class, () -> queue.element());
    }

    @Test
    public void testThatPeekReturnsTheElementAddedFirst(){
        queue.add("Hi");
        queue.add("Bye");
        assertEquals("Hi", queue.peek());
        queue.remove();
        queue.remove();
        assertNull(queue.peek());
    }


}
