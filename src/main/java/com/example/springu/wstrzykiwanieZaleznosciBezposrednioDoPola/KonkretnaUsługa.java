package com.example.springu.wstrzykiwanieZaleznosciBezposrednioDoPola;

import org.springframework.stereotype.Component;

@Component // służy jak component do tworzenia projektu // do wstrzykiwania zależnosci
public class KonkretnaUsługa implements Usługa {
    public void wykonaj() {
        System.out.println("Wykonanie Konkretnej Usługi");
    }
}
