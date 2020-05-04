package ru.job4j.collection;

import java.util.Objects;
public class User implements Comparable<User> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(User o) {
        int result = this.getName().compareTo(o.getName());
        if (result == 0) { return Integer.compare(age, o.age);}
        else { return  result;}
    //    if (!(this.name.equals(o.name))) {
      //      return Integer.compare(age, o.age); }
   //     else return  0;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return  false;
        User user = (User)o ;
        return  age == user.age && Objects.equals(name, user.name);
    }
    @Override
    public  int hashCode() {
        return  Objects.hash(name,age);
    }

}