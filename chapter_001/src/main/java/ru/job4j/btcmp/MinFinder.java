package ru.job4j.btcmp;

/**
 * Created by bondarenko.n on 26.07.2018.
 * 4) Реализуйте метод, который находит минимум из 4-ёх чисел
 * (для этого он должен использовать другой метод, написанный вами, который находит минимум из двух чисел)
 */
public class MinFinder {
    static int findMinOfTwo(int a, int b) {
        return a > b ? a : b;
    }
    protected int finMinOfFour(int b, int c, int d, int e) {
         int min1 = findMinOfTwo(b , c);
         int min2 = findMinOfTwo(d , e);
         return findMinOfTwo(min1, min2);
    }
    public static void main(String[] args) {
        System.out.println(new MinFinder().finMinOfFour(445, 57, 98, 123));
    }
}
