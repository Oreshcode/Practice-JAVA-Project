package Helpers;

import javax.swing.*;

public class Popup {

    public static void showErrorPopup() {
        JOptionPane.showMessageDialog(null, "Something is wrong. Please try again later.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    public static void showErrorPopup(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
