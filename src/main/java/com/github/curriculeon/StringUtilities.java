package com.github.curriculeon;

import java.time.temporal.ValueRange;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment) {
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment  a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment) {
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input) {
        return input.substring(0, 3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input) {
        int lastindex = input.length();
        int startindex = lastindex - 3;
        return input.substring(startindex, lastindex);
    }

    /**
     * @param inputValue      the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue) {
        boolean result = inputValue == comparableValue;
        return result;
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {
        int numberofcharacters = inputValue.length();
        if(numberofcharacters % 2 == 0) {
            int midddle = numberofcharacters / 2;
            Character result = inputValue.charAt(midddle-1);
            return result;
        } else {
            int midddle = numberofcharacters / 2;
            Character result = inputValue.charAt(midddle);
            return result;
        }
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString) {
        String[] splitWord = spaceDelimitedString.split(" ");
        return splitWord[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString) {
        String[] splitWord = spaceDelimitedString.split(" ");
        return splitWord[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse) {
         String result= "";
         char[] characterarray = stringToReverse.toCharArray();
         int numberofcharacters = characterarray.length;
         int lastindex = numberofcharacters -1;
         int numberoftimeslooped = 0;
         while (numberofcharacters > numberoftimeslooped){
             int currentindex = lastindex - numberoftimeslooped;
             char currentCharacter = characterarray[currentindex];
             result = result + currentCharacter;

             System.out.println(currentCharacter);
             numberoftimeslooped = numberoftimeslooped + 1;
         }
        return result;
    }
}
