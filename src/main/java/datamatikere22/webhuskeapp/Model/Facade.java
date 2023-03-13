package datamatikere22.webhuskeapp.Model;

import datamatikere22.webhuskeapp.Controller.Entitet.Person;

import java.util.Map;

public class Facade {

    public static Map<String, Person> getAllPerson() {
        return PersonMapper.getAllPerson();
    }

}
