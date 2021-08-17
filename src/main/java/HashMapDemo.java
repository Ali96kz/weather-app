import threads.Person;

import java.util.HashMap;
import java.util.Map;


public class HashMapDemo {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(1);
        Person person3 = new Person(1);

        Map<Person, String> map = new HashMap<>();
        map.put(person1, "1");
        map.put(person2, "2");
        map.put(person3, "3");

        String x = map.get(new Person(1));
        System.out.println(x);
    }
}
