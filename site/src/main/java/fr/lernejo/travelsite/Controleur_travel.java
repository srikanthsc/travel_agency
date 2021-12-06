package fr.lernejo.travelsite;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Controleur_travel {

    private final ArrayList<Inscription> List = new ArrayList<>();

    @PostMapping("/api/inscription")
    public void Inscription(Inscription inscription) {
        this.List.add(inscription);
    }
    @GetMapping("/api/inscription")
    public ArrayList<Inscription> getList() {
        return List;
    }


}
