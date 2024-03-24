package student;    // DO NOT REMOVE FROM SUBMITTED FILE

import java.util.Objects;

/**
You are working for a new cybersecurity company “AlgoWare Defender” on a decoding tool.
The decoding tool is meant to help reverse a nefarious one way encoding scheme of letters to digits.

The encoding scheme coverts letter strings into numeric strings by
converting each letter to a digit based on its place in the alphabet.

Here is the encoding table
A : 1
B : 2
…
Z : 26

For example, the string ZAB maps to 2612.

The nefarious part of this scheme is that it is not reversible!

However, if you are given 2612 this could be decoded in multiple ways

26 1 2 = ZAB
2 6 12 = BFL
2 6 1 2 = BFAB
26 12 = ZL

AlgoWare Defender’s decoding tool will have a few components; you are working on the first piece:
determining how many decodings are possible. For example, there are 4 decodings for 2612

You must write a function: findNumDecodings
which when given a string of digits returns the number of possible decodings.

Your program must be efficient and must use dynamic programming.

You must also provide an explanation of the running time of your code

Code Author: <Your Name Here>

Running Time Analysis
--------------------
<Your analysis here>
*/
public class AlgoWareDefender {
    public static int findNumDecodings(String string) {
        return -1;
    }

    /*
    DO NOT EDIT BELOW THIS
    Below is the unit testing suite for this file.
    It provides all the tests that your code must pass to get full credit.
    */
    private static void printTestResult(String testName, boolean result) {
        String color = result ? "\033[92m" : "\033[91m";
        String reset = "\033[0m";
        System.out.printf("%s[%b] %s%s\n", color, result, testName, reset);
    }

    private static void testAnswer(String testName, Integer actual, Integer expected) {
        if (Objects.equals(actual, expected)) {
            printTestResult(testName, true);
        }
        else {
            printTestResult(testName, false);
            System.out.printf("Expected: %s \nGot:      %s\n", expected, actual);
        }
    }

    public static void runTests() {
        testExample();
        testEmpty();
        testSingle();
        testDouble();
        testInvalid1();
        testInvalid2();
        testNormal1();
        testNormal2();
        testNormal3();
        testManyOnes();
    }

    private static void testExample() {
        int result = AlgoWareDefender.findNumDecodings("2612");
        int expectedAnswer = 4;

        testAnswer("testExample", result, expectedAnswer);
    }

    private static void testEmpty() {
        int result = AlgoWareDefender.findNumDecodings("");
        int expectedAnswer = 1;

        testAnswer("testEmpty", result, expectedAnswer);
    }

    private static void testSingle() {
        int result = AlgoWareDefender.findNumDecodings("8");
        int expectedAnswer = 1;

        testAnswer("testSingle", result, expectedAnswer);
    }

    private static void testDouble() {
        int result = AlgoWareDefender.findNumDecodings("25");
        int expectedAnswer = 2;

        testAnswer("testDouble", result, expectedAnswer);
    }

    private static void testInvalid1() {
        int result = AlgoWareDefender.findNumDecodings("0");
        int expectedAnswer = 0;

        testAnswer("testInvalid1", result, expectedAnswer);
    }

    private static void testInvalid2() {
        int result = AlgoWareDefender.findNumDecodings("1200");
        int expectedAnswer = 0;

        testAnswer("testInvalid2", result, expectedAnswer);
    }

    private static void testNormal1() {
        int result = AlgoWareDefender.findNumDecodings("123456789");
        int expectedAnswer = 3;

        testAnswer("testNormal1", result, expectedAnswer);
    }

    private static void testNormal2() {
        int result = AlgoWareDefender.findNumDecodings("1011121314151617181920212223242526");
        int expectedAnswer = 86528;

        testAnswer("testNormal2", result, expectedAnswer);
    }

    private static void testNormal3() {
        int result = AlgoWareDefender.findNumDecodings("1232020410105");
        int expectedAnswer = 3;

        testAnswer("testNormal3", result, expectedAnswer);
    }

    private static void testManyOnes() {
        int result = AlgoWareDefender.findNumDecodings("1111111111111111111111111111111111111111");
        int expectedAnswer = 165580141;

        testAnswer("testManyOnes", result, expectedAnswer);
    }

    public static void main(String[] args) {
        runTests();
    }
}