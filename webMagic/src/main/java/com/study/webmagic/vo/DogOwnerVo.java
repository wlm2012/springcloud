package com.study.webmagic.vo;

import com.study.webmagic.domain.entity.DogEntity;
import com.study.webmagic.domain.entity.DogOwnerEntity;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class DogOwnerVo {

    private String id;

    private int age;

    private String name;

    private List<String> dogNames;

    public static DogOwnerVo from(DogOwnerEntity dogOwnerEntity) {
        DogOwnerVo dogOwnerVo = new DogOwnerVo();
        dogOwnerVo.setId(dogOwnerEntity.getId());
        dogOwnerVo.setAge(dogOwnerEntity.getAge());
        dogOwnerVo.setName(dogOwnerEntity.getName());
        dogOwnerVo.setDogNames(dogOwnerEntity.getDogEntityList().stream().map(DogEntity::getName).collect(Collectors.toList()));
        return dogOwnerVo;

    }
}
