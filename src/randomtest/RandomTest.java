/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomtest;

import bitscounter.BitCounting;
import hash_salt.HashCheck;
import hash_salt.HashGen;
import hash_salt.PasswdCheck;
import hash_salt.SaltGen;
import java.security.NoSuchAlgorithmException;
import randomtest.equal.Equals;
import randomtest.arrFactorySort.FabricArr;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import populationIncr.Arge;
import sqrDigit.*;
import sqrDigit.SquareDigitA.SquareDigitAA;
import stringToString.ToUpperCase;
import tribonacci.Xbonacci;

/**
 * @version version 1.0
 * @author User
 */
public class RandomTest {

    private static Integer a = 128;
    private static Integer b = 128;
    private static Integer c = 5;
    private static double[] e = {1, 2, 3};
    private static int f = 10;
    private static String d = "hello world how are you";

    public static void main(String[] args) {

        System.out.println("\n--------------Equals-------------------");
        Equals eq = new Equals();

        System.out.println(eq.equal(a, b));//127 true
        System.out.println("---------------------------------------\n\n");

        System.out.println("--------ArrFabric + Bubble sort--------");
        FabricArr fa = new FabricArr();
        //fa.getInstanse(a);
        System.out.println(Arrays.deepToString(fa.getInstanse(c)));
        System.out.println("---------------------------------------\n\n");

        System.out.println("--------To Upper Case--------");
        ToUpperCase toUp = new ToUpperCase();
        toUp.toJadenCase(d);
        //System.out.println(Arrays.deepToString(fa.getInstanse(c)));
        System.out.println("---------------------------------------\n\n");

        System.out.println("--------To Square Digit--------");
        SquareDigit toSqr = new SquareDigit();

        System.out.println(toSqr.squareDigits(2112));
        System.out.println();
        System.out.println("Variant Stream--------------");
        System.out.println(SquareDigitA.SquareDigitAA.squareDigits(121212));

        SquareDigitA.SquareDigitAA.setA(12);

        System.out.println("---------------------------------------\n\n");

        System.out.println("--------   Xbonacci()  --------");
        Xbonacci xbonacci = new Xbonacci();

        for (double d : xbonacci.tribonacci(e, f)) {
            System.out.println(d);
        }
        
System.out.println("--------   hashGen  --------");
       // ====================   hashGen
        try {
            //String s = SaltGen.saltGen();
            HashMap<String, String> salt_hash = new HashMap<>();
            salt_hash = HashGen.hashGen("Admin001");
            //System.out.println(mapResult.get("hash"));
            System.out.println(HashCheck.hashCheck(salt_hash, "Admin001"));
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(RandomTest.class.getName()).log(Level.SEVERE, null, ex);
        }

//        System.out.println("---------------------------------------\n\n");
//        System.out.println("--------   Password Test  --------");
//        
//        System.out.println(PasswdCheck.passwdCheck("Asssssss5sssssa"));
//        
//        
//        System.out.println("---------------------------------------\n\n");
//        System.out.println("--------   Population  --------");
//        
//        System.out.println(Arge.nbYear(1500000, 0.25, 1000, 2000000));//94
//        
//
//        System.out.println("---------------------------------------\n\n");
//        
//        System.out.println("--------   BitsCounting  --------");
//        
//        System.out.println(BitCounting.countBits(10));//5
//        
//
//        System.out.println("---------------------------------------\n\n");
    }

}
