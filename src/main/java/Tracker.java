package ru.job.condition;

import ru.job4j.condition.Driver;

public class Tracker {
 public static void main (String[] args)   {
     ru.job4j.condition.Driver steve = new Driver();
      System.out.println("Steve want the tracker job");
      if (!steve.hasLicense()) {
          System.out.println("Steve need to get a license");
          steve.passExamOn('A');
      }  else if (steve.candrive('B')) {
          System.out.println("Steve works on taxi.");
      } else {
          System.out.println("Steve doesnt have a job, but ride on motorbike!");
      }
 }
}
