package datamatikere22.webhuskeapp.Model;

import datamatikere22.webhuskeapp.Controller.AppStart;
import datamatikere22.webhuskeapp.Controller.Entitet.Person;

import java.util.Map;

public class PersonMapper {



    protected static  Map<String, Person> getAllPerson(){
        return AppStart.getPersonMap();
    }

}
