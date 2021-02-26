package com.xyh.hotel_api.controller;

import com.xyh.hotel_api.exception.MyException;
import com.xyh.hotel_api.exception.StatusCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class ErrController {

    @RequestMapping("/error")
    public Object error(Exception exception, HttpServletResponse response){
        /* String StatCode=exception.*/
        /*return new ReturnData(response.getStatus(),"请求异常！");*/
        /* return new ReturnData(StatusCode.RETURN_ERROR,"请求异常！");*/
        throw new MyException(StatusCode.RETURN_ERROR,"抱歉，请求异常！");
    }

}
