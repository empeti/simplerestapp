package com.mpeti.simplerestapp;

import com.mpeti.simplerestapp.domain.CatRequest;
import com.mpeti.simplerestapp.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimplerestappApplication {
    @Autowired
    private CatService catService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SimplerestappApplication.class, args);
        SimplerestappApplication app = context.getBean(SimplerestappApplication.class);
        app.saveCats();
    }

    private void saveCats() {
        CatRequest cat1 = new CatRequest("Daisy", 2);
        CatRequest cat2 = new CatRequest("Whitey", 3);
        CatRequest cat3 = new CatRequest("Mickey", 4);
        CatRequest cat4 = new CatRequest("Mirrmurr", 5);
        CatRequest cat5 = new CatRequest("Cili", 6);
        CatRequest cat6 = new CatRequest("Tom", 7);
        CatRequest cat7 = new CatRequest("Larkin", 8);
        CatRequest cat8 = new CatRequest("Frank", 9);
        CatRequest cat9 = new CatRequest("Milan", 1);

        catService.saveCat(cat1);
        catService.saveCat(cat2);
        catService.saveCat(cat3);
        catService.saveCat(cat4);
        catService.saveCat(cat5);
        catService.saveCat(cat6);
        catService.saveCat(cat7);
        catService.saveCat(cat8);
        catService.saveCat(cat9);
    }
}
