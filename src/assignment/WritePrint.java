package assignment;


import assignment.Write;

import java.util.Scanner;

public class WritePrint {

    public static void main(String[] args) {

        Write myText = new Write();
        String text = "";

        Scanner scan = new Scanner(System.in);
        text = scan.nextLine();

        while (!"stop".equals(text)) {
            myText.rowNr(text);
            myText.characterNr(text);
            myText.wordNr(text);
            myText.longWord(text);
            text = scan.nextLine();
        }

        System.out.println(myText.getNbrOfRows() + " row(s)");
        System.out.println(myText.getNbrOfcharacters() + " character(s)");
        System.out.println(myText.getNbrOfWords() + " word(s)");
        System.out.println("Longest word: " + myText.getLongestWord());
    }


}







