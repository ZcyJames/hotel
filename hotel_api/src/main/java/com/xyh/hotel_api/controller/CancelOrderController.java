package com.xyh.hotel_api.controller;

import com.xyh.hotel_api.exception.StatusCode;
import com.xyh.hotel_api.service.IOrderListService;
import com.xyh.hotel_api.util.ReturnData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/")
public class CancelOrderController {
    @Resource
    IOrderListService orderListService;
    @RequestMapping("/cancelOrder")
    public Object cancelOrder(@RequestParam Map<String,String> map){
        System.out.println("删除订单：" + map.get("orderId"));
        int i = orderListService.cancelOrder(map.get("orderId"));
        System.out.println(i);
        if (i == 1){
            return new ReturnData(StatusCode.REQUEST_SUCCESS,true,"取消订单成功");
        }else {
            return new ReturnData(StatusCode.RETURN_ERROR,false,"取消失败");
        }
    }
}
