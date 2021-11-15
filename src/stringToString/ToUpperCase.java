/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringToString;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class ToUpperCase {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return null;
        } else {
            phrase = phrase.replaceAll("\\s{2,}", " ").trim();// zamena probelov 2 i bolee na " " + obrezat " " po krayam
            String[] words = phrase.split(" ");
           
            System.out.println(Arrays.deepToString(words));
            StringBuilder sb = new StringBuilder();
            
            for (String word : words) {
                sb.append(word.substring(0, 1).toUpperCase());
                sb.append(word.substring(1, word.length()));
                sb.append(" ");
            }
            System.out.println(sb);
            phrase = sb.toString().trim();
        }
        System.out.println(phrase);
        
        return phrase;
    }
}
