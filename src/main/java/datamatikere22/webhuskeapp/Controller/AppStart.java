package datamatikere22.webhuskeapp.Controller;


import datamatikere22.webhuskeapp.Controller.Entitet.Person;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.*;

public class AppStart implements ServletContextListener {

    public static Map<String, Person> personMap;



    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //ServletContextListener.super.contextInitialized(sce);

        try {

            List<Person> personList = new ArrayList<>();

            Person person0 = new Person("Nik", "1234", "bamse, den største kamphund, iskrystaller, dagens avis");
            Person person1 = new Person("Kat", "2222", "en kat ved navn Heidi, øl, iskrystaller, håndbog for amatør spåkoner");
            Person person2 = new Person("Jay", "3333", "vanilieis, en hest der hedder Marcus, pizza");
            Person person3 = new Person("Maria", "4444", "grill, telt, sovepose");

            personList.add(person0);
            personList.add(person1);
            personList.add(person2);
            personList.add(person3);

            personMap = new TreeMap<>();


            for (Person element : personList) {
                personMap.put(element.getNavn(), element);
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static Map<String, Person> getPersonMap() {
        return personMap;
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
