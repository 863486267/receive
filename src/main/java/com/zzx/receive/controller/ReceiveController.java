package com.zzx.receive.controller;

import com.zzx.receive.entity.ReceiveEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mr.John on 2019/3/9 11:30.
 **/

@RestController
@Slf4j
public class ReceiveController {

    @PostMapping(value = "/receive", produces = "application/json;charset=utf-8")
    public void revesive(ReceiveEntity entity){
       log.info(entity.getName());
       log.info(entity.getSex());
       log.info(String.valueOf(entity.getAge()));
    }

}
