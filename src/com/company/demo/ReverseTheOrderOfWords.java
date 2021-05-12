package com.company.demo;

public class ReverseTheOrderOfWords {


    public String reverseWords(String s)
    {
        int i = s.length()-1;
        while (i >=0) {
            if(s.charAt(i)==' ' || s.charAt(i)=='$')
            {
                System.out.print(createSubstring(s,i+1)+" ");
                return reverseWords(createSubstring(s,0,i));
            }
            i--;
        }
        return "";
    }

    public String createSubstring(String s, int start, int end)
    {
        String s1 = "";
        for (int i = start; i < end; i++) {
            s1 = s1+s.charAt(i);
        }
        return s1;
    }

    public String createSubstring(String s, int start)
    {
        String s1 = "";
        for (int i = start; i < s.length(); i++) {
            s1 = s1+s.charAt(i);
        }
        return s1;
    }

}




