package com.realdolmen;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by jeansmits on 4/06/15.
 */
public class FractionTest {
    @Test
    public void testSimplify() throws Exception {
        Fraction f = new Fraction(1,10);
        assertThat(f.simplify(),(startsWith ("1")));
    }

    @Test
    public void testToString() throws Exception {
        Fraction f = new Fraction(5,10);


    }
}
