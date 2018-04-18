package com.mpeti.simplerestapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CatRequest {
    private String name;
    private Integer age;
}
