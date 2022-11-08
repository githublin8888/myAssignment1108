package assignment;

import assignment.Write;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

    public class WriteTestFall {

        @Test

        public void test1() {

            Write test = new Write();
            test.rowNr("hi");
            int expected = 1;
            int actual = test.getNbrOfRows();
            assertEquals(expected, actual);

        }

        @Test

        public void test2() {

            Write test = new Write();
            test.rowNr(" ");
            int expected = 1;
            int actual = test.getNbrOfRows();
            assertEquals(expected, actual);

        }
        @Test

        public void test3() {

            Write test = new Write();
            test.characterNr("how are you");
            test.characterNr("how are you");
            int expected = 18;
            int actual = test.getNbrOfcharacters();
            assertEquals(expected, actual);

        }

        @Test

        public void test4() {

            Write test = new Write();
            test.characterNr("");
            int expected = 0;
            int actual = test.getNbrOfcharacters();
            assertEquals(expected, actual);

        }

        @Test

        public void test9() {

            Write test = new Write();
            test.characterNr("?");
            int expected = 1;
            int actual = test.getNbrOfcharacters();
            assertEquals(expected, actual);

        }
        @Test

        public void test5() {

            Write test = new Write();
            test.wordNr("hi");
            test.wordNr("hi");

            int expected = 2;
            int actual = test.getNbrOfWords();
            assertEquals(expected, actual);
        }

        @Test

        public void test() {

            Write test = new Write();
            test.wordNr("");
            int expected = 0;
            int actual = test.getNbrOfWords();
            assertEquals(expected, actual);

        }


        @Test

        public void test6() {

            Write test = new Write();
            test.longWord("how are you");
            test.longWord("hi");
            String expected = "you, how, are";
            String actual = test.getLongestWord();
            assertEquals(expected, actual);

        }

        @Test

        public void test7() {

            Write test = new Write();
            test.wordNr("");
            String expected = "";
            String actual = test.getLongestWord();
            assertEquals(expected, actual);

        }
        @Test

        public void test8() {

            Write test = new Write();
            test.longWord("hello");
            test.longWord("hi");
            test.longWord("How do you do");
            String expected = "hello";
            String actual = test.getLongestWord();
            assertEquals(expected, actual);

        }



    }





