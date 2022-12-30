package com.study.webmagic.domain.entity;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_dog_owner")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Access(AccessType.FIELD)
public class DogOwnerEntity {

    @Id
    @GeneratedValue(generator = "snowflakeId")
    @GenericGenerator(name = "snowflakeId", strategy = "com.study.webmagic.config.SnowIdGeneratorConfig")
    private String id;


    private int age;

    private String name;

    @OneToMany(mappedBy = "dogOwnerEntity", cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, orphanRemoval = true)
    @ToString.Exclude
    private List<DogEntity> dogEntityList = new ArrayList<>();

}
