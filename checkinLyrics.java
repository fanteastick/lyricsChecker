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
        System.out.println("The word you're looking for is: " + turnToString(words));
    }
    // TODO in other method, make the inputs toUpperCase();
    public static String asker() {
        String allLyrics = JOptionPane.showInputDialog(frame, "Please input the song lyrics:");
        return allLyrics;
    }
    public static String[] taboo() {
        String theWord = JOptionPane.showInputDialog(frame, "What word are you looking for?");
        
        int i = 0;
        String[] wordArr = new String[1];
        wordArr[0] = theWord;
        String[] listWords = new String[i];
        // TODO change this to a do/while loop
        while (theWord.equals("END") == false) {
            listWords = Arrays.copyOf(wordArr, i+2);
            listWords[i] = theWord;
            i++;
            theWord = JOptionPane.showInputDialog(frame, "Is there another word? Type \"END\" to stop.");
        }
        System.out.println(listWords[0] + listWords[1]);
        return listWords;
    }
    
    public static String turnToString(String[] arr) {
        String hi = "";
        for (int i = 0; i<arr.length; i++) {
            hi = hi + " " + arr[i];
        }
        System.out.println(hi);
        return hi;
    }
}
