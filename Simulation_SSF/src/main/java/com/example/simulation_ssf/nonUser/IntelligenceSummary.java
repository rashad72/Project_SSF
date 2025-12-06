package com.example.simulation_ssf.nonUser;

import java.time.LocalDate;

public class IntelligenceSummary {
    private String caseID;
    private String caseTitle;
    private String reportedBy;
    private LocalDate reportedDate;
    private String threatType;
    private String region;
    private String priority;
    private String analysis;
    private String recommendation;
    private String riskLevel;

    public IntelligenceSummary(String caseID, String caseTitle, String reportedBy, LocalDate reportedDate, String threatType, String region, String priority, String analysis, String recommendation, String riskLevel) {
        this.caseID = caseID;
        this.caseTitle = caseTitle;
        this.reportedBy = reportedBy;
        this.reportedDate = reportedDate;
        this.threatType = threatType;
        this.region = region;
        this.priority = priority;
        this.analysis = analysis;
        this.recommendation = recommendation;
        this.riskLevel = riskLevel;
    }

    public String getCaseID() {
        return caseID;
    }

    public void setCaseID(String caseID) {
        this.caseID = caseID;
    }

    public String getCaseTitle() {
        return caseTitle;
    }

    public void setCaseTitle(String caseTitle) {
        this.caseTitle = caseTitle;
    }

    public String getReportedBy() {
        return reportedBy;
    }

    public void setReportedBy(String reportedBy) {
        this.reportedBy = reportedBy;
    }

    public LocalDate getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(LocalDate reportedDate) {
        this.reportedDate = reportedDate;
    }

    public String getThreatType() {
        return threatType;
    }

    public void setThreatType(String threatType) {
        this.threatType = threatType;
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

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    @Override
    public String toString() {
        return "IntelligenceSummary{" +
                "caseID='" + caseID + '\'' +
                ", caseTitle='" + caseTitle + '\'' +
                ", reportedBy='" + reportedBy + '\'' +
                ", reportedDate=" + reportedDate +
                ", threatType='" + threatType + '\'' +
                ", region='" + region + '\'' +
                ", priority='" + priority + '\'' +
                ", analysis='" + analysis + '\'' +
                ", recommendation='" + recommendation + '\'' +
                ", riskLevel='" + riskLevel + '\'' +
                '}';
    }
}
