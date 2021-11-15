/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomtest.arrFactorySort;

import java.util.Random;

/**
 *
 * @author User
 */
public class FabricArr implements IFabricArr<int[][], Integer> {

    private final Random random = new Random();

    @Override
    public int[][] getInstanse(Integer length) {
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                //array[i][j] = random.nextInt(100) + 1;

            }
        }

        //bubble sort
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                //array[i][j] = random.nextInt(2)+1;
                for (int k = 1; k < array.length - j; k++) {
                    if (array[i][k - 1] > array[i][k]) {
                        temp = array[i][k - 1];

                        array[i][k - 1] = array[i][k];
                        array[i][k] = temp;

                    }
                }
            }
        }
        return array;
    }
}
