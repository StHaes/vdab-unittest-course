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
        return ((double)numerator)/denominator;
    }

    public boolean equalsfraction(Fraction f) {
        int common = Utilities.greatestCommonFactor(this.numerator,this.denominator);
        int commontwo = Utilities.greatestCommonFactor(f.numerator,f.denominator);
        if (this.denominator/common == f.denominator/commontwo || this.numerator/common == f.numerator/commontwo) {
            return true;
        }else {
            return false;
        }


    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0) throw new ArithmeticException();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (numerator != fraction.numerator) return false;
        return denominator == fraction.denominator;

    }


}
