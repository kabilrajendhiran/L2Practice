package com.company.demo;

public class FindSumPairs {

    public void findSum(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j< arr[i].length-1 && arr[i][j] + arr[i][j+1] == 10 ) {
                    System.out.println(arr[i][j] + " " + arr[i][j+1]);
                }

                if (i< arr.length-1 && arr[i][j] + arr[i+1][j] == 10) {
                    System.out.println(arr[i][j] + " " + arr[i+1][j]);
                }

                if(i< arr.length-1 && j< arr[i].length-1 && arr[i][j]+ arr[i+1][j+1] == 10 )
                {
                    System.out.println(arr[i][j]+" "+ arr[i+1][j+1]);
                }

                if(i< arr.length-1 && j>0 && arr[i][j]+ arr[i+1][j-1] == 10)
                {
                    System.out.println(arr[i][j]+" "+ arr[i-1][j-1]);
                }

            }
        }
    }

}
