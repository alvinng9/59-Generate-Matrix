package org.example;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int bot = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int flag = 0;
        int index = 1;
        while (index <= n * n) {
            if (flag == 0) {
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = index++;
                }
                flag++;
                top++;
            } else if (flag == 1) {
                for (int i = top; i <= bot; i++) {
                    matrix[i][right] = index++;
                }
                flag++;
                right--;
            } else if (flag == 2) {
                for (int i = right; i >= left; i--) {
                    matrix[bot][i] = index++;
                }
                flag++;
                bot--;
            } else {
                for (int i = bot; i >= top; i--) {
                    matrix[i][left] = index++;
                }
                flag = 0;
                left++;
            }
        }
        return matrix;
    }
}
