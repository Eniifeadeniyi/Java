package dsa.test.dsa;

import dsa.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest{

    MyStack stack;
    @BeforeEach
    public void setUp(){
        stack = new MyStack(6);
    }
    @Test
    public void testStackIsEmptyAtStart(){
        assertEquals(true,stack.isEmpty());
    }

    @Test
    public void testThatStackIsNotEmptyAfterPushing(){
        stack.push("Eniife");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThatStackIsEmptyAfterPoppingEverthingInsideStack(){
        stack.push("Eniife");
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testThatPoppingReturnsTheElementRemove(){
        stack.push("Eniife");
        stack.push("Ife");
        assertEquals("Ife", stack.pop());
        stack.pop();
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    public void testThatPeekShowsTheTopMostElement(){
        stack.push("Eniife");
        stack.push("Ife");
        assertEquals("Ife",stack.peek());
        stack.pop();
        assertEquals("Eniife",stack.peek());
        stack.pop();
        assertThrows(EmptyStackException.class, () -> stack.peek());
    }

    @Test
    public void testThatStackIsFullWorks(){
        stack.push("Eniife");
        stack.push("Ife");
        stack.push("Eunice");
        stack.push("Caleb");
        stack.push("Toni");
        stack.push("Anu");
        assertTrue(stack.isFull());
        stack.pop();
        assertFalse(stack.isFull());
    }

    @Test
    public void testThatPushDoesntWorkIfStackIsFull(){
        stack.push("Eniife");
        stack.push("Ife");
        stack.push("Eunice");
        stack.push("Caleb");
        stack.push("Toni");
        stack.push("Anu");
        assertThrows(IllegalStateException.class, () -> stack.push("try"));
    }



}