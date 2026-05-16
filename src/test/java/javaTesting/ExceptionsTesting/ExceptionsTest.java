package javaTesting.ExceptionsTesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionsTest {
    @Test(expected = NullPointerException.class)
    public void NullPointerTest(){
        Integer edat = null;

        String edatEnLletres = edat.toString();

        assertEquals("" + 18, edatEnLletres);
    }

    @Test
    public void catchNullPointerTest(){
        Integer edat = null;
        String edatEnLletres;

         try {
             edatEnLletres = edat.toString();
         } catch (NullPointerException npe){
             edat = 18;
             edatEnLletres = edat.toString();
         }

        assertEquals("" + 18, edatEnLletres);
    }
}
