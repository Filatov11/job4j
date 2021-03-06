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


        sortCity(clientProfile).stream()
                .forEach(c -> System.out.println(c.getCity()));
    }


    public static List <Address> sortCity(List<Profile> client) {
        List<Address> retval = client.stream().map(n -> n.getAddress()).sorted((o1, o2) -> o1.getCity().compareTo(o2.getCity()))
              .distinct().collect(Collectors.toList());
        return retval;
    }


    class CityComparator implements Comparator<Address> {
        public int compare(Address a, Address b){
            return a.getCity().compareTo(b.getCity());
        }
    }
}
