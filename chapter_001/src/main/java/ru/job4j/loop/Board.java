package ru.job4j.loop;

/**
 * @author Bondarenko
 * @version $1$
 * @since 11.6.18
 */

public class Board {

    /**
     * Рисуем шахматную доску.
     * @param int width, height.
     * @return String.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
     //   System.out.println(screen);
        return screen.toString();
    }





}