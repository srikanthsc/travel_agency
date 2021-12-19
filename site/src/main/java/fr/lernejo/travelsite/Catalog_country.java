package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
@RestController
public class Catalog_country {
    private final ArrayList<Travels> listcountry1 = new ArrayList<>();
    @GetMapping("api/testing")
    public ArrayList<Travels> getListcatalog() {

        listcountry1.add(new Travels("Australia", 35.1));
        listcountry1.add(new Travels("Afghanistan", 35.1));
        listcountry1.add(new Travels("Algeria", 35.1));
        listcountry1.add(new Travels("Albania", 35.1));
        listcountry1.add(new Travels("Andorra", 35.1));
        listcountry1.add(new Travels("Antigua", 35.1));
        listcountry1.add(new Travels("Argentina", 35.1));
        listcountry1.add(new Travels("Armenia", 35.1));
        listcountry1.add(new Travels("Austria", 35.1));
        listcountry1.add(new Travels("Azerbaijan", 35.1));
        listcountry1.add(new Travels("The Bahamas", 35.1));
        

        //System.out.println(++listcountry1);
        return listcountry1;
    }
}
