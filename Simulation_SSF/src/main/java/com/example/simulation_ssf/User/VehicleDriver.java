package com.example.simulation_ssf.User;

import java.io.Serializable;
import java.time.LocalDate;

public class VehicleDriver extends Employee implements Serializable {
    public VehicleDriver(long nID, long phoneNo, String name, String mailAddress, long employeeId, LocalDate joinDate, String presentAddress) {
        super(nID, phoneNo, name, mailAddress, employeeId, joinDate, presentAddress);
    }

    @Override
    public String toString() {
        return "VehicleDriver{" +
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
