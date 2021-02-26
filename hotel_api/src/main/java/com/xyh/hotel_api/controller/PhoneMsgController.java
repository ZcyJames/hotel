package com.xyh.hotel_api.controller;

import com.xyh.hotel_api.service.PhoneMsgService;
import com.xyh.hotel_api.util.ReturnData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController  //异步控制
@RequestMapping("/")
public class PhoneMsgController {
    @Resource
    private PhoneMsgService phoneMsgService;

    @RequestMapping("/phoneMsg")
    public Object phoneMsg(@RequestParam String phoneNumbers) {
        return new ReturnData(phoneMsgService.getCode(phoneNumbers));
    }
}
