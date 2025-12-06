package com.example.simulation_ssf.User;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Employee extends User implements Serializable {
    final protected long employeeId;
    final protected LocalDate joinDate;
    protected String presentAddress;

    public Employee(long nID, long phoneNo, String name, String mailAddress, long employeeId, LocalDate joinDate, String presentAddress) {
        super(nID, phoneNo, name, mailAddress);
        this.employeeId = employeeId;
        this.joinDate = joinDate;
        this.presentAddress = presentAddress;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }
}
