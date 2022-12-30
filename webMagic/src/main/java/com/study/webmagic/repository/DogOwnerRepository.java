package com.study.webmagic.repository;

import com.study.webmagic.domain.entity.DogOwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogOwnerRepository extends JpaRepository<DogOwnerEntity,String> {
}