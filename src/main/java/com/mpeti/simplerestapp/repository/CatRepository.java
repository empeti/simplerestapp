package com.mpeti.simplerestapp.repository;

import com.mpeti.simplerestapp.domain.Cat;
import com.mpeti.simplerestapp.domain.CatRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CatRepository {
    private List<Cat> cats = new ArrayList<>();

    public Cat getCat(Integer id) {
        return getCatById(id);
    }

    private Cat getCatById(Integer id) {
        for (Cat cat : cats){
            if (cat.getId().equals(id)){
                return cat;
            }
        }
        return null;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void saveCat(CatRequest catRequest) {
        Cat cat = new Cat(cats.size()+1, catRequest.getAge(), catRequest.getName());
        cats.add(cat);
    }
}
