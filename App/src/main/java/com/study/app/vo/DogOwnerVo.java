package com.study.app.vo;


import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class DogOwnerVo {

    private String id;

    private int age;

    private String name;

    private List<String> dogNames;

}
