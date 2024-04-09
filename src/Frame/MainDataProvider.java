package Frame;

import Helpers.Database;
import Helpers.Popup;
import Models.APIResponse;
import Models.Job;
import Models.User;
import Services.APIService;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class MainDataProvider {
    private DefaultTableModel jobsTableModel;
    private ArrayList<User> users;
    private ArrayList<Job> jobs = new ArrayList<>();

    public MainDataProvider() { users = Database.fetchUsers(); }

    public void setJobsTableModel(DefaultTableModel jobsTableModel) {

        this.jobsTableModel = jobsTableModel;
    }

    public void fetchJobs(String location, String industry, String tag) {
        try {
            APIResponse response = APIService.fetchJobs(location, industry, tag);
            jobs = new ArrayList<>(response.getJobs());
            loadJobsTableData();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            jobs = new ArrayList<>();
            loadJobsTableData();
            Popup.showErrorPopup("Invalid tag! PLease enter a valid tag.");
        }
    }

    public boolean loginUser(String username, String password) {
        for(User user : users) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public void loadJobsTableData() {
        jobsTableModel.setRowCount(0);

        for(Job job : jobs) {
            addJobRow(job);
        }
    }

    public void searchJob(String searchedTerm) {
        jobsTableModel.setRowCount(0);

        for(Job job : jobs) {
            if(job.getJobTitle().toLowerCase().contains(searchedTerm.toLowerCase())) {
                addJobRow(job);
            }
        }

    }

    private void addJobRow(Job job) {
        String[] row = new String[3];
        row[0] = job.getCompanyName();
        row[1] = job.getJobTitle();
        row[2] = job.getJobGeo();
        jobsTableModel.addRow(row);
    }

    public Job getJobByIndex(int index) {
        return jobs.get(index);
    }
}
