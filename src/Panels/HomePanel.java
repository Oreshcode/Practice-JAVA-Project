package Panels;

import Frame.MainFrame;
import Helpers.Popup;
import Models.Job;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePanel extends BasePanel {
    private JTable jobsTable;
    private DefaultTableModel jobsTableModel;
    private JTextField searchField;
    private JTextField tagField;
    private JComboBox<String> locationComboBox;
    private JComboBox<String> industriesComboBox;
    private JButton updateButton;

    public HomePanel(MainFrame frame) {
        super(frame);

        createTableGUI();
        createSearchField();
        createDropdownGUI();
        createButtonsGUI();

        frame.dataProvider.fetchJobs("USA", "dev",  "ios");
    }

    private void createTableGUI() {
        // Table Model
        String[] columns = {"Company", "Job Title", "Location"};
        jobsTableModel = new DefaultTableModel();
        jobsTableModel.setColumnIdentifiers(columns);

        // Gain dataProvider with access to this model
        frame.dataProvider.setJobsTableModel(jobsTableModel);

        // Table
        jobsTable = new JTable(jobsTableModel);

        // Table Scroll
        JScrollPane tableScrollPane = new JScrollPane(jobsTable);
        tableScrollPane.setBounds(0, 67, frame.getWidth() - 10, frame.getHeight() - 60);
        add(tableScrollPane);
    }

    private void createSearchField() {
        searchField = new JTextField("Job title");
        searchField.setBounds(0, 0, frame.getWidth(), 32);
        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                frame.dataProvider.searchJob(searchField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                frame.dataProvider.searchJob(searchField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        add(searchField);
    }

    private void createDropdownGUI() {
        String[] countries =  {"USA", "Europe", "Italy", "Bulgaria", "Germany", "Spain"}; // Make this a request
        locationComboBox = new JComboBox<>(countries);
        locationComboBox.setBounds(0, 30, 140, 35);
        add(locationComboBox);

        String[] industries =  {"Dev", "Marketing", "Engineering", "Programming"}; // Make this a request
        industriesComboBox = new JComboBox<>(industries);
        industriesComboBox.setBounds(locationComboBox.getWidth() + 3, 30, 140, 35);
        add(industriesComboBox);

        tagField = new JTextField("Write some tag...");
        tagField.setBounds(285, 30, 140, 35);
        add(tagField);
    }

    private void createButtonsGUI() {
        updateButton = new JButton("Reload");
        updateButton.setBounds(430, 30, 75, 35);
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String location = (String) locationComboBox.getSelectedItem();
                String industries = (String) industriesComboBox.getSelectedItem();
                String tag = tagField.getText();

                frame.dataProvider.fetchJobs(location, industries, tag);
                frame.dataProvider.loadJobsTableData();
            }
        });
        add(updateButton);

        JButton viewButton = new JButton("View");
        viewButton.setBounds(510, 30, 70, 35);
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jobsTable.getSelectedRow() == -1) {
                    Popup.showErrorPopup("You must select a job!");
                    return;
                }
                Job job = frame.dataProvider.getJobByIndex(jobsTable.getSelectedRow());
                frame.coordinator.moveToDetails(job);
            }
        });
        add(viewButton);
    }
}
