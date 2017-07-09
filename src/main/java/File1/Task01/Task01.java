package File1.Task01;

public class Task01 {

    public static int findInt(int[] array){
        int t = 0;
        for (int i = 0; i < array.length; i++) {
            t ^= array[i];
        }
        return t;
    }
}

/**Как изменится алгоритм, если каждое число будет встречаться в файле чётное число раз,
 а единственное из них нечётное число раз?

 -Никак не изменится*/
