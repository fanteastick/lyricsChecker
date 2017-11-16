package lyrics;

import java.awt.Component;
import java.util.*;
import javax.swing.JOptionPane;

public class checkinLyrics {
    private static Component frame;

    // Explain: the main
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(frame, "Welcome to the lyrics checker!");
        String lyrics = asker();
        String[] words = taboo();

        System.out.println("Your lyrics are: " + lyrics);
        System.out.println(plural(words));

        System.out.println("Now performing lyrics search...");
        String[][] searcher = search(lyrics, words);
        System.out.println(Arrays.deepToString(searcher));
        // TODO make a search method that includes toUpperCase
    }

    /*
     * 2 dimensional arrays!! String concatenation the numbers at the end of the
     * method? Then keep converting to int for other methods oops // for later
     * scaling, the input for lyrics would become an array
     */

    // CURRENTLY WORKING ON THIS ONE
    public static String[][] search(String lyrics, String[] words) {
        String[][] fullArr = new String[words.length][2];
        for (int i = 0; i < fullArr.length; i++) {
            fullArr[i][0] = words[i];
            fullArr[i][1] = countWords(lyrics, words[i]) + "";
        }
        return fullArr;
    }
    //AND THIS ONE
    public static int countWords(String lyrics, String words) {
        int instance = 0;

        return instance;
    }

    // Explain: Asks user input for lyrics, returns string
    public static String asker() {
        String allLyrics = JOptionPane.showInputDialog(frame, "Please input the song lyrics:");
        return allLyrics;
    }

    // Explain: asks user input for words; does a for loop to make an array of all
    // the words that the user inputs
    public static String[] taboo() {
        String theWord = JOptionPane.showInputDialog(frame, "What word are you looking for?");
        // TODO fix this method so it's smoother
        int i = 1;
        String[] wordArr = new String[1];
        wordArr[0] = theWord;
        String[] listWords = Arrays.copyOf(wordArr, wordArr.length);
        do {
            theWord = JOptionPane.showInputDialog(frame, "Is there another word? Enter nothing to stop.");
            listWords = Arrays.copyOf(listWords, listWords.length + 1);
            listWords[i] = theWord;
            i++;

        } while (theWord.length() != 0);
        String[] finalArray = Arrays.copyOf(listWords, listWords.length - 1); // takes off the END entry. not very
                                                                              // elegant.
        /*
         * println's checking if you got the right arrays
         * System.out.println(Arrays.toString(finalArray));
         * System.out.println(Arrays.toString(listWords));
         */
        return finalArray;
    }

    // Explain: turns an array of Strings into simple list with spaces between
    public static String turnToString(String[] arr) {
        String hi = "";
        for (int i = 0; i < arr.length; i++) {
            hi = hi + arr[i] + " ";
        }
        System.out.println(hi);
        return hi;
    }

    // Explain: Simple; makes output reporting words in String change based on # of
    // words
    public static String plural(String[] arr) {
        String turned = turnToString(arr);
        if (arr.length < 2) {
            return "The word you're looking for is: " + turned;
        }
        return "The " + arr.length + " words you're looking for are: " + turned;
    }
}
