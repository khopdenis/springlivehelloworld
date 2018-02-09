package ru.liga.contract;

import ru.liga.domain.Person;

import java.util.List;

public interface PersonDao {

    public List<Person> findAll();

    public void save(List<Person> persons);

}
