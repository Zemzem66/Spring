package at.fhtw.bif.paperless;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaperlessApplication {
    // Weil eine abhaningketi zu A besteht muss man es mit Autowired annotieren
    @Autowired
    private ComponentA componentA;
    public static void main(String[] args) {
        SpringApplication.run(PaperlessApplication.class, args);
    }

    //wird auto aufgerufen
    @PostConstruct
    void startup()
    {

        componentA.demo();
    }


}
