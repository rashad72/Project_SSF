package com.example.simulation_ssf.User;

import java.time.LocalDate;

public class OperationCommander extends Employee {
    public OperationCommander(long nID, long phoneNo, String name, String mailAddress, long employeeId, LocalDate joinDate, String presentAddress) {
        super(nID, phoneNo, name, mailAddress, employeeId, joinDate, presentAddress);
    }

    @Override
    public String toString() {
        return "OperationCommander{" +
                "employeeId=" + employeeId +
                ", joinDate=" + joinDate +
                ", presentAddress='" + presentAddress + '\'' +
                ", nID=" + nID +
                ", phoneNo=" + phoneNo +
                ", name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }
}
