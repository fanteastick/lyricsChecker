package lyrics;

import java.awt.Component;

import javax.swing.JOptionPane;

public class OptionPaneTester {
    private static Component frame;

    public static void main(String[] args) {

        int starter = JOptionPane.showConfirmDialog(frame, "Welcome to the lyrics checker!");
        String answer = confirmPane(starter);
        System.out.println(answer);

        JOptionPane.showMessageDialog(null, "alert", "the title text", JOptionPane.ERROR_MESSAGE);

        /*
         * JOptionPane.showInternalConfirmDialog(frame, "please choose one",
         * "information", JOptionPane.YES_NO_CANCEL_OPTION,
         * JOptionPane.INFORMATION_MESSAGE);
         */

        Object[] possibleValues = { "First", "Second", "Third" };
        Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE,
                null, possibleValues, possibleValues[0]);
        System.out.println(selectedValue);
    }

    public static String confirmPane(int answer) { //
        if (answer == 0) {
            return "Yes";
        } else if (answer == 1) {
            return "No";
        } else {
            return "Cancel";
        }
    }
}
