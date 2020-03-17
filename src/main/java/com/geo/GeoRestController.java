package com.geo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GeoRestController {

    @RequestMapping(method = RequestMethod.GET)
    public String getMap(Model model){
        List<Points> pointsList = new ArrayList<>();
        pointsList.add(new Points(50.058902, 19.938812,"Małopolskie " + "Zakażeń: 4 Zgonów: 0")); // kraków
        pointsList.add(new Points(50.255986, 19.022827,"Śląskie " + " Zakażeń: 21 Zgonów: 0")); // katowice
        pointsList.add(new Points(50.035974, 22.005615,"Podkarpackie " + " Zakażeń: 11 Zgonów: 1")); //rzeszow
        pointsList.add(new Points(50.868378, 20.633698,"Świętokrzyskie " + " Zakażeń: 3 Zgonów: 0")); //kielce
        pointsList.add(new Points(51.244725, 22.570038,"Lubelskie " + "Zakażeń: 21 Zgonów: 1")); //lubin
        pointsList.add(new Points(51.801822, 19.456787,"Łódzkie " + " Zakażeń: 31 Zgonów: 0")); //lódz
        pointsList.add(new Points(51.117317, 17.039795,"Dolnośląskie " + "Zakażeń: 27 Zgonów: 2")); //wroclaw
        pointsList.add(new Points(51.937492, 15.501709,"Lubuskie " + " Zakażeń: 2 Zgonów: 0")); //zielona g
        pointsList.add(new Points(53.417717, 14.543152,"Zachodniopomorskie " + " Zakażeń: 7 Zgonów: 0")); //szcecin
        pointsList.add(new Points(52.409121, 16.929932,"Wielkopolskie " + " Zakażeń: 11 Zgonów: 1")); //poznan
        pointsList.add(new Points(53.140181, 17.990112,"Kujawsko-pomorskie " + " Zakażeń: 7 Zgonów: 0")); //Bydgoszcz
        pointsList.add(new Points(54.346151, 18.646545,"Pomorskie " + " Zakażeń: 8 Zgonów: 0")); //gdansk
        pointsList.add(new Points(52.224435, 21.011353,"Mazowieckie " + " Zakażeń: 38 Zgonów: 0")); //warszawa
        pointsList.add(new Points(53.768196, 20.478516,"Warmińsko-mazurskie " + "Zakażeń: 7 Zgonów: 0")); //olsztyn
        pointsList.add(new Points(53.130294, 23.153687,"Podlaskie " + " Zakażeń: 0 Zgonów: 0")); //bialystok
        pointsList.add(new Points(50.66252, 17.925568,"Opolskie " + " Zakażeń: 7 Zgonów: 0")); //opole
        model.addAttribute("pointsList", pointsList);
        return "map";
    }
}
