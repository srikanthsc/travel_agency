package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
public class PingController {
    private final String DATE_FORMAT_DATEONLY = null;
    private final ArrayList<Country> listcountry = new ArrayList<>();
    private final ArrayList<Temperature> td = new ArrayList<>();
    private final ArrayList<global> gb = new ArrayList<>();




    @GetMapping(path = "/api/ping")

   // private Date getMeYesterday(){
      //  return new Date(System.currentTimeMillis()-24*60*60*1000);
    //}
    String ping() {

        return "OK";


    }

    @GetMapping("/api/temperatures")
    public global getListcountry() {
        gettd();
        getTd1();
        global gb= new global("france",td);
        return gb;


    }


    public void gettd() {
        LocalDate localDate = LocalDate.now();
        TemperatureService ts= new TemperatureService();
        td.add(new Temperature(localDate, ts.getTemperature("france")));

    }

    public void getTd1() {
        LocalDate today = LocalDate.now();
        //LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = today.minusDays(1);
        TemperatureService ts1= new TemperatureService();
        td.add(new Temperature(yesterday,ts1.getTemperature("france")));

    }
}
