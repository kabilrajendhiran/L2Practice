package com.company.demo;

public class SingleCharacterTraversal {

    public void findFrequencyOfChar(String str)
    {
        str = str.toLowerCase();
        int[] freq = new int['z'-'a'+1];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)-'a']++;
        }

        printFirstNonRepeatingCharacter(freq,str);
        printAllNonRepeatingCharacter(freq,str);
    }

    public void printFirstNonRepeatingCharacter(int[] freq, String str)
    {
        System.out.println("Print first non-repeating character");
        for (int i = 0; i < str.length(); i++) {
            if(freq[str.charAt(i)-'a']==1)
            {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

    public void printAllNonRepeatingCharacter(int[] freq, String str)
    {
        System.out.println("Print all non-repeating characters");
        for (int i = 0; i < str.length(); i++) {
            if(freq[str.charAt(i)-'a']==1)
            {
                System.out.print(str.charAt(i) +" ");

            }
        }
    }

}
