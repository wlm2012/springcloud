package com.study.app.controller;

import com.study.app.client.DogClient;
import com.study.app.vo.DogOwnerVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class DogController {

    private final DogClient dogClient;

    @GetMapping("queryDogOwner")
    public DogOwnerVo queryDogOwner(String id) {
        log.info("dogClient====================");
        return dogClient.queryDogOwner(id);
    }


}
