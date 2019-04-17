package FOO;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FOOTest {

    @Test
    public void testMessage(){
        String s = "Strängen som skickades in: hej!";
        assertEquals(s, new FOO().message("hej!"));

    }
}