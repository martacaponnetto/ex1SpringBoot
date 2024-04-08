package com.example.exN1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*Scrivi una applicazione web Spring Boot che alla endpoint
GET v1/ciao?nome=Giuseppe&provincia=Lombardia risponde
con "Ciao Giuseppe, com'è il tempo in Lombardia?"*/
@RestController
@RequestMapping(path= "/v1")
public class FirstController {
    @RequestMapping(path= "/ciao", method = RequestMethod.GET)
    public String ciao(@RequestParam (name = "nome") String nome, @RequestParam (name= "regione")String regione){
        return "ciao" + nome + "," + "com'è il tempo in " + regione;
    }
}
