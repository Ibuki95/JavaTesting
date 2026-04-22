package javaTesting;

import DomainEntities.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void constructUserTest(){
        User usuari = new User();

        assertTrue(usuari != null);
    }
}
