package com.study.webmagic.controller;

import com.study.webmagic.domain.entity.DogOwnerEntity;
import com.study.webmagic.exception.ServiceException;
import com.study.webmagic.repository.DogOwnerRepository;
import com.study.webmagic.vo.DogOwnerVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class FeignController {

    private final DogOwnerRepository dogOwnerRepository;

    @GetMapping("queryDogOwner")
    public DogOwnerVo queryDogOwner(String id) {
        DogOwnerEntity dogOwnerEntity = dogOwnerRepository.findById(id)
                .orElseThrow(() -> new ServiceException("该主人不存在"));

        log.info("FeignController==============");
        return DogOwnerVo.from(dogOwnerEntity);

    }

}
