package assignment;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Write {

    private String text1;
    private int length;
    private int row;
    private int countWord;
    private String longestWord;


    public Write() {
        text1 = "";
        length = 0;
        row = 0;
        countWord = 0;
        longestWord = "";

    }

    public int getNbrOfRows() {
        return row;
    }

    public int getNbrOfcharacters() {
        return length;
    }

    public int getNbrOfWords() {
        return countWord;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public boolean control(String text) {
        boolean gogo;
        if ("stop".equals(text)) {
            gogo = false;

        } else {
            gogo = true;
        }
        return gogo;
    }
    public void rowNr(String text) {
        if ("stop".equals(text)) {
        } else {
            row++;
        }
    }

    public void characterNr(String text) {
        if ("stop".equals(text)) {
        } else {
            length = length + text.replace(" ", "").length();
        }
    }

    public void wordNr(String text) {
        if ("stop".equals(text)) {
        } else {
            String[] wordArray = text.split("\\s");
            int length2;
            if (!text.equals("")) {
                length2 = wordArray.length;

            } else length2 = 0;

            // countWord = countWord + text.split("\\s+").length;
            countWord = countWord + length2;
        }
    }

    public void longWord(String text) {
        if ("stop".equals(text)) {
        } else {
            //to get the longest word
            text1 = text1 + " " + text;
            String[] longArray = text1.split("\\s");

            for (int i = 0; i < longArray.length - 1; i++) {
                if (longArray[i].length() > longArray[i + 1].length()) {
                    String temp = longArray[i];
                    longArray[i] = longArray[i + 1];
                    longArray[i + 1] = temp;
                }
                longestWord = longArray[longArray.length - 1];

                //to get other words that are as long as the longest word
                int characterNr = longestWord.length();

                for (int j = 0; j < longArray.length - 1; j++) {
                    if (longArray[j].length() == characterNr) {

                        longestWord = longestWord + ", " + longArray[j];
                    }
                }
            }

        }

    }


}
















