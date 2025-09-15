package org.learn.topics.recursion;

public class PrintReverseWord {

    public static void main(String[] args) {

        System.out.println("A:" + printReverse("Recursion"));
        System.out.println("B:" + printReverse(""));
        System.out.println("C:" + printReverse(null));
        System.out.println("D:" + printReverse("A"));

        /*
        A:noisruceR
        B:
        C:
        D:A
         */

    }

    private static String printReverse(String word) {

        if(word == null || word.isEmpty()) {
            return "";
        } else if(word.length()==1) {
            return word;
        } else {
            char lastChar = word.charAt(word.length()-1);
            word = word.substring(0, word.length()-1);
            return lastChar + printReverse(word);
        }

    }


}
