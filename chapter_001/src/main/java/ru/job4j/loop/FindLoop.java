package ru.job4j.loop;

/**
 * Поиск элемента в массиве
 * @author Bondarenko.
 * @sinse 13.6.18.
 * @ver. 347.
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i; break;
            }
        }
        return rst;
    }
}
