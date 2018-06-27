package ru.job4j.array;

/**
 * @author  Bondarenko
 * @version $1$
 * @since 12.6.18
 */

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int j = 1; j <= bound; j++) {
            rst[j - 1] = j * j;
        }
        return rst;
    }
}
