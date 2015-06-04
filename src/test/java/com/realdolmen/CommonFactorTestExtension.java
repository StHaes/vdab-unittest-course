package com.realdolmen;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CommonFactorTestExtension {
    @Test
    public void testCommonFactor() throws Exception {
        assertEquals(8, Utilities.greatestCommonFactor(136, 40));
        assertEquals(2, Utilities.greatestCommonFactor(30, 16));

    }
}
