package Models;

import java.util.ArrayList;

public class APIResponse {
    private String apiVersion;
    private String documentationUrl;
    private String friendlyNotice;
    private int jobCount;
    private String xRayHash;
    private String clientKey;
    private String lastUpdate;
    private ArrayList<Job> jobs;
    private boolean success;
    private String error;

    public APIResponse() {}

    public APIResponse(String apiVersion, String documentationUrl, String friendlyNotice, int jobCount, String xRayHash, String clientKey, String lastUpdate, ArrayList<Job> jobs, boolean success, String error) {
        this.apiVersion = apiVersion;
        this.documentationUrl = documentationUrl;
        this.friendlyNotice = friendlyNotice;
        this.jobCount = jobCount;
        this.xRayHash = xRayHash;
        this.clientKey = clientKey;
        this.lastUpdate = lastUpdate;
        this.jobs = jobs;
        this.success = success;
        this.error = error;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getDocumentationUrl() {
        return documentationUrl;
    }

    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    public String getFriendlyNotice() {
        return friendlyNotice;
    }

    public void setFriendlyNotice(String friendlyNotice) {
        this.friendlyNotice = friendlyNotice;
    }

    public int getJobCount() {
        return jobCount;
    }

    public void setJobCount(int jobCount) {
        this.jobCount = jobCount;
    }

    public String getxRayHash() {
        return xRayHash;
    }

    public void setxRayHash(String xRayHash) {
        this.xRayHash = xRayHash;
    }

    public String getClientKey() {
        return clientKey;
    }

    public void setClientKey(String clientKey) {
        this.clientKey = clientKey;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
