package com.mpeti.simplerestapp.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AdvancedCat {
    private String name;
    private List<CatToy> toys;

}
