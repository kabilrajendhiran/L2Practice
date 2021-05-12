package com.company.demo;

public class PatternPrinting {

    public void printPattern(int[] arr)
    {
        int length = arr.length;
        int n = findN(length);

        for (int i = 1; i <= n; i++) {
            int j = 1;
            int pos = i - 1;
            System.out.print(arr[pos] + " ");
            while (j < i) {
                pos = pos + (n - j);
                System.out.print(arr[pos] + " ");
                j++;
            }
            System.out.println();
        }

    }

    public int findN(int length)
    {
        int i=2;
        while (sumOfNnumbers(i)<length) i++;
        return i;
    }

    public int sumOfNnumbers(int num)
    {
        return (num*(num+1))/2;
    }

}
