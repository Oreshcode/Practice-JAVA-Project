package Panels;

import Frame.MainFrame;
import javax.swing.*;

public class BasePanel extends JPanel {
    public MainFrame frame;

    public BasePanel(MainFrame frame) {
        this.frame = frame;
        setLayout(null);
    }
}
