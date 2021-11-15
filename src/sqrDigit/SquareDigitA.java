/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqrDigit;

import java.util.stream.Collectors;

/**
 *
 * @author User
 */
public class SquareDigitA {

    public static class SquareDigitAA {
//for static test
        private static int a;

        public static void setA(int a) {
            SquareDigitAA.a = a;
        }

        public int getA() {
            return a;
        }
//static test end
        public static int squareDigits(int n) {
            return Integer.parseInt(String.valueOf(n)
                    .chars()
                    .map(i -> Integer.parseInt(String.valueOf((char) i)))
                    .map(i -> i * i)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining("")));
        }
    }

}
