package com.mpeti.simplerestapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cat {
    private Integer id;
    private Integer age;
    private String name;
}
