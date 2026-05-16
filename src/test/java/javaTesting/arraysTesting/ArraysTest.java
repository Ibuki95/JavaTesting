package javaTesting.arraysTesting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArraysTest {
    @Test
    public void exempleArraysSenzill(){
        String[] numerals = {"zero", "un", "dos", "tres"};

        assertEquals("zero", numerals[0]);

        String nombres = "";

        for(String n : numerals){
            nombres += n + "|";
        }

        assertEquals(nombres , "zero|un|dos|tres|");
    }

    @Test
    public void provesOrdeancioArray(){
        String[] numerals = {"zero", "un", "dos", "tres"};

        Arrays.sort(numerals);

        for(int i = 0; i < numerals.length - 1; i++){
            assertTrue(numerals[i].compareTo(numerals[i+1]) < 0);
        }
    }
}
