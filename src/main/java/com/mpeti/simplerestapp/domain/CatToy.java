package com.mpeti.simplerestapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CatToy {
    private String color;
    private List<CatToyType> catToyTypeList;
}
