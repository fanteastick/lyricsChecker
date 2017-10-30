package lyrics;

import java.awt.Component;
import java.util.*;
import javax.swing.JOptionPane;

public class checkinLyrics {
    private static Component frame;

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(frame, "Welcome to the lyrics checker!");
        String lyrics = asker();
        String word = taboo();
        
        System.out.println("Your lyrics are: " + lyrics);
        System.out.println("The word you're looking for is: " + word);
    }
    // TODO in other method, make the inputs toUpperCase();
    public static String asker() {
        String allLyrics = JOptionPane.showInputDialog(frame, "Please input the song lyrics:");
        return allLyrics;
    }
    public static String taboo() {
        String theWord = JOptionPane.showInputDialog(frame, "What word are you looking for?");
        String[] wordArr = new String[1];
        int i = 0;
        while (theWord.equals("END") == false) {
            String[] listWords = Arrays.copyOf(wordArr, i+1);
            listWords[i] = theWord;
            i++;
            theWord = JOptionPane.showInputDialog(frame, "Is there another word? Type \"END\" to stop.");
        }
        return theWord;
    }
}
