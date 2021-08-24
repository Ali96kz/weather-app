package threads.service;

import threads.Person;

import java.io.Closeable;

public abstract class AbstractService<T extends Person> implements CrudServiceInterface<T>, AutoCloseable {
    //private DaoFactory daoFactory;

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

    @Override
    public void close() throws Exception {
        //daoFactory.close();
    }
}
