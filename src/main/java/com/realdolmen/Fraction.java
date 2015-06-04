package com.realdolmen;

/**
 * Created by jeansmits on 4/06/15.
 */
public class Fraction {
    private int numerator;
    private int denominator;


    public String simplify(){
        int common = Utilities.greatestCommonFactor(numerator,denominator);
        return numerator/common + " " + denominator/common;

    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    public double asDouble(){
        return (double)(numerator/denominator);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0) throw new ArithmeticException();

    }
}
