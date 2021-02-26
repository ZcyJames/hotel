package com.xyh.hotel_api.controller;

import com.xyh.hotel_api.exception.StatusCode;
import com.xyh.hotel_api.service.IOrderListService;
import com.xyh.hotel_api.util.ReturnData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class OrderListController {
    @Resource
    IOrderListService orderListService;

    @RequestMapping(value = "/getOrderList")
    public Object getOrderList(@RequestParam Map<String,Object> map){
        System.out.println("=============>" + map);
        System.out.println("=============>" + map);

        List<Map<String, Object>> orderList = orderListService.getOrderList(map);
        System.out.println(orderList);

        if (orderList.size()>0){
            return new ReturnData(StatusCode.REQUEST_SUCCESS,orderList,"交互成功");
        }else {
            return new ReturnData(StatusCode.DATA_NULL,-1,"查询错误或者不存在订单");
        }
    }


}
