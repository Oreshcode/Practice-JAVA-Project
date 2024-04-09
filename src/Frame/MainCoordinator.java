package Frame;

import Models.Job;
import Panels.DetailsPanel;
import Panels.HomePanel;
import Panels.LoginPanel;
import Panels.RegistrationPanel;

public class MainCoordinator {
    private MainFrame frame;

    public MainCoordinator(MainFrame frame) {
        this.frame = frame;
    }

    public void moveToLogin() {
        LoginPanel loginPanel = new LoginPanel(frame);
        frame.setContentPane(loginPanel);
        frame.validate();
    }

    public void moveToRegister() {
        RegistrationPanel registrationPanel = new RegistrationPanel(frame);
        frame.setContentPane(registrationPanel);
        frame.validate();
    }

    public void moveToHome() {
        HomePanel homePanel = new HomePanel(frame);
        frame.setContentPane(homePanel);
        frame.validate();
    }

    public void moveToDetails(Job job) {
        DetailsPanel detailsPanel = new DetailsPanel(frame, job);
        frame.setContentPane(detailsPanel);
        frame.validate();
    }
}
