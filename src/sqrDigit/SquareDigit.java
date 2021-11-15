/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqrDigit;

/**
 *
 * @author User
 */
public class SquareDigit {
     public int squareDigits(int n) {
    Integer x = n;
    String str;
    StringBuilder sb = new StringBuilder();
    char[] ch;
    Character ch1;
    str = x.toString();
    ch = str.toCharArray();
    for (char c : ch){
        ch1 = (Character)c;
        x = Character.getNumericValue(ch1);
        sb.append(x * x);
    }
    System.out.println(sb);
    str = sb.toString();
    x = Integer.parseInt(str);
    System.out.println(x);
    return x;
  }
}
//public class SquareDigitA {
//
//    public int squareDigits(int n) {
//        return Integer.parseInt(String.valueOf(n)
//                                      .chars()
//                                      .map(i -> Integer.parseInt(String.valueOf((char) i)))
//                                      .map(i -> i * i)
//                                      .mapToObj(String::valueOf)
//                                      .collect(Collectors.joining("")));
//    }

//public class SquareDigit {
//  private static final int BASE = 10;
//  
//  public int squareDigits(int n) {
//    if (n < BASE) {
//      return n * n;
//    }
//    int digit = n % BASE;
//    int squaredDigit = digit * digit;
//    return squaredDigit + (squaredDigit < BASE ? BASE : BASE * BASE) * squareDigits(n / BASE);
//  }
//}