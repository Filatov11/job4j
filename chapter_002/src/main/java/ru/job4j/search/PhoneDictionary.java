package ru.job4j.search;
import  java.util.ArrayList;
import java.util.function.Predicate;


public class PhoneDictionary {
private ArrayList<Person> persons = new ArrayList<Person>();
public void  add(Person person) {
    this.persons.add(person);
  }
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<Person>();
        Predicate<Person> predicateName = t -> t.getName().contains(key);
        Predicate<Person> predicateSurname = t -> t.getSurname().contains(key);
        Predicate<Person> predicateAddress = t -> t.getAddress().contains(key);
        Predicate<Person> predicatePhone = t -> t.getPhone().contains(key);
        Predicate<Person> combine =
                predicateName.or(predicateName.or(predicateSurname.or(predicateAddress.or(predicatePhone))));
      //  result =

    //    Predicate<Person> combine =  t -> t.getName().contains(key) ||
       //             t.getSurname().contains(key) || t.getAddress().contains(key)
       //            || t.getPhone().contains(key);
   //     ArrayList<Person> result = new ArrayList<Person>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
        }


 //   public ArrayList<Person> find(String key) {
   //     ArrayList<Person> result = new ArrayList<Person>();
  //      for (Person i: persons) {
  ///          if  ((i.getSurname().contains(key)) || (i.getName().contains(key))
  //                  || (i.getPhone().contains(key)) ||  (i.getAddress().contains(key))) {
    //            result.add(i);
   //         }
   //     }
//        return result;
 //   }





    }


