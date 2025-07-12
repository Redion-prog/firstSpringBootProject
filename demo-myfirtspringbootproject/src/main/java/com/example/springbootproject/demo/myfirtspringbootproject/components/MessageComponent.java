package com.example.springbootproject.demo.myfirtspringbootproject.components;

import org.springframework.stereotype.Component;

//kjo klase  eshte   nje  komponent qe duhet  ta  mnaxhojme   vet
//dhe  ta  krijosh automatikisht kur  nis  aplikacioni
//nuk eshte  nevoja  te  krijojme  vete  objektin me  new
//Spring krijon nje objekt nga  kjo klase
//mund ta  perdorim kete  objekt kudo tjeter  ne aplikacion me annotation  @Autowired

@Component
public class MessageComponent {
    public String  getMessage(){
        return "Hello world !";
    }
}
