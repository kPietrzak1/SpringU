package com.example.springu.wstrzykiwanieZaleznosciBezposrednioDoPola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Klient {

    @Autowired // jest to mechanizm wstrzykiwania zależności
    private Usługa usługa;

    public void potrzebujeUsługi() {
        usługa.wykonaj();
    }
}
