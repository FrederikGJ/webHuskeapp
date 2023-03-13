package datamatikere22.webhuskeapp.Controller.Entitet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {

    List<String> stringList;

    String navn;
    String kode;

    public Person(String navn, String kode, String s) {
        this.navn = navn;
        this.kode = kode;

        String [] strings = s.split(",");
        this.stringList = new ArrayList<>(Arrays.asList(strings));
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
}
