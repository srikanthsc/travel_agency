package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Calendar;
import java.util.Date;

@RestController
public class PingController {
    private static final String DATE_FORMAT_DATEONLY = null;
    private final ArrayList<Country> listcountry = new ArrayList<>();
    private final ArrayList<Temp_Date> td = new ArrayList<>();
    private final ArrayList<global> gb = new ArrayList<>();




    @GetMapping(path = "/api/ping")

   // private Date getMeYesterday(){
      //  return new Date(System.currentTimeMillis()-24*60*60*1000);
    //}
    String ping() {

        return "OK";


    }

    @GetMapping("/api/temperature")
    public global getListcountry() {
        gettd();
        getTd1();
        global gb= new global("france",td);
        return gb;


    }


    public void gettd() {
        LocalDate localDate = LocalDate.now();
        TemperatureService ts= new TemperatureService();
        td.add(new Temp_Date(localDate, ts.getTemperature("france")));

    }

    public void getTd1() {
        LocalDate today = LocalDate.now();
        //LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = today.minusDays(1);
        TemperatureService ts1= new TemperatureService();
        td.add(new Temp_Date(yesterday,ts1.getTemperature("france")));

    }
}
