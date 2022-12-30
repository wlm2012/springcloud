package com.study.app.client;

import com.study.app.vo.DogOwnerVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "webMagic/webMagic")
public interface DogClient {

    @GetMapping(value = "queryDogOwner")
    DogOwnerVo queryDogOwner(@RequestParam String id);
}
