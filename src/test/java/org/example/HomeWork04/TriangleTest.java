package org.example.HomeWork04;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.AutoTest.HomeWork04.STriangle.areaOfATriangle;

public class TriangleTest {
    @Test
    public void calcPartiesTest () throws Exception {
        double result = areaOfATriangle(5,4,7);
        Assertions.assertEquals(9.797958971132712, result);
    }
}
