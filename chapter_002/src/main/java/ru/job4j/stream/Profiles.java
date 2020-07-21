package ru.job4j.stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Profiles {
    public static void main(String args[]) {
        Profile profile = new Profile(new Address("Petrozavodsk", "Vesennaya", 11, 125), "Afonya");

        List<Profile> clientProfile = new ArrayList<Profile>
                (Arrays.asList(
                        (new Profile(new Address("Petrozavodsk", "Vesennaya", 11, 127), "Afonya")),
                        (new Profile(new Address("Omsk", "Mira", 17, 125), "Michail")),
                        (new Profile(new Address("Rybinsk", "Pushkina", 12, 75), "Anton")),
                        (new Profile(new Address("Smolensk", "Stroiteley", 22, 44), "Mark")),
                        (new Profile(new Address("Kaluga", "Vostochnaya", 10, 68), "Pavel")),
                        (new Profile(new Address("Kaluga", "Vostochnaya", 10, 68), "Billy")),
                        (new Profile(new Address("Penza", "Severnaya", 8, 35), "Igor"))
                ));

        sortCity(clientProfile);
    }

    public static void sortCity(List<Profile> clientProf) {


        Profile.collect(clientProf).stream().sorted(Comparator.comparing(Address::getCity))
                .map(Address::getCity).distinct().forEach(System.out::println);

    }

}
