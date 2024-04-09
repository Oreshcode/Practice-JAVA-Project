package Panels;

import Frame.MainFrame;
import Models.Job;

import javax.swing.*;

public class DetailsPanel extends BasePanel {
    private Job job;

    public DetailsPanel(MainFrame frame, Job job) {
        super(frame);
        this.job = job;
        createLabelsGUI();
        createButtonsGUI();
    }

    public void createLabelsGUI() {
        JTextArea descriptionArea = new JTextArea(job.getJobDescription());
        JScrollPane pane = new JScrollPane(descriptionArea);
        pane.setBounds(0,200,580,380);
        add(pane);
    }

    public void createButtonsGUI() {
        JButton backButton = new JButton("<");
        backButton.setBounds(10, 10, 50, 40);
        backButton.addActionListener(e -> frame.coordinator.moveToHome());
        add(backButton);
    }
}
