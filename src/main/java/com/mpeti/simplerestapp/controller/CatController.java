package com.mpeti.simplerestapp.controller;

import com.mpeti.simplerestapp.domain.AdvancedCat;
import com.mpeti.simplerestapp.domain.Cat;
import com.mpeti.simplerestapp.domain.CatToy;
import com.mpeti.simplerestapp.domain.CatToyType;
import com.mpeti.simplerestapp.service.CatService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CatController {
    private CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    /**
     * Get the list of {@Link Cat} objects.
     *
     * @return the list
     */
    @RequestMapping("/cat")
    public List<Cat> getCats(){
        return catService.getCats();
    }

    /**
     * Get one {@Link Cat} by id.
     *
     * @param id the id of the cat
     * @return the Cat instance
     */
    @RequestMapping("/cat/{id}")
    public Cat getCat(@PathVariable("id") Integer id){
        return catService.getCat(id);
    }

    @RequestMapping("/advancedcat")
    public AdvancedCat getAdvancedCat(){
        String name = "Mirci";
        CatToy simpleToy = new CatToy("red", new ArrayList<CatToyType>(Arrays.asList(CatToyType.CHEAP, CatToyType.SIMPLE)));
        CatToy normalToy = new CatToy("blue", new ArrayList<CatToyType>(Arrays.asList(CatToyType.NORMAL, CatToyType.EXPENSIVE)));

        AdvancedCat advancedCat = AdvancedCat.builder()
                .name(name)
                .toys(new ArrayList(Arrays.asList(simpleToy, normalToy)))
                .build();

        return advancedCat;
    }
}
