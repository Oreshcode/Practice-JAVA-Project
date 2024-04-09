package Frame;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainCoordinator coordinator;
    public MainDataProvider dataProvider;

    public MainFrame() {
        super("Job Findings");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 800);
        setLayout(new FlowLayout());
        dataProvider = new MainDataProvider();
        coordinator = new MainCoordinator(this);
        coordinator.moveToLogin();
    }
}
