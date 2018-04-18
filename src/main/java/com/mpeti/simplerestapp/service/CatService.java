package com.mpeti.simplerestapp.service;

import com.mpeti.simplerestapp.domain.Cat;
import com.mpeti.simplerestapp.domain.CatRequest;
import com.mpeti.simplerestapp.repository.CatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatService {
    private CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public List<Cat> getCats(){
        return catRepository.getCats();
    }
;
    public Cat getCat(Integer id){
        return catRepository.getCat(id);
    }

    public void saveCat(CatRequest cat){
        catRepository.saveCat(cat);
    }
}
