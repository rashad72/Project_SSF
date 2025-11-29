package com.example.simulation_ssf.User;

import com.example.simulation_ssf.nonUser.*;

import java.time.LocalDate;


public class CommunicationOfficer extends Employee{

    private MessageManager messageManager;
    private MissionManager missionManager;
    private NotificationManager notificationManager;

    public CommunicationOfficer(long nID, long phoneNo, String name, String mailAddress, long employeeId,
                                LocalDate joinDate, Address presentAddress, MessageManager messageManager,
                                MissionManager missionManager, NotificationManager notificationManager) {
        super(nID, phoneNo, name, mailAddress, employeeId, joinDate, presentAddress);
        this.messageManager = messageManager;
        this.missionManager = missionManager;
        this.notificationManager = notificationManager;
    }
}
