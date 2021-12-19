package fr.lernejo.travelsite;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Controleur_travel {

    private final ArrayList<Travels> list = new ArrayList<>();
    private final ArrayList<Inscription> list2 = new ArrayList<>();
   Catalog_country catalog_country=new Catalog_country();

    @GetMapping("/api/travels")
    public ArrayList<Travels> getList() {
        list.add(new Travels("Caribbean", 32.4));
        list.add(new Travels("Australia", 35.1));
        //list.add(new Travels("France", 32.4));
        //list.add(new Travels("Spain", 35.1));
        return list;
    }

    @PostMapping("api/inscription")
    public void add(@RequestBody Inscription myinscription) {
        this.list2.add(myinscription);



    }


    @GetMapping("/api/inscription")
    public ArrayList<Inscription> getList2() {
        return list2;
    }



}


