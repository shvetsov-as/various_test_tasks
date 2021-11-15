/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_salt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author User
 */
public final class HashCore {

    private static final int PASSES = 10;//number of hash passes in function
    private static final int SALT_START = 0;//salt first char
    private static final int SALT_LEN = 5;//salt middle char(full salt - ten characters)

    private static final StringBuilder hashBuilder = new StringBuilder();
    private static MessageDigest sha2;// = MessageDigest.getInstance("SHA-2");

    private static byte[] hashBytes;
    private static String passwordPassed; //complited password hash

    public static String getHash(String salt, String password) throws NoSuchAlgorithmException {

        hashBuilder.append(salt.substring(SALT_START, SALT_LEN));// get a half of salt
        hashBuilder.append(password.trim().replace(" ", ""));//delete all whitespaces
        passwordPassed = hashBuilder.toString();
        hashBuilder.delete(0, passwordPassed.length());//hashBuilder refresh.

        sha2 = MessageDigest.getInstance("SHA-512");
        
        Integer count = 0;
        do {
            hashBytes = sha2.digest(passwordPassed.getBytes());
            for (byte b : hashBytes) {
                hashBuilder.append(String.format("%02X", b));
            }
            passwordPassed = hashBuilder.toString();
            hashBuilder.delete(0, passwordPassed.length());//hashBuilder refresh.
            count++;
        } while (!count.equals(PASSES));

        return passwordPassed;
    }
}
