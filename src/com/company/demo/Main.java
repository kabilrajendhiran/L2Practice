package com.company.demo;

public class Main {

    public static void main(String[] args) {

        System.out.println("Question 1");

	    RunLengthDecoding runLengthDecoding = new RunLengthDecoding();
	    runLengthDecoding.decode("A10C3B2D1$");

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Question 2");

        ReverseTheOrderOfWords obj = new ReverseTheOrderOfWords();
        obj.reverseWords("$first second third fourth");

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Question 3");
        SingleCharacterTraversal traversal = new SingleCharacterTraversal();
        traversal.printFirstNonRepeatingCharacter("character");
        traversal.printAllNonRepeatingCharacter("character");

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Question 4");
        System.out.println();


        int [][] matrix = {
                {1, 3, 4, 6, 2},
                {3, 5, 8, 9, 0},
                {1, 7, 3, 2, 4},
                {2, 3, 1, 4, 2},
                {6, 4, 3, 2, 1}
        };


        FindSumPairs findSumPairs = new FindSumPairs();
        int value = 10;
        findSumPairs.findSum(matrix, value);

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("Question 5");

        int[] n = { 12,19,38,56,34,23,18,69,41,12,45,78,43,99,10};
        PatternPrinting patternPrinting = new PatternPrinting();
        patternPrinting.printPattern(n);





    }
}
