package org.exmaple.module2test;

import org.junit.Assert;
import org.junit.Test;

import static org.example.module2test.Minus.minus;

public class MinusTest {
    @Test
    public void testMinus() {
        Assert.assertEquals(0, minus(1, 1));
    }
}
