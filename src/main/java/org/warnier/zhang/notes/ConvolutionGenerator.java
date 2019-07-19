package org.warnier.zhang.notes;

public class ConvolutionGenerator {
    private int n;
    private int number;
    private int[][] convolutionNumbers;

    public ConvolutionGenerator(int n) {
        this.n = n;
        this.convolutionNumbers = new int[n][n];
        if (n % 2 != 0) {
            this.convolutionNumbers[n / 2][n / 2] = n * n;
        }
        this.number = 1;
    }

    public ConvolutionGenerator generate() {
        // 圈数；
        for (int r = 0; r < n / 2; r++) {
            // 从上到下；
            for (int i = r; i < n - 1 - r; i++) {
                convolutionNumbers[i][r] = number++;
            }

            // 从左到右；
            for (int j = r; j < n - 1 - r; j++) {
                convolutionNumbers[n - 1 - r][j] = number++;
            }

            // 从下到上；
            for (int k = n - 1 - r; k > r; k--) {
                convolutionNumbers[k][n - 1 - r] = number++;
            }

            // 从右到左；
            for (int l = n - 1 - r; l > r; l--) {
                convolutionNumbers[r][l] = number++;
            }
        }
        return this;
    }

//    public ConvolutionGenerator generate() {
//        int a = 0;
//        int b = n - 1 - a;
//        while (b >= a) {
//            // 左下半圈；
//            for (int i = a; i <= b; i++) {
//                for (int j = a; j <= b; j++) {
//                    if (i != b && j == a) {
//                        convolutionNumbers[i][j] = number++;
//                    }
//                    if (i == b && j != b) {
//                        convolutionNumbers[i][j] = number++;
//                    }
//                }
//            }
//
//            // 右上半圈；
//            for (int i = b; i >= a; i--) {
//                for (int j = b; j >= a; j--) {
//                    if (i != a && j == b) {
//                        convolutionNumbers[i][j] = number++;
//                    }
//                    if (i == a && j != a) {
//                        convolutionNumbers[i][j] = number++;
//                    }
//                }
//            }
//
//            a++;
//            b = n - 1 - a;
//        }
//        return this;
//    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", convolutionNumbers[i][j]);
            }
            System.out.println();
        }
    }
}
