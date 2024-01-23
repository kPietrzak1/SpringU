package com.example.springu.WstrzykiwaniePrzezSetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KlientService {
    private WiadomoscService wiadomoscService;

    // Setter dla wstrzykiwania zależności
    @Autowired
    public void setWiadomoscService(WiadomoscService wiadomoscService) {
        this.wiadomoscService = wiadomoscService;
    }

    public void wyswietlWiadomosc() {
        System.out.println(wiadomoscService.pobierzWiadomosc());
    }
}
