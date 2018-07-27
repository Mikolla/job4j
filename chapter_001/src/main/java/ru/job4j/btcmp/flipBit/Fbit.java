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
        System.out.println(Integer.toBinaryString(value));
        return 1; // put your implementation here
    }

    public static void main(String[] args) {
        System.out.println(flipBit(8,1));
    }
}
