package ru.job4j.calculator;

/**
 * Created by bondarenko.n on 05.06.2018.
 * \test\java\ru\job4j\calculator\CalculatorTest.java
 */
public class Calculator {
    private double result;
    /**
     *adding
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     *subtraction
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     *dividing
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     *multiplication
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }
}
