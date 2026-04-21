package javaTesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerStudyTest {

    @Test
    public void integerStudy(){
        Integer vuit = new Integer(8);
        Integer tretze = 13;

        assertEquals("El nombre tretze val realment tretze", 13, tretze.intValue());
    }
}
