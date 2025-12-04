package com.example.simulation_ssf.User;

import com.example.simulation_ssf.nonUser.*;

import java.time.LocalDate;


public class CommunicationOfficer extends Employee{

    public CommunicationOfficer(long nID, long phoneNo, String name, String mailAddress, long employeeId, LocalDate joinDate, String presentAddress) {
        super(nID, phoneNo, name, mailAddress, employeeId, joinDate, presentAddress);
    }
}
