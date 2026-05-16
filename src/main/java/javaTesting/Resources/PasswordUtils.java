package javaTesting.Resources;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class PasswordUtils {
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String genSalt() {
        byte[] salt = new byte[32];
        RANDOM.nextBytes(salt);

        return Base64.getEncoder().encodeToString(salt);
    }

    public static String genSecurePassword(String password, String salt) {
        return hashedPassword(password, salt);
    }

    public static String hashedPassword(String password, String salt) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            md.update((salt + password).getBytes());
            byte[] hashedBytes = md.digest();

            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();

        } catch (NoSuchAlgorithmException nsae) {
            throw new RuntimeException("Algoritme de hash incorrecte.", nsae);
        }
    }

    public static boolean verifyUserPassword(String passwordEntered, String userSalt, String securePassword) {
        return securePassword.equals(hashedPassword(passwordEntered, userSalt));
    }
}