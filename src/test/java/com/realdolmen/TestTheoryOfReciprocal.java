package com.realdolmen;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

/**
 * Created by jeansmits on 5/06/15.
 */
@RunWith(Theories.class)
public class TestTheoryOfReciprocal {
    @Theory
    public void positivevaluesgivepositivefractions(int a, int b) {
        assumeTrue(a > 0 && b > 0);
        System.out.println(a +"/" + b);
        Fraction f = new Fraction(a, b);
        Fraction g = f.reciprocal();
        assertEquals(a, g.getDenominator());
        assertEquals(b, g.getNumerator());

    }
    @DataPoints
    public static int[] values = {0,1,2,3,4,5,6,7,8,9,10};


}
