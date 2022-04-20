import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Person> persons = new ArrayList<>();

    public static void main(String[] args) {
        persons.add(new Person("12345", "John"));
        persons.add(new Person("12346", "Jane"));
        persons.add(new Person("12347", "Jack"));
        persons.add(new Person("12348", "Jill"));
        persons.add(new Person("12349", "Joe"));

        Server server = new Server();
    }
}