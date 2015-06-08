package com.realdolmen;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;

/**
 * Created by jeansmits on 4/06/15.
 */
public class FractionTest {
    @Test
    public void testSimplify() throws Exception {
        Fraction f = new Fraction(5, 10);
        assertThat(f.simplify(), (startsWith("1")));
    }

    @Test
    public void testToString() throws Exception {
        Fraction f = new Fraction(5, 10);
        assertEquals("5/10", f.toString());

    }

    @Test
    public void testEqualsFraction() throws Exception {
        Fraction f = new Fraction(5, 10);
        Fraction e = new Fraction(20, 40);
        assertTrue(f.equalsfraction(e));

    }

    @Test(expected = ArithmeticException.class)
    public void testZero() throws Exception {
        Fraction f = new Fraction(2, 0);
    }

    @Test
    public void testToDouble() throws Exception {
        Fraction f = new Fraction(50, 100);
        assertEquals(0.5, f.asDouble(), 1 * (10 ^ -8));
    }

    @Test
    public void testEquals() throws Exception {
        Fraction f = new Fraction(5, 10);
        Fraction e = new Fraction(5, 10);
        City c = new City("Abhu Dabhi", "2");
        assertTrue(f.simplify().equals(e.simplify()));
        assertFalse(e.equals(c));
    }

    @Test
    public void testGetter() throws Exception {
        Fraction f = new Fraction(40, 80);
        assertEquals(80, f.getDenominator());
        assertEquals(40, f.getNumerator());
    }

    @Test
    public void testReciprocal() throws Exception {
        Fraction f = new Fraction(5, 8);
        f.reciprocal();
        assertEquals(8, f.getDenominator());
        assertEquals(5, f.getNumerator());
    }

    @Test
    public void testAdd() throws Exception {
        Fraction f = new Fraction(5, 8);

    }
}
