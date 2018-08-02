package ru.job4j.btcmp;

import java.util.Scanner;

/**
 * Created by bondarenko.n on 26.07.2018.
 * 1) Прочитайте из консоли Scanner’ом строку, определите кол-во символов в строке,
 * выведите на экран кол-во символов. И добавьте в строку слово “java” и выведете её на экран.
 */
public class StringReadAndPrint{
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

    class A extends  StringReadAndPrint{

    }

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        double result = Math.sqrt(x);
        return result; // your implementation here
    }




    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {

        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        for (StackTraceElement s : stackTrace) {
          //  System.out.println(s);
        }

        return stackTrace[2].getClassName() + "#" + stackTrace[2].getMethodName();
    }

    public static void main(String[] args) {
      // readerPrinter();

            System.out.println(getCallerClassAndMethodName());
            anotherMethod();

    }



}

