package threads.service;

import threads.Person;

public class AgregatedPersonServiceImpl implements PersonService{

    private CommonService<Person> personCommonService;

    @Override
    public Person create(Person entity) {
        return personCommonService.create(entity);
    }

    @Override
    public Person delete(Person entity) {
        return null;
    }

    @Override
    public Person update(Person entity) {
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        return null;
    }
}
