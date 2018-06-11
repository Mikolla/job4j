package ru.job4j.loop;
/**
 * @author Bondarenko
 * @version $Id$
 * @since 0.1
 */
public class Factorial {

    /**
     * Считает факториал.
     * @param int n.
     * @return факториал.
     */

    public int calc(int n) {
        int s = 1;
        for (int i = 1; i <= n; i++) {
         s = s * i;
         }
        return s;
    }


}
