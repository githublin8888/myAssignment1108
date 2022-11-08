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

    public void rowNr(String text) {
        row++;
        // row = row++;
    }

    public void characterNr(String text) {
        length = length + text.replace(" ", "").length();
    }

    public void wordNr(String text) {
        String[] wordArray = text.split("\\s");
        int length2;
        if (!text.equals("")) {
            length2 = wordArray.length;

        } else length2 = 0;

        // countWord = countWord + text.split("\\s+").length;
        countWord = countWord + length2;
    }

    public void longWord(String text) {
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



/*
 for (int i = 0; i < wordArray.length - 1; i++) {
            if (wordArray[i].length() == longestWord.length()) {
                longestWord = wordArray[i] + "" + longestWord;
            }
        }

         int wordLength=longestWord.length();
                for(int j=0; j<longArray.length - 1; j++){
                if(longArray[i].length()==wordLength){
                    longestWord=longestWord+" "+longArray[i];

                     //String[] wordArray = text.split("\\s");
        //countWord = countWord + wordArray.length;
        //countWord = countWord + text.split("\\s").length;

        //countWord = longArray.length;

        // String[] longWordArray=longestWord.split("\\s");

        delete repeat
        for (int j = 0; j < longArray.length - 1; j++) {
                if (longArray[j].length() == characterNr && !longArray[j].equals(longestWord)) {

                        longestWord = longestWord + ", " + longArray[j];
                }
                else longestWord = longestWord;
            }
            //longestWord = longestWord;

            ======

            for (int j = 0; j < longArray.length - 1; j++) {
                if (longArray[j].length() == characterNr && !longArray[j].equals(longestWord2)) {

                        longestWord = longestWord2 + ", " + longArray[j];
                }
                else longestWord = longestWord2;
            }
            =======
              //String[] newWordArray = longestWord.split("\\s");
            ArrayList<String> ls = new ArrayList<String>(Arrays.asList(longestWord));
            for (int k = 0; k < ls.size() - 1; k++) {
                if (ls.get(1).equals(ls.get(0))) {
                    ls.remove(1);
                }
            }

            ================
            //to get other words that are as long as the longest word
            int characterNr = longestWord.length();

            for (int j = 0; j < longArray.length - 1; j++) {
                if (longArray[j].length() == characterNr) {

                    longestWord = longestWord + " " + longArray[j];
                }

            }
 */














