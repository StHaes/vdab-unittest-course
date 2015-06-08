package com.realdolmen;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Created by jeansmits on 8/06/15.
 */
public class CalculatorTest {

    @Test
    public void testCalculatorCanAddTwoNumbers() throws Exception {
        Calculator c = new Calculator();
        assertEquals(3,c.add("1,2")); // doesnt work for shizzles yet
    }

    @Test
    public void testCalculatorReturnsZeroOnEmptyString() throws Exception {
        Calculator c = new Calculator();
        assertEquals(0,c.add(""));

    }

    @Test
    public void testCalculatorReturnsSingleAdd() throws Exception {
        Calculator c = new Calculator();
        assertEquals(7,c.add("7"));
    }

    @Test
    public void testLongerThanNormalString() throws Exception {
        Calculator c = new Calculator();
        assertEquals(7,c.add("1,2,4"));
    }

    @Test
    public void testDecimalsAndBiggerCanBeAdded() throws Exception {
        Calculator c = new Calculator();
        assertEquals(150,c.add("25,100,25"));
    }
}
