package javaTesting.ExplorantJUnit;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.security.InvalidParameterException;
import java.util.Arrays;

import static  org.junit.Assert.*;

public class ExplorantJUnitTest {
    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test(expected = IllegalArgumentException.class)
    public void testetjantIllegalArgumentException(){

        throw new IllegalArgumentException();
    }

    @Ignore
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

    @BeforeClass
    public static void executaUnCopPerClasseAbansDeQualsevolTest(){
        System.out.println("Abans d'executar qualsevol test, un cop per classe");
    }

    @AfterClass
    public static void executarUnCopDespresDeQualsevolTest(){
        System.out.println("Després d'executar qualsevol test, un cop per classe");
    }

    @Before
    public void executaAbansDeCadaTest(){
        System.out.println("Abans d'executar qualsevol test, per a cada test !!!");
    }

    @After
    public void executaDespresDeCadaTest(){
        System.out.println("Després d'executar qualsevol test, per a cada test !!!");
    }

    @Test
    public void assercionsDeJUnit(){
        assertEquals(5, 2+3);

        assertFalse("false és false", false);
        assertFalse(false);
        assertFalse(3 > 5);

        assertTrue(5 > 3);

        int[] finsA10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] primers10 = {2, 1, 3, 5, 4, 6, 8, 7, 9 ,10};

        Arrays.sort(primers10);

        assertArrayEquals(finsA10, primers10);
    }
}
