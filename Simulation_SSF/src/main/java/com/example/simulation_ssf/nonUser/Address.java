package com.example.simulation_ssf.nonUser;

public class Address {
    private String district, thana, area, street,postalCode;


    public Address(String district, String thana, String area, String street, String postalCode) {
        this.district = district;
        this.thana = thana;
        this.area = area;
        this.street = street;
        this.postalCode = postalCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getThana() {
        return thana;
    }

    public void setThana(String thana) {
        this.thana = thana;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "district='" + district + '\'' +
                ", thana='" + thana + '\'' +
                ", area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
