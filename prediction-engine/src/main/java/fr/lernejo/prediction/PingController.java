package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
public class PingController  {
  //  private final String DATE_FORMAT_DATEONLY = null;
    //private final ArrayList<Country> listcountry = new ArrayList<>();
    //private final ArrayList<temperatures> td = new ArrayList<>();
    //private final ArrayList<global> gb = new ArrayList<>();



    //public void information() {
      //  System.out.println("Serveur travel");
        //System.out.println("information in real time date and temperature");
    //}
    @GetMapping(path = "/api/ping")

   // private Date getMeYesterday(){
      //  return new Date(System.currentTimeMillis()-24*60*60*1000);
    //}
    String ping() {

        return "OK";


    }

    //@GetMapping("/api/temperature")
    //public global getListcountry() {
      //  PingController pingController=new PingController();
       // pingController.information();
        //gettd();
        //getTd1();
        //global gb= new global("France",td);
        //return gb;


    //}


    //public void gettd() {
      //  LocalDate localDate = LocalDate.now();
       // TemperatureService ts= new TemperatureService();
       // td.add(new temperatures(localDate, ts.getTemperature("France")));

    //}

    //public void getTd1() {
      //  LocalDate today = LocalDate.now();
        //LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        //LocalDate yesterday = today.minusDays(1);
        //TemperatureService ts1= new TemperatureService();
        //td.add(new temperatures(yesterday,ts1.getTemperature("France")));

    //}
}
