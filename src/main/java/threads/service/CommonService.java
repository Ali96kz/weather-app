package threads.service;

import threads.Person;

public class CommonService<T extends Person> implements CrudServiceInterface<T>{

    @Override
    public T create(T entity) {
        return null;
    }

    @Override
    public T delete(T entity) {
        return null;
    }

    @Override
    public T update(T entity) {
        return null;
    }
}
