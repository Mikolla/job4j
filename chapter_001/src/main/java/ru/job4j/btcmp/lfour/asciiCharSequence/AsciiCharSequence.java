package ru.job4j.btcmp.lfour.asciiCharSequence;

public class AsciiCharSequence implements CharSequence{

    byte[] bytes = new byte[1];


    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {

       String s = new String(String.valueOf(bytes));
        return super.toString();
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }


    public static void main(String[] args) {
        byte[] byteArray = new byte[] {87, 79, 87, 46, 46, 46};
        String value = new String(byteArray);
        System.out.println(value);
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(byteArray);
    }
}
