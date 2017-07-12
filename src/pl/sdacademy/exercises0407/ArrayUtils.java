package pl.sdacademy.exercises0407;

public class ArrayUtils {

    public static int getMax(int[] array) {
        int maxElem = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElem) {
                maxElem = array[i];
            }
//            System.out.println("Najwyższa wartość tablicy to: " + maxElem);
        }
        return maxElem;
    }

    public static int[] getMaxMinAndSum(int[] array) {
        int maxElem = 1000;
        int minElem = 0;
        int sum = 0;
        int elem = 0;
        for (int i = 0; i < array.length; i++) {

            if (elem > maxElem) {
                maxElem = elem;
            }
//            if (array[i] < minElem) {
//                minElem = array[i];
//            }
//            elem = elem + array[i];
//            sum = elem;
        }

        int[] maxMinSum = {maxElem, minElem, sum};
        return maxMinSum;
    }

    public static int[] getLarger(int[] array, int[] array2) {
        int sum = 0;
        int elem = 0;
        int sum2 = 0;
        int elem2 = 0;

        for (int i = 0; i < array.length; i++) {
            sum = elem + array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum2 = elem + array2[i];
        }
        if (sum > sum2) {
            return array;
        } else {
            return array2;
        }
    }

    public static int[] merge(int[] array, int[] array2) {

        int[] mergedArray = new int[array.length + array2.length];

        for (int i = 0; i < array.length; i++) {
            mergedArray[i] = array[i];
        }
        for (int i = 0; i < array2.length; i++) {
            mergedArray[i + array.length] = array2[i];
        }
        return mergedArray;
    }

    public static int[] getDistinct(int[] array) {
        int occurance = 0;
        int counter = 0;
        int i = 0;
        int disArray[] = new int[10];

//        for (int i = 0; i < array.length; i++) {

        while (counter < array.length) {
            if (array[counter] == array[i]) {
                occurance++;
                i++;
            }

            if (occurance > 1) {

                disArray[counter] = array[counter];
                counter++;
            } else {
                counter++;
            }
        }

//            }
        return disArray;
    }
}


//        int counter = 0;
//        int[] disArray = new int[counter];
//        int[] mirArray = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//
//            mirArray[i] = array[i];
//        }
//
//        for (int i = 0; i < mirArray.length; i++) {
//            if (mirArray[counter] == array[i]) {
//                continue;
//            } else {
//                disArray[i] = mirArray[counter];
//            }
//            counter++;
//        }
//        return disArray;


//            int repcheck = array[i];
//            if (repcheck == array[i + 1]) {
//
//
//            }



