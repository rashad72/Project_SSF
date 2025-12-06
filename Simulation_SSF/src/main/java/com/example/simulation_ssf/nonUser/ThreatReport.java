package com.example.simulation_ssf.nonUser;

import java.time.LocalDate;

public class ThreatReport {

    private int reportID;
    private String region;
    private String priority;
    private String threatType;
    private String source;
    private String summary;
    private LocalDate reportDate;

    public ThreatReport(int reportID, String region, String priority, String threatType, String source, String summary, LocalDate reportDate) {
        this.reportID = reportID;
        this.region = region;
        this.priority = priority;
        this.threatType = threatType;
        this.source = source;
        this.summary = summary;
        this.reportDate = reportDate;
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getThreatType() {
        return threatType;
    }

    public void setThreatType(String threatType) {
        this.threatType = threatType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return "ThreatReport{" +
                "reportID=" + reportID +
                ", region='" + region + '\'' +
                ", priority='" + priority + '\'' +
                ", threatType='" + threatType + '\'' +
                ", source='" + source + '\'' +
                ", summary='" + summary + '\'' +
                ", reportDate=" + reportDate +
                '}';
    }
}

