package ru.job4j.btcmp;

import java.util.Scanner;

/**
 * Created by bondarenko.n on 26.07.2018.
 * 1) Прочитайте из консоли Scanner’ом строку, определите кол-во символов в строке,
 * выведите на экран кол-во символов. И добавьте в строку слово “java” и выведете её на экран.
 */
public class StringReadAndPrint {
    void readerPrinter() {
        String string = new Scanner(System.in).nextLine();
        int len = string.length();
        StringBuilder stringBuilder = new StringBuilder().append(len)
                                                         .append(" ")
                                                         .append(string)
                                                         .append(" java");
        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        new StringReadAndPrint().readerPrinter();
    }



}

