package threads.service;

import threads.Person;

public class PersonServiceImpl extends AbstractService<Person> implements PersonService {

    @Override
    public Person findByEmail(String email) {
        return null;
    }

    @Override
    public void close() throws Exception {
        super.close();
        //personDao.close();
    }
}
