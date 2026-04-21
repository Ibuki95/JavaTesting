package javaTesting;

import javaTesting.Resources.AppParameters;
import org.junit.Assert;
import org.junit.Test;

public class AppParametersTest {

    public static final String DOMAIN_EXPECTED = "127.0.0.1";
    public static final String PORT_EXPECTED = "80";

    @Test
    public void domainURLCorrect(){
        Assert.assertEquals("Retorna la part FQDN", DOMAIN_EXPECTED, AppParametersTest.DOMAIN_EXPECTED);
    }

    @Test
    public void portURLCorrect(){
        Assert.assertEquals("Retorna el port correcte", PORT_EXPECTED, AppParameters.PORT);
    }
}

