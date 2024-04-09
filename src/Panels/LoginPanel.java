package Panels;

import Frame.MainFrame;
import Helpers.Popup;

import javax.swing.*;

public class LoginPanel extends BasePanel {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginPanel(MainFrame frame) {
        super(frame);

        JLabel label = new JLabel("Advance Job Finder");
        int centerX = (frame.getWidth() /2) - 75;
        int centerY = (frame.getHeight() /2) - 75;
        label.setBounds(centerX, centerY, 150, 50);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);

        usernameField = new JTextField("Pikkolo");
        usernameField.setBounds((frame.getWidth() /2) - 100, label.getY() + 40, 200, 30);
        add(usernameField);

        passwordField = new JPasswordField("111");
        passwordField.setBounds((frame.getWidth() /2) - 100, usernameField.getY() + 45, 200, 30);
        add(passwordField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(centerX, passwordField.getY() + 40, 150, 40);
        loginButton.addActionListener(e -> loginAction());
        add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(centerX, loginButton.getY() + 50, 150, 40);
        registerButton.addActionListener(e -> frame.coordinator.moveToRegister());
        add(registerButton);
    }

    public void loginAction() {
        boolean isLogged = frame.dataProvider.loginUser(usernameField.getText(), passwordField.getText());
        if(isLogged) {
            frame.coordinator.moveToHome();
        } else {
            Popup.showErrorPopup("Wrong username or Password");
        }
    }
}
