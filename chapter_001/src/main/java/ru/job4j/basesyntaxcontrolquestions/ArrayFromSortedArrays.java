package ru.job4j.basesyntaxcontrolquestions;

public class ArrayFromSortedArrays
{

    public int[] doArray (int[] one, int[] two) {

        int[] result = new int[one.length + two.length];

        for (int k = 0, i = 0, j = 0; k < result.length; k++) {

            if (i > one.length - 1) {
                result[k] = two[j];
                j++;
            } else if (j > two.length - 1) {
                result[k] = one[i];
                i++;
            } else if (one[i] < two[j]) {
                result[k] = one[i];
                i++;
            } else {
                result[k] = two[j];
                j++;
            }
        }

            return result;
        }


}
