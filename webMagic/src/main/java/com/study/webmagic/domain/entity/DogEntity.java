package com.study.webmagic.domain.entity;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.*;

@Entity
@Table(name = "t_dog")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DogEntity {
    @Id
    @GeneratedValue(generator = "snowflakeId")
    @GenericGenerator(name = "snowflakeId", strategy = "com.study.webmagic.config.SnowIdGeneratorConfig")
    private String id;

    private long num;
    private int age;
    private String name;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "dog_owner_id")
    private DogOwnerEntity dogOwnerEntity;


}
