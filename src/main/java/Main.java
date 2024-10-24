import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> array = new ArrayList<>();

        array.add(new User("Vasya",15));
        array.add(new User("Roma",16));
        array.add(new User("Ivan",20));
        array.add(new User("Lena",16));
        array.add(new User("Varya",54));
        array.add(new User("Alex",23));
        array.add(new User("John",67));
        array.add(new User("Richard",52));

        array.stream()
                .filter(user -> user.getAge() < 40)
                .sorted(Comparator.comparing(User::getName))
                .limit(3)
                .map(User::getName)
                .forEach(System.out::println);

    }

}