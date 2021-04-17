package com.company.demo;


public class RunLengthDecoding {


    public void decoding(String str)
    {
        int i=0;
        char ch = ' ';
        int n = str.length();
        boolean flag = false;
        while (i<n)
        {
            int c=0;
            while ((str.charAt(i)<'9') && (str.charAt(i)>='0'))
            {
                c =c*10+ str.charAt(i)-'0';
                i++;
            }
            if (flag)
            {
                printCharacter(ch,c);
                flag = false;
            }

            if(str.charAt(i)>'9')
            {
                ch = str.charAt(i);
                flag = true;
            }
            i++;
        }
    }

    public void printCharacter(char c , int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }


}
