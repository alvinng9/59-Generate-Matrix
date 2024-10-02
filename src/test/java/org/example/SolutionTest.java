package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void generateMatrixTest() {
        Solution solution = new Solution();
        int[][] outputOne = new int[][] {
                {1,2,3},
                {8,9,4},
                {7,6,5}
        };
        assertArrayEquals(outputOne, solution.generateMatrix(3));
        int[][] outputTwo = new int[][] {
                {1}
        };
        assertArrayEquals(outputTwo, solution.generateMatrix(1));
    }

}