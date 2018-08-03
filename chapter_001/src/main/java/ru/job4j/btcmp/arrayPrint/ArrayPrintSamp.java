package ru.job4j.btcmp.arrayPrint;

import java.util.Arrays;

/**
 * Created by bondarenko.n on 02.08.2018.
 */
public class ArrayPrintSamp {

    private void test(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }
    }

    private void stringChanger(String string) {
        string = string.concat(" - changed");
    }

    private void intChanger(int a) {
        a += 1;
    }

   static class Persona {
        String name;

        public Persona(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    void renamer (Persona persona) {
        persona.setName("Unknown");
    }


    public static void main(String[] args) {
        final int[] ints = {1, 3, 5, 7, 9, 11};
        for (int i : ints) {
            System.out.print(i + " ");
        }
        System.out.println(System.lineSeparator() + Arrays.toString(ints));
        Arrays.stream(ints).forEach(System.out::print);
        System.out.println();
        Arrays.stream(ints).forEach(value -> System.out.print(value + " "));


        new ArrayPrintSamp().test(ints);
        System.out.println(System.lineSeparator() + Arrays.toString(ints));

        String string = "old string";
        new ArrayPrintSamp().stringChanger(string);
        System.out.println(string);

        Integer a = 5;
        new ArrayPrintSamp().intChanger(a);
        System.out.println(a);

        Persona persona = new Persona("Vasiliy");
        new ArrayPrintSamp().renamer(persona);
        System.out.println(persona.getName());


    }
}
