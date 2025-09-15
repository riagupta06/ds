package org.learn.topics.recursion;

public class PowerN {

    public static void main(String[] args) {
        System.out.println(powN(2,3));
        System.out.println(powN(3,3));
    }

    private static int powN(int a, int b) {
        if(b==0) {
            return 1;
        }
        else if(b==1) {
            return a;
        } else {
            return a * powN(a, b-1);
        }
    }
}
