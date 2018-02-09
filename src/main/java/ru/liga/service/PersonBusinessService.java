package ru.liga.service;

import ru.liga.contract.PersonDao;
import ru.liga.dao.PersonDaoImpl;
import ru.liga.domain.Person;

import java.util.List;

public class PersonBusinessService {

    private PersonDao personDao;

    public PersonBusinessService() {
        this.personDao = new PersonDaoImpl();
    }

    public void multiplyRate(Double multiplier) {
        List<Person> all = personDao.findAll();
        all.stream().forEach(person ->
                person.setRate(person.getRate() * multiplier)
        );
        personDao.save(all);
    }

    public void printAll() {
        personDao.findAll().stream().forEach(person ->
                System.out.println(person)
        );
    }
}
