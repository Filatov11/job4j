package ru.job4j.pojo;

import java.util.Date;

public final class Police {
    private Police() {
        //not called
    }
    /**
     * @param args q
     */
    public static void main(final String[] args) {
        License license = new License();
        license.setOwner("Petr Arsentev");
        license.setModel("Toyota");
        license.setCode("xx111x");
        license.setCreated(new Date());
        System.out.println(license.getOwner() + " has a car - "
                + license.getModel() + " : " + license.getCode());
    }
}
