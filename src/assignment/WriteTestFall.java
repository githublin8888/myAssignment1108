package assignment;

import assignment.Write;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

    public class WriteTestFall {

        @Test

        public void testRow() {

            Write test = new Write();
            test.calculateNr("stop");
            int expected = 0;
            int actual = test.getNbrOfRows();
            assertEquals(expected, actual);
        }

        @Test

        public void testCharacter() {

            Write test = new Write();
            test.calculateNr("stop");
            int expected = 0;
            int actual = test.getNbrOfcharacters();
            assertEquals(expected, actual);

        }
        @Test

        public void testWord() {

            Write test = new Write();
            test.calculateNr("stop");
            int expected = 0;
            int actual = test.getNbrOfWords();
            assertEquals(expected, actual);

        }

        @Test

        public void testLongestWord() {

            Write test = new Write();
            test.calculateNr("stop");
            String expected ="";
            String actual = test.getLongestWord();
            assertEquals(expected, actual);

        }

        @Test

        public void testRow1() {

            Write test = new Write();
            test.calculateNr("hi");
            int expected = 1;
            int actual = test.getNbrOfRows();
            assertEquals(expected, actual);

        }

        @Test

        public void testRow2() {

            Write test = new Write();
            test.calculateNr("");
            int expected = 1;
            int actual = test.getNbrOfRows();
            assertEquals(expected, actual);
        }

        @Test

        public void testCharacter1() {

            Write test = new Write();
            test.calculateNr("how are you");
            test.calculateNr("how are you");
            int expected = 18;
            int actual = test.getNbrOfcharacters();
            assertEquals(expected, actual);

        }

        @Test

        public void testCharacter2() {

            Write test = new Write();
            test.calculateNr("");
            int expected = 0;
            int actual = test.getNbrOfcharacters();
            assertEquals(expected, actual);

        }

        @Test

        public void testCharacter3() {

            Write test = new Write();
            test.calculateNr("?");
            int expected = 1;
            int actual = test.getNbrOfcharacters();
            assertEquals(expected, actual);

        }

        @Test

        public void testWord1() {

            Write test = new Write();
            test.calculateNr("");
            int expected = 0;
            int actual = test.getNbrOfWords();
            assertEquals(expected, actual);

        }
        @Test

        public void testWord2() {

            Write test = new Write();
            test.calculateNr("hi");
            test.calculateNr("hi");

            int expected = 2;
            int actual = test.getNbrOfWords();
            assertEquals(expected, actual);
        }


        @Test

        public void testLongestWord1() {

            Write test = new Write();
            test.calculateNr("hello");
            test.calculateNr("hi");
            test.calculateNr("How do you do");
            String expected = "hello";
            String actual = test.getLongestWord();
            assertEquals(expected, actual);

        }
        @Test

        public void testLongestWord2() {

            Write test = new Write();
            test.calculateNr("how are you");
            test.calculateNr("hi");
            String expected = "you, how, are";
            String actual = test.getLongestWord();
            assertEquals(expected, actual);

        }

        @Test

        public void testLongestWord3() {

            Write test = new Write();
            test.calculateNr("");
            String expected = "";
            String actual = test.getLongestWord();
            assertEquals(expected, actual);

        }


    }





