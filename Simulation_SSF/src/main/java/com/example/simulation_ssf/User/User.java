package com.example.simulation_ssf.User;

import java.io.Serializable;

public abstract class User implements Serializable {
    final protected long nID;
    protected long phoneNo;
    protected String name, mailAddress;

    public User(long nID, long phoneNo, String name, String mailAddress) {
        this.nID = nID;
        this.phoneNo = phoneNo;
        this.name = name;
        this.mailAddress = mailAddress;
    }

    public long getnID() {
        return nID;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getName() {
        return name;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    @Override
    public String toString() {
        return "User{" +
                "nID=" + nID +
                ", phoneNo=" + phoneNo +
                ", name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }
    final public boolean verifyLogin(String userType, String employeeId ,String password){



        return true;

    }



}


