package com.company.demo;

public class PatternPrinting {

    public void printPattern(int[] arr)
    {
        int length = arr.length;
        int n = 0;

        for (int i = 0; i < length; i++) {

            if (sumOfNnumbers(i)<=length)
            {
               n = i;
            }
            else {
                /*System.out.println(i);*/
                break;
            }

        }
        // System.out.println(n);



        for (int i = 0; i < n+1; i++) {
            int pos = 0;
            for (int j = 0; j < i; j++) {
                pos = pos + (n-j)%n;
                System.out.print(arr[pos+i-1]+" ");
            }
            System.out.println();
        }



    }

    public int sumOfNnumbers(int num)
    {
        return (num*(num+1))/2;
    }

}
