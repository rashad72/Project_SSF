package com.example.simulation_ssf.User;

import com.example.simulation_ssf.nonUser.Address;

import java.time.LocalDate;

public class OperationCommander extends Employee {
    public OperationCommander(long nID, long phoneNo, String name, String mailAddress, long employeeId, LocalDate joinDate, Address presentAddress) {
        super(nID, phoneNo, name, mailAddress, employeeId, joinDate, presentAddress);
    }
}
