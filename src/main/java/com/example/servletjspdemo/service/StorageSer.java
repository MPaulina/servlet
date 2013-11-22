package com.example.servletjspdemo.service;
 
import java.util.ArrayList;
import java.util.List;
import com.example.servletjspdemo.web.Alcohol;
 
public class StorageSer {
 
    private List<Alcohol> db = new ArrayList<Alcohol>();
 
    public void add(Alcohol alko) {
        Alcohol newAlko = new Alcohol(alko.getMarka(), alko.getTyp(), alko.getRodzaj(), alko.getPojemnosc(), alko.getInfo());
        db.add(newAlko);
    }
 
    public List<Alcohol> getAllAlcohols() {
        return db;
    }
}