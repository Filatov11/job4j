package ru.job4j.stream;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;


public class Profile {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    private String clientName;
 public  Profile ( Address address ,String clientName ) {
     this.address = address;
     this.clientName = clientName;
 }

    public static   List<Address> collect(List<Profile> profiles) {
        List<Address> result = profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
        return result;
    }
}
