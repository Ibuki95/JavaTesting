package javaTesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerStudyTest {

    @Test
    public void integerStudy(){
        Integer vuit = new Integer(8);
        Integer vint = new Integer("20");
        Integer tretze = 13;
        int esperat = 13;

        assertEquals("El nombre tretze val realment tretze", esperat, tretze.intValue());

        assertEquals("El nombre vint val realment 20", 20, vint.intValue());
    }
}
