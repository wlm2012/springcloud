package com.study.webmagic.repository;


import com.study.webmagic.domain.entity.DogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends JpaRepository<DogEntity,String> {
}
