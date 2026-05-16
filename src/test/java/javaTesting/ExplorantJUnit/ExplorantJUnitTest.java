package javaTesting.ExplorantJUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.security.InvalidParameterException;

public class ExplorantJUnitTest {
    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test(expected = IllegalArgumentException.class)
    public void testetjantIllegalArgumentException(){

        throw new IllegalArgumentException();
    }

    @Test
    public void IllegalParametersTest(){
        expected.expect(IllegalArgumentException.class);

        throw new IllegalArgumentException();
    }

    @Test
    public void missatgeExcepcioTest(){
        expected.expect(IllegalArgumentException.class);
        expected.expectMessage("the");

        throw new IllegalArgumentException("the exception");
    }
}
