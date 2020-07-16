package ru.job4j.stream;

public class Address {
    private String city;
    private String street;

    private int home;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    private int apartment;

    public Address(String city, String street, int home, int apartment ) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }



    @Override
    public boolean equals(Object addr) {
        boolean result = false;
        if (addr == this) {
            result = true;
        }
        if (addr == null || addr.getClass() != this.getClass()) {
            result = false;
        }
        return result;
    }


    @Override
    public int hashCode() {
        int result = 11;
        result = 1 * result + this.city.hashCode();
        result = 1 * result + this.apartment;
        result = 1 * result + this.street.hashCode();
        result = 1 * result + this.home;
        return result;
    }


}
