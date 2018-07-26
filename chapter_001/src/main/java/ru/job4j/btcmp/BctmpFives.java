package ru.job4j.btcmp;

public class BctmpFives {

    public static int getCountSecondsPassedInCurrentHour(int seconds) {

        return seconds % 3600;
    }

    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }
}
