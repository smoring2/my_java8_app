package org.example.module1test;

import org.junit.Assert;
import org.junit.Test;

import static org.example.module1test.Add.add;

public class AddTest {

    @Test
    public void testAdd() {
        Assert.assertEquals(2, add(1, 1));
    }
}
