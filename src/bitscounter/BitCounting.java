/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitscounter;

/**
 *
 * @author User
 */
public class BitCounting {

    private static Integer m;

    public static int countBits(int n) {
        m = Integer.bitCount(n);
        return m;
    }
}
/*
 public static int countBits(int n){
    return (int) Integer.toBinaryString(n).chars()
              .filter(c -> c == '1')
              .count();
  }
  
}
*/