package com.example.simulation_ssf.User;

import java.io.Serializable;
import java.time.LocalDate;

public class EquipmentManager extends Employee implements Serializable {
    public EquipmentManager(long nID, long phoneNo, String name, String mailAddress, long employeeId, LocalDate joinDate, String presentAddress) {
        super(nID, phoneNo, name, mailAddress, employeeId, joinDate, presentAddress);
    }
}
