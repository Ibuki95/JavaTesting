package javaTesting.ExplorantJUnit;

import org.junit.*;
import org.junit.rules.ExpectedException;

import java.security.InvalidParameterException;

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
}
