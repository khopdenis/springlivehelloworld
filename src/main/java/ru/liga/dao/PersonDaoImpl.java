package ru.liga.dao;

import ru.liga.contract.PersonDao;
import ru.liga.domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    private List<Person> mockedData = Arrays.asList(new Person(1L, "Mike", 100.), new Person(2L, "Tom", 100.));

    @Override
    public List<Person> findAll() {
        // mocked for demo
        return new ArrayList<>(mockedData);
    }

    @Override
    public void save(List<Person> persons) {
        mockedData = persons;
    }


}
