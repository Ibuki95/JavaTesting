package javaTesting.arraysTesting;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArraysTest {
    @Test
    public void exempleArraysSenzill(){
        String[] numerals = {"zero", "un", "dos", "tres"};

        assertEquals("zero", numerals[0]);
    }
}
