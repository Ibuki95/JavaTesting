package javaTesting.ExceptionsTesting;

import org.junit.Test;

public class ExceptionsTest {
    @Test(expected = NullPointerException.class)
    public void NullPointerTest(){
        Integer edat = null;

        String edatenLletres = edat.toString();
    }
}
