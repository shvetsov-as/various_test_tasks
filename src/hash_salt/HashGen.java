/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_salt;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/**
 *
 * @author User
 */
public final class HashGen {

    private static String passwordPassed;
    private static String salt;
   
    public static HashMap<String, String> hashGen(String password) throws NoSuchAlgorithmException {

        salt = SaltGen.saltGenerated();
        passwordPassed = HashCore.getHash(salt, password);
        
        HashMap<String, String> hashMapRes = new HashMap<>();
        hashMapRes.put("salt", salt);
        hashMapRes.put("hash", passwordPassed);
        
        System.out.println(salt);
        System.out.println(passwordPassed);
        System.out.println(hashMapRes);
        
        
        return hashMapRes;

    }
}
