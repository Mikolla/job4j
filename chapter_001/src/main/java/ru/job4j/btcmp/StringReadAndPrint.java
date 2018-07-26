package ru.job4j.btcmp;

import java.util.Scanner;

/**
 * Created by bondarenko.n on 26.07.2018.
 * 1) Прочитайте из консоли Scanner’ом строку, определите кол-во символов в строке,
 * выведите на экран кол-во символов. И добавьте в строку слово “java” и выведете её на экран.
 */
public class StringReadAndPrint {
    static void readerPrinter() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int len = string.length();
        StringBuilder stringBuilder = new StringBuilder(len);
        stringBuilder.append(" ")
                     .append(string)
                     .append(" java");
        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
       readerPrinter();
    }



}

