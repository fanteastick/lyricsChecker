package lyrics;

import java.awt.Component;
import java.util.*;
import javax.swing.JOptionPane;

public class checkinLyrics {
    private static Component frame;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(frame, "Welcome to the lyrics checker!");
        String lyrics = asker();
        String[] words = taboo();

        System.out.println("Your lyrics are: " + lyrics);
        System.out.println(plural(words));

        System.out.println("Now performing lyrics search...");
        // String searcher = search(lyrics, words);
        // TODO make a search method that includes toUpperCase
    }

    public static String asker() {
        String allLyrics = JOptionPane.showInputDialog(frame, "Please input the song lyrics:");
        return allLyrics;
    }

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
        // TODO add something for if the user inputs an empty string
        String[] finalArray = Arrays.copyOf(listWords, listWords.length - 1); // takes off the END entry. not very
                                                                              // elegant.
        /*
         * println's checking if you got the right arrays
         * System.out.println(Arrays.toString(finalArray));
         * System.out.println(Arrays.toString(listWords));
         */
        return finalArray;
    }

    public static String turnToString(String[] arr) {
        String hi = "";
        for (int i = 0; i < arr.length; i++) {
            hi = hi + arr[i] + " ";
        }
        System.out.println(hi);
        return hi;
    }

    public static String plural(String[] arr) {
        String turned = turnToString(arr);
        if (arr.length < 2) {
            return "The word you're looking for is: " + turned;
        }
        return "The " + arr.length + " words you're looking for are: " + turned;
    }
}
