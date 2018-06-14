package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] a) {
        int t;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[i]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
        }
    return a;
    }
}
