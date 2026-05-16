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

    @Test
    public void tryCatchNullPointerTest(){
        Integer edat = null;
        String edatEnLletres = "";
        String text;

        try {
            edatEnLletres = edat.toString();
        } catch (NullPointerException npe){
            edat = 18;
            edatEnLletres = edat.toString();
        } finally {
            text = "Edat == " + edatEnLletres;
        }

        assertEquals("Edat == 18", text);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwIllegalArgumentExceptionTryCatchNullPointerTest(){
        Integer edat = null;
        String edatEnLletres = "";
        String text;

        try {
            System.out.println("Passa 1 - Generam NullPointerException");
            edatEnLletres = edat.toString();
        } catch (NullPointerException npe){
            System.out.println("Passa 2 - Capturam la NullPointerException");
            System.out.println("Passa 3 - Anam a llançar una excepció");
            throw new IllegalArgumentException("Excepció creada i llançada per jo");
        } finally {
            System.out.println("Passa final - Codi de tancament");
        }


    }
}
