package com.example.simulation_ssf.nonUser;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Team implements Serializable {
    private final int teamId;
    private  String teamName;
    private long captainId;                     //captain's employeeId
    private ArrayList<Long> memberIds;               //operative's employeeId list and employee status will change
    private LocalDate validUntil;
    private boolean inMission = false;
    private String teamStatus;
}
