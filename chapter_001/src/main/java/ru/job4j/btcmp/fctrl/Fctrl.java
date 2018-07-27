package ru.job4j.btcmp.fctrl;

import java.math.BigInteger;

/**
 * Created by bondarenko.n on 27.07.2018.
 */
public class Fctrl {
    public static BigInteger factorial(int n) {
        BigInteger result = new BigInteger("" + 1);
        for (int i = 1; i <= n; i ++){
            result = result.multiply(new BigInteger("" + i));
        }
        return result;
    }



    public static BigInteger factorial1(int n) {
        BigInteger num = BigInteger.valueOf(1);
        BigInteger result;
        if (n == 1)
            return BigInteger.valueOf(1);
    result = factorial1(n-1).multiply(BigInteger.valueOf(n));
        return result;
    }

    static int fac(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    static int facRecurs(int n) {

        if (n == 0) {
            return 1;
        }
       int result;
        result = facRecurs(n - 1) * n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(factorial1(6));
        System.out.println(fac(6));
        System.out.println(facRecurs(6));
    }
}
