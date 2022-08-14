package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    void testThatStackExist(){
        Stack stackz = new Stack();
        assertNotNull(stackz);
    }
    @Test
    void testThatStackIsBlank(){
        Stack stackz = new Stack();
        assertTrue(stackz.isEmpty());
    }
    @Test
    void testThatItemCanBeAddedToStack(){
        Stack stackz = new Stack();
        stackz.push("M-24");
        stackz.push("ShotGun");
        stackz.push("Thompson 1987");
        assertFalse(stackz.isEmpty());
    }
    @Test
    void testStackSize(){
        Stack stackz = new Stack();
        stackz.push("M-24");
        stackz.push("ShotGun");
        stackz.push("Thompson 1987");
        assertEquals(3,stackz.size());
    }
    @Test
    void getValueAtStackTopIndex(){
        Stack stackz = new Stack();
        stackz.push("M-24");
        stackz.push("ShotGun");
        stackz.push("Thompson 1987");
        assertEquals("Thompson 1987",stackz.peek());
    }
    @Test
    void testToSearchForAValueInStack(){
        Stack stackz = new Stack();
        stackz.push("M-24");
        stackz.push("ShotGun");
        stackz.push("Thompson 1987");
        assertEquals(0,stackz.search("M-24"));
    }
    @Test
    void testToRemoveValueInStack(){
        Stack stackz = new Stack();
        stackz.push("M-24");
        stackz.push("ShotGun");
        stackz.push("Thompson 1987");
        String victor = stackz.pop();
        assertEquals("Thompson 1987",stackz.pop());

    }


}
