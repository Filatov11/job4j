package ru.job4j.poly;

public interface Transport {
    void drive();
    void loadingPassengers(int passengers);
    void unloadingPassengers(int passengers);
    double refuel(double volume);
}

