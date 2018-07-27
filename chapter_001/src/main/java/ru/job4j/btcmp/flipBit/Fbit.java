package ru.job4j.btcmp.flipBit;

public class Fbit {
    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value     any number
     * @param bitIndex  index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        //System.out.println(Integer.toBinaryString(value));
        // int b = (int)Math.pow(2,bitIndex-1);
        //System.out.println(b);
        // System.out.println(Integer.toBinaryString(b));
        int b =  1 << bitIndex-1;
        //System.out.println( b);

        return value ^ b; // put your implementation here
    }

    public static void main(String[] args) {
        System.out.println(flipBit(45,4));
    }
}
