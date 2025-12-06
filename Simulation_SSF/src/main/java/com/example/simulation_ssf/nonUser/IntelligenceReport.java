package com.example.simulation_ssf.nonUser;

import java.io.Serializable;

public class IntelligenceReport implements Serializable {
    private String threatType;
    private String suspectInfo;
    private String severityLevel;
    private String location;
    private String threatDescription;

    public IntelligenceReport(String threatType, String suspectInfo, String severityLevel, String location, String threatDescription) {
        this.threatType = threatType;
        this.suspectInfo = suspectInfo;
        this.severityLevel = severityLevel;
        this.location = location;
        this.threatDescription = threatDescription;
    }

    public String getThreatType() {
        return threatType;
    }

    public void setThreatType(String threatType) {
        this.threatType = threatType;
    }

    public String getSuspectInfo() {
        return suspectInfo;
    }

    public void setSuspectInfo(String suspectInfo) {
        this.suspectInfo = suspectInfo;
    }

    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getThreatDescription() {
        return threatDescription;
    }

    public void setThreatDescription(String threatDescription) {
        this.threatDescription = threatDescription;
    }

    @Override
    public String toString() {
        return "IntelligenceReport{" +
                "threatType='" + threatType + '\'' +
                ", suspectInfo='" + suspectInfo + '\'' +
                ", severityLevel='" + severityLevel + '\'' +
                ", location='" + location + '\'' +
                ", threatDescription='" + threatDescription + '\'' +
                '}';
    }
}
