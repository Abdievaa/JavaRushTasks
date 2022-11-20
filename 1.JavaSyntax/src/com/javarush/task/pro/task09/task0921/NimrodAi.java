package com.javarush.task.pro.task09.task0921;

/* 
Пиратский разворот
*/

import java.util.Arrays;

public class NimrodAi {

    public static void main(String[] args) {
        PastryLoader[] pastryLoaders = new PastryLoader[]{new PastryLoader(), new PastryLoader(), new PastryLoader()};

        scanMemory(pastryLoaders);
        replaceTarget(pastryLoaders);
        scanMemory(pastryLoaders);
    }

    public static void scanMemory(PastryLoader[] pastryLoaders) {
        System.out.println();
        for (PastryLoader pastryLoader : pastryLoaders) {
            System.out.println(Arrays.deepToString(pastryLoader.memory));
        }
    }

    public static void replaceTarget(PastryLoader[] pastryLoaders) {
        for (int i = 0; i < pastryLoaders.length; i++) {
            PastryLoader pastryLoader = pastryLoaders[i];
            String[][][] arrays = pastryLoader.memory;
            for (int j = 0; j < arrays.length; j++) {
                for (int k = 0; k < arrays[j].length; k++) {
                    for (int l = 0; l < arrays[j][k].length; l++) {
                        String str = arrays[j][k][l];
                        String str1 = str.toLowerCase();
                        if (str1.contains("nimrod")) {
                            String result = str1.replaceAll("nimrod", "pirate ship");
                            arrays[j][k][l] = result;


                        }

                    }

                }

            }


        }


    }
}
