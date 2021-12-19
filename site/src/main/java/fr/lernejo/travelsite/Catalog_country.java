package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
@RestController
public class Catalog_country {
    private final ArrayList<Travels> listcountry1 = new ArrayList<>();
    private final ArrayList<Travels> listcountry2 = new ArrayList<>();
    private final ArrayList<Travels> listcountry3 = new ArrayList<>();
    @GetMapping("api/testing")
    public ArrayList<Travels> getListcatalog() {
        listcountry1.add(new Travels("Australia", 35.1));
        listcountry1.add(new Travels("Afghanistan", 35.1));
        listcountry1.add(new Travels("Algeria", 35.1));
        listcountry1.add(new Travels("Albania", 35.1));
        listcountry1.add(new Travels("Andorra", 35.1));
        listcountry1.add(new Travels("Antigua", 35.1));
        return listcountry1;
    }

    @GetMapping("api/testing1")
    public ArrayList<Travels> getListcountry2(){
        listcountry2.add(new Travels("Argentina", 35.1));
        listcountry2.add(new Travels("Armenia", 35.1));
        listcountry2.add(new Travels("Azerbaijan", 35.1));
        listcountry2.add(new Travels("The Bahamas", 35.1));
        listcountry2.add(new Travels("Bahrain", 35.1));
        listcountry2.add(new Travels("Bangladesh", 35.1));
        return listcountry2;
    }

    @GetMapping("api/testing2")
    public ArrayList<Travels> getListcountry3(){
        listcountry3.add(new Travels("Barbados", 35.1));
        listcountry3.add(new Travels("Belarus", 35.1));
        listcountry3.add(new Travels("Belgium", 35.1));
        listcountry3.add(new Travels("Belize", 35.1));
        listcountry3.add(new Travels("Benin", 35.1));
        listcountry3.add(new Travels("Bhutan", 35.1));
        return listcountry3;
    }
}
