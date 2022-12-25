package com.galina.address;

public class PostalAddress implements Address {
    private final Integer code;
    private final String country;
    private final String city;
    private final String streetAddress;

    public PostalAddress(Integer code, String country, String city, String streetAddress) {
        this.code = code;
        this.country = country;
        this.city = city;
        this.streetAddress = streetAddress;
    }

    @Override
    public String getFullAddress() {
        return null;
    }

    @Override
    public String toString() {
        return "Class: " + this.getClass().getSimpleName() + " code: " + code + " country: " + country
                + " city: " + city + " streetAddress: " + streetAddress;
    }
}
