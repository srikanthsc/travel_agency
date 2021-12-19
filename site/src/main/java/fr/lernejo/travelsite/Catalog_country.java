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
        listcountry1.add(new Travels("Bahrain", 35.1));
        listcountry1.add(new Travels("Bangladesh", 35.1));
        listcountry1.add(new Travels("Barbados", 35.1));
        listcountry1.add(new Travels("Belarus", 35.1));
       /* listcountry1.add(new Travels("Belgium", 35.1));
        listcountry1.add(new Travels("Belize", 35.1));
        listcountry1.add(new Travels("Benin", 35.1));
        listcountry1.add(new Travels("Bhutan", 35.1));
        listcountry1.add(new Travels("Bolivia", 35.1));
        listcountry1.add(new Travels("Bosnia", 35.1));
        listcountry1.add(new Travels("Botswana", 35.1));
        listcountry1.add(new Travels("Brazil", 35.1));
        listcountry1.add(new Travels("Brunei", 35.1));
        listcountry1.add(new Travels("Bulgaria", 35.1));
        listcountry1.add(new Travels("Burkina Faso", 35.1));
        listcountry1.add(new Travels("Burundi", 35.1));
        listcountry1.add(new Travels("Cabo Verde", 35.1));
        listcountry1.add(new Travels("Cambodia", 35.1));
        listcountry1.add(new Travels("Cameroon", 35.1));
        listcountry1.add(new Travels("Canada", 35.1));
        listcountry1.add(new Travels("Central African Republic", 35.1));
        listcountry1.add(new Travels("Chad", 35.1));
        listcountry1.add(new Travels("Chile", 35.1));
        listcountry1.add(new Travels("China", 35.1));
        listcountry1.add(new Travels("Colombia", 35.1));
        listcountry1.add(new Travels("Comoros", 35.1));
        listcountry1.add(new Travels("Congo", 35.1));
        listcountry1.add(new Travels("Costa Rica", 35.1));
        listcountry1.add(new Travels("Côte d’Ivoire", 35.1));
        listcountry1.add(new Travels("Croatia", 35.1));
        listcountry1.add(new Travels("Cuba", 35.1));
        listcountry1.add(new Travels("Cyprus", 35.1));
        listcountry1.add(new Travels("Czech Republic", 35.1));
        listcountry1.add(new Travels("Denmark", 35.1));
        listcountry1.add(new Travels("Djibouti", 35.1));
        listcountry1.add(new Travels("Dominica", 35.1));
        listcountry1.add(new Travels("Dominican Republic", 35.1));
        listcountry1.add(new Travels("East Timor", 35.1));*/

        return listcountry1;
    }
}
