/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_salt;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class PasswdCheckTest {
    
    public PasswdCheckTest() {
    }

    @Test
    public void testPasswdCheck() {
        System.out.println("passwdCheck");
        String password = "";
        boolean expResult = false;
        boolean result = PasswdCheck.passwdCheck(password);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
