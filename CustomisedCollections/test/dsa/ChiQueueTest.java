package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ChiQueueTest {
        ChiQueue queue;
        @BeforeEach
        public void setUp()
        {
            queue = new ChiQueue(3);
        }

        @Test
        public void testThatAddWorks(){
            assertTrue(queue.add("hi"));
            assertEquals(0,queue.getRear());
            queue.add("Bye");
            queue.add("Boo!");
            assertEquals(2,queue.getRear());
            assertEquals(3,queue.getCount());
        }

        @Test
        public void testThatAddThrowsExceptionIfQueueIsFull(){
            assertTrue(queue.add("hi"));
            assertTrue(queue.add("Bye"));
            assertTrue(queue.add("Boo!"));
            assertThrows(IllegalStateException.class, () -> queue.add("Bye"));
        }

        @Test
        public void testRemove(){
            queue.add("hi");
            queue.add("Bye");
            queue.add("Boo!");
            assertEquals("hi", queue.remove());
            assertEquals(1,queue.getFront());
            assertEquals(2,queue.getRear());
            assertEquals(2,queue.getCount());
            assertTrue(queue.add("Emma"));
            assertEquals(2,queue.getRear());
            assertEquals(0,queue.getFront());
            assertEquals(3,queue.getCount());
        }

        @Test
        public void testRemoveThrowsExceptionIfQueueIsEmpty(){
            assertThrows(IllegalStateException.class, () -> queue.remove());
        }

        @Test
        public void testElement(){
            queue.add("hi");
            queue.add("Bye");
            queue.add("Boo!");
            assertEquals("hi",queue.element());
            queue.remove();
            assertEquals("Bye",queue.element());
        }

        @Test
        public void testElementThrowsExceptionIfQueueIsEmpty(){
            assertThrows(NoSuchElementException.class, () -> queue.element());
        }

        @Test
        public void testPeek(){
            queue.add("hi");
            queue.add("Bye");
            queue.add("Boo!");
            assertEquals("hi", queue.peek());
            queue.remove();
            assertEquals("Bye", queue.peek());
            assertEquals(2,queue.getCount());
        }

        @Test
        public void testPeekReturnsNullIfQueueIsEmpty(){
            assertNull(queue.peek());
        }

        @Test
        public void testOffer(){
            assertTrue(queue.offer("hi"));
            assertEquals(0,queue.getRear());
            queue.offer("Bye");
            queue.offer("Boo!");
            assertEquals(2,queue.getRear());
            assertEquals(3,queue.getCount());
        }

        @Test
        public void testThatOfferReturnsNullIfQueueIsFull(){
            queue.offer("hi");
            queue.offer("Bye");
            queue.offer("Boo!");
            assertFalse(queue.offer("Emma"));
        }

        @Test
        public void testPoll(){
            queue.offer("hi");
            queue.offer("Bye");
            queue.offer("Boo!");
            assertEquals("hi", queue.poll());
            assertEquals(1,queue.getFront());
            assertEquals(2,queue.getRear());
            assertEquals(2,queue.getCount());
            assertTrue(queue.offer("Emma"));
            assertEquals(2,queue.getRear());
            assertEquals(0,queue.getFront());
            assertEquals(3,queue.getCount());
        }

        @Test
        public void testThatPollReturnsNullIfQueueIsEmpty(){
            assertNull(queue.poll());
        }

}
