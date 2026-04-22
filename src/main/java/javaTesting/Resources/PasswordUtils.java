package javaTesting.Resources;

import java.security.SecureRandom;
import java.util.Random;

public class PasswordUtils {
    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET = "0123456789ABCDEFG"; // això hauria de ser més complet

    public static String genSalt(){
        return genSalt(8);
    }

    public static String genSalt(int l){
        StringBuilder valor = new StringBuilder(l);

        for(int k = 0; k < l; k++){
            valor.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }

        return new String(valor);
    }
}
