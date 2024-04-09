package Models;

import java.util.ArrayList;

public class Job {
    private int id;
    private String url;
    private String jobSlug;
    private String jobTitle;
    private String companyName;
    private String companyLogo;
    private ArrayList<String> jobIndustry;
    private ArrayList<String> jobType;
    private String jobGeo;
    private String jobLevel;
    private String jobExcerpt;
    private String jobDescription;
    private String pubDate;
    private String annualSalaryMin;
    private String annualSalaryMax;
    private String salaryCurrency;

    public Job(int id, String url, String jobSlug, String jobTitle, String companyName, String companyLogo, ArrayList<String> jobIndustry, ArrayList<String> jobType, String jobGeo, String jobLevel, String jobExcerpt, String jobDescription, String pubDate, String annualSalaryMin, String annualSalaryMax, String salaryCurrency) {
        this.id = id;
        this.url = url;
        this.jobSlug = jobSlug;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.companyLogo = companyLogo;
        this.jobIndustry = jobIndustry;
        this.jobType = jobType;
        this.jobGeo = jobGeo;
        this.jobLevel = jobLevel;
        this.jobExcerpt = jobExcerpt;
        this.jobDescription = jobDescription;
        this.pubDate = pubDate;
        this.annualSalaryMin = annualSalaryMin;
        this.annualSalaryMax = annualSalaryMax;
        this.salaryCurrency = salaryCurrency;
    }

    public Job() {}

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getJobSlug() {
        return jobSlug;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public ArrayList<String> getJobIndustry() {
        return jobIndustry;
    }

    public ArrayList<String> getJobType() {
        return jobType;
    }

    public String getJobGeo() {
        return jobGeo;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public String getJobExcerpt() {
        return jobExcerpt;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getAnnualSalaryMin() {
        return annualSalaryMin;
    }

    public String getAnnualSalaryMax() {
        return annualSalaryMax;
    }

    public String getSalaryCurrency() {
        return salaryCurrency;
    }

    public String toString() {
        return "Company: " + this.companyName + ", Position: " + this.jobTitle;
    }
}