package com.collabera;

public class sort {

    public static void main(String[] args) {

        int[] a = {7, 45, 36, 64, 77, 34, 72, 95};
        int temp;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a.length - 2; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
