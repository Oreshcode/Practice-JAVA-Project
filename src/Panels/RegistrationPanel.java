package Panels;

import Frame.MainFrame;
import Helpers.Validations;

import javax.swing.*;

public class RegistrationPanel extends BasePanel {
    private JTextField usernameField;
    private JTextField passwordField;
    private JTextField repeatPasswordField;



    public RegistrationPanel(MainFrame frame) {
        super(frame);
        createTextFieldsGUI();
        createButtonsGUI();
    }


    public void createButtonsGUI() {
        JButton backButton = new JButton("<");
        backButton.setBounds(10, 10, 50, 40);
        backButton.addActionListener(e -> frame.coordinator.moveToLogin());
        add(backButton);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(frame.getWidth() / 2 - 60, frame.getHeight() / 2 + 125, 120, 40);
        registerButton.addActionListener(e -> registerAction());
        add(registerButton);
    }

    public void createTextFieldsGUI() {
        usernameField = new JTextField("Enter username");
        usernameField.setBounds(frame.getWidth() / 2 - 60, frame.getHeight() / 2 - 20, 120, 40);
        add(usernameField);
        passwordField = new JTextField("Password");
        passwordField.setBounds(frame.getWidth() / 2 - 60, frame.getHeight() / 2 + 30, 120, 40);
        add(passwordField);
        repeatPasswordField = new JTextField("Repeat Password");
        repeatPasswordField.setBounds(frame.getWidth() / 2 - 60, frame.getHeight() / 2 + 80, 120, 40);
        add(repeatPasswordField);
    }

    private void registerAction() {
        boolean isValidUsername = Validations.isValidUsername(usernameField.getText());
        boolean isValidPassword = Validations.isValidPassword(passwordField.getText(), repeatPasswordField.getText());

        if(isValidUsername && isValidPassword){
            // Create new user add it to arraylist
            frame.coordinator.moveToHome();
        }
    }
}
