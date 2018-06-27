package ru.job4j.loop;

/**
 * @author Bondarenko
 * @version $1$
 * @since 11.6.18
 */

public class Board {
    /**
     * Рисуем шахматную доску.
     * @param  width, height.
     * @return String.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                 if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
                     screen.append(ln);
        }
            return screen.toString();
    }





}