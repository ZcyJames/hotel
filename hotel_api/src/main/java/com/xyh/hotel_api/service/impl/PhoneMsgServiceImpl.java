package com.xyh.hotel_api.service.impl;

import com.xyh.hotel_api.service.PhoneMsgService;
import com.xyh.hotel_api.util.SendSms;
import org.springframework.stereotype.Service;

@Service
public class PhoneMsgServiceImpl implements PhoneMsgService {
    @Override
    public String getCode(String phoneNumbers) {
        String code="";  //这里填写code随机数，
        int i = 1;
        while(i <= 6) {
            int n = (int) (Math.random() * 10);
            code += n;
            i++;
        }
        String res= SendSms.sendMeg(phoneNumbers,code);
        return res;
    }
}
