package threads.service;

import threads.Person;

public interface PersonService extends CrudServiceInterface<Person> {

    Person findByEmail(String email);
}
