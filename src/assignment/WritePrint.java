package assignment;


import assignment.Write;

import java.util.Scanner;

public class WritePrint {

    public static void main(String[] args) {

        Write myText = new Write();
        Scanner scan = new Scanner(System.in);
        String t = scan.nextLine();

        boolean go;
        go = myText.control(t);

        while (go) {
            myText.calculateNr(t);
            t = scan.nextLine();
            go = myText.control(t);
        }


        System.out.println(myText.getNbrOfRows() + " row(s)");
        System.out.println(myText.getNbrOfcharacters() + " character(s)");
        System.out.println(myText.getNbrOfWords() + " word(s)");
        System.out.println("Longest word: " + myText.getLongestWord());
    }


}
/*
    while (!"stop".equals(text)) {
            myText.rowNr(text);
            myText.characterNr(text);
            myText.wordNr(text);
            myText.longWord(text);
            text = scan.nextLine();
        }
 */






