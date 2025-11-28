package com.example.simulation_ssf.User;

import com.example.simulation_ssf.nonUser.Address;

import java.time.LocalDate;

public abstract class Employee extends User{
    final protected long employeeId;
    final protected LocalDate joinDate;
    protected Address presentAddress;

    public Employee(long nID, long phoneNo, String name, String mailAddress, long employeeId, LocalDate joinDate, Address presentAddress) {
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

    public Address getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(Address presentAddress) {
        this.presentAddress = presentAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", joinDate=" + joinDate +
                ", presentAddress=" + presentAddress +
                ", nID=" + nID +
                ", phoneNo=" + phoneNo +
                ", name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }
}
