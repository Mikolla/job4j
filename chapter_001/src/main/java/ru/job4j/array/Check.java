package ru.job4j.array;

/**
 * determine is the array consists of only true or only false items
 * @author Bondarenko.
 * @sinse 13.6.18.
 * @ver. 1.
 */
public class Check {

    public boolean mono(boolean[] data) {
        for (boolean v:data
                ) {
            if (data[0] != v) {
                return false;
            }
        }
        return true;
    }
}
