package ru.job4j.array;
/**
 * Обертка над строкой.
 *
 * @author Bondarenko
 * @version $1$
 * @since 13.6.18
 */

public class ArrayChar {
    private char[] data;
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }
    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
           boolean result = true;
           char[] value = prefix.toCharArray();
        // проверить. что массив data имеет первые элементы одинаковые с value
        for (int i = 0; i < value.length; i++) {
            if (value[i] != data[i]) {
                result = false;
            }
        }
        return result;
    }




}