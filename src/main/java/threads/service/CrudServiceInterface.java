package threads.service;

import threads.Person;

public interface CrudServiceInterface <T extends Person> {

    T create(T entity);
    T delete(T entity);
    T update(T entity);

}
