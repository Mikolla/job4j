package ru.job4j.btcmp.lfour.asciiCharSequence;

public class AsciiCharSequence implements CharSequence{

    byte[] bytes;
    public AsciiCharSequence(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    public String toString() {

       String s = new String(bytes);
        return s;
    }

    @Override
    public int length() {
        return bytes.length;
    }

    @Override
    public char charAt(int index) {
        byte bytic = bytes[index];
        char c = (char)bytic;
        return c;
    }

    @Override
    public CharSequence subSequence(int start, int end)
    {
        byte[] bytetmp = new byte[end-start];
        for (int i = start; i < end; i++) {
           bytetmp[i-start] =  bytes[i];
        }
       CharSequence sub = new AsciiCharSequence(bytetmp);
        return sub;
    }


    public static void main(String[] args) {
        byte[] byteArray = new byte[] {87, 79, 87, 46, 46, 46};
        String value = new String(byteArray);
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(byteArray);
        System.out.println(asciiCharSequence.toString());
        System.out.println(asciiCharSequence.length());
        System.out.println(asciiCharSequence.charAt(0));
        System.out.println(value.substring(1,4));
        System.out.println(asciiCharSequence.subSequence(1,4).toString());

    }
}
