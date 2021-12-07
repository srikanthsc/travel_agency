package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PingController {
    private final ArrayList<Country> listcountry = new ArrayList<>();
    private final ArrayList<Temperature_date> td = new ArrayList<>();

    @GetMapping(path = "/api/ping")
    String ping() {

        return "OK";


    }

    @GetMapping("/api/temperature")
    public ArrayList<Country> getListcountry() {
        listcountry.add(new Country("Caribbean", 2021 - 12 - 04, 12));
        listcountry.add(new Country("Australia", 2021 - 12 - 0, 13));
        return listcountry;


    }
}
