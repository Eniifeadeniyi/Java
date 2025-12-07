package Turtle;
//turtle
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    Turtle turtle;
    @BeforeEach
    void setUp() {
        turtle = new Turtle();
    }

    @Test 
    public void testThatSetPenDownWorks(){
        turtle.setPenDown("2");
        assertTrue(turtle.getPenDown());
    }

    @Test
    public void testThatSetPenUpWorks(){
        turtle.setPenDown("2");
        assertTrue(turtle.getPenDown());
        turtle.setPenDown("1");
        assertFalse(turtle.getPenDown());
    }

    @Test
    public void testThatSetTurningWorks(){
        turtle.setTurning("3");
        assertEquals(1,turtle.getTurning());
        turtle.setTurning("4");
        turtle.setTurning("4");
        assertEquals(-1,turtle.getTurning());
    }

    @Test
    public void testThatSetIsRowWorks(){
        turtle.setTurning("3");
        assertTrue(turtle.getIsRow());
        turtle.setTurning("4");
        turtle.setTurning("4");
        turtle.setTurning("4");
        assertFalse(turtle.getIsRow());
    }

    @Test
    public void testThatOnlyColumnIncreasesIfTurtleMovesAsIsRowIsFalse(){
        turtle.move("5,6");
        assertEquals(6, turtle.getColumn());
        assertEquals(0, turtle.getRow());
    }

    @Test
    public void testThatOnlyRowIncreasesIfTurtleMovesAsIsRowIsTrue(){
        turtle.setTurning("3");
        turtle.move("5,6");
        assertEquals(6, turtle.getRow());
        assertEquals(0, turtle.getColumn());
    }

    @Test
    public void testThatOnlyColumnReducesIfTurtleMovesAsIsRowIsFalse(){
        turtle.move("5,10");
        turtle.setTurning("3");
        turtle.move("5,10");
        turtle.setTurning("3");
        turtle.move("5,3");
        assertEquals(7, turtle.getColumn());
        assertEquals(10, turtle.getRow());
    }

    @Test
    public void testThatOnlyRowReducesIfTurtleMovesAsIsRowIsTrue(){
        turtle.move("5,10");
        turtle.setTurning("3");
        turtle.move("5,12");
        turtle.setTurning("4");
        turtle.setTurning("4");
        turtle.move("5,2");
        assertEquals(10, turtle.getRow());
        assertEquals(10, turtle.getColumn());
    }

    @Test
    public void testThatDrawWorks(){
        turtle.setPenDown("2");
        turtle.draw("5,6");
        assertEquals(1,turtle.getSpotOnFloor(0,4));
        assertEquals(0,turtle.getSpotOnFloor(0,8));
    }
}