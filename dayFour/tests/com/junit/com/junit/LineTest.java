package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert.assertEquals;

class LineTest {

    private Line makeLine = new Line(5, 2, 4, 3);

    @Test
    void getSlope() {
        // 5, 2, 4, 3 = -1
        assertEquals(-1, makeLine.getSlope());
    }

    @Test
    void getDistance() {
        // 5, 2, 4, 3 = 1.41421356237
        assertEquals(1.41421356237,makeLine.getSlope());
    }

    @Test
    void parallelTo() {
        private Line newLine = new Line(3,1,4,4);
        assertEquals(false, makeLine.parallelTo(newLine));
    }
}