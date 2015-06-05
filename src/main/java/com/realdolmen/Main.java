package com.realdolmen;

/**
 * Created by jeansmits on 5/06/15.
 */
public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction (50,100 );
        System.out.println(f.simplify());
        Fraction g = new Fraction(1,10);
        System.out.println(g.equals(f));
        System.out.println(f.asDouble());
    }
}
