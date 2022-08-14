package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {

    @Test
    void testThatListIsBlank(){
        Vector victor = new Vector();
        assertTrue(victor.isEmpty());
    }
    @Test
    void testThatAnItemCanBeAdded(){
        Vector victor = new Vector();
        victor.add("Fifa 2022");
        assertFalse(victor.isEmpty());
    }
    @Test
    void testThatMultipleItemsCanBeAdded(){
        Vector victor = new Vector();
        victor.add("Fifa 2022");
        victor.add("Splinter Cell");
        victor.add("Ghost Reckon");
        victor.add("Fear 4");
        assertFalse(victor.isEmpty());

    }
    @Test
    void testGetMultipleItemByIndex() {
        Vector victor = new Vector();
        victor.add("Fifa 2022");
        victor.add("Splinter Cell");
        victor.add("Ghost Reckon");
        victor.add("Fear 4");
        assertEquals("Fifa 2022", victor.get(0));
        assertEquals("Splinter Cell", victor.get(1));
        assertEquals("Ghost Reckon", victor.get(2));
        assertEquals("Fear 4", victor.get(3));
    }
    @Test
    void testThatItemCanBeRemoved(){
     Vector victor = new Vector();
     victor.add("Fifa 2022");
     victor.add("Splinter cell");
     victor.add("Ghost Reckon");
     victor.add("Fear 4");
     victor.remove(0);
     assertEquals(null,victor.get(0));

    }
}
