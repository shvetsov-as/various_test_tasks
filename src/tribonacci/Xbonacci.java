/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tribonacci;

import java.util.Arrays;



/**
 *
 * @author User
 */
public class Xbonacci {
    
    public double[] tribonacci(double[] s, int n) {

        double[] newarr = Arrays.copyOf(s, n);

        for (int i = 3; i < newarr.length; i++) {

            newarr[i] = newarr[i - 3] + newarr[i - 2] + newarr[i - 1];

        }
        
        

        return newarr;
    }
}
