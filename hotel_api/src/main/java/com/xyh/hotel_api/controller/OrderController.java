package com.xyh.hotel_api.controller;

import com.xyh.hotel_api.exception.StatusCode;
import com.xyh.hotel_api.service.ICityService;
import com.xyh.hotel_api.service.IOrderService;
import com.xyh.hotel_api.util.ReturnData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class OrderController {

    @Resource
    private IOrderService service;

    @Resource
    private ICityService cityService;

    @RequestMapping("/toOrder")
    public Object toOrder(@RequestParam Map<String, Object> map){
        System.out.println("前端传递的信息为：" + map);
        System.out.println("前端传递的信息为：" + map);
        System.out.println("前端传递的信息为：" + map);

        if(service.addOrderOne(map) > 0){
            return new ReturnData(StatusCode.REQUEST_SUCCESS, true, "数据插入成功");
        }else{
            return new ReturnData(StatusCode.DATA_NULL,false,"查询数据失败");
        }
    }

    @RequestMapping("/detail")
    public Object orderDetail(@RequestParam Map<String,Object> map){
        System.out.println(map);
        Map<String, Object> orderById = service.getOrderById(map);
        System.out.println("结果："+orderById);

        Map<String,Object> map1 = new HashMap<>();
        Object house_id = orderById.get("HOUSE_ID");
        map1.put("houseId",house_id);
        Map<String, Object> roomById = cityService.getRoomById(map1);
        orderById.put("HOUSE_NAME",roomById.get("HOUSE_NAME"));
        orderById.put("HOUSE_CITY",roomById.get("HOUSE_CITY"));

        return new ReturnData(StatusCode.REQUEST_SUCCESS,orderById,"成功");
    }

    @RequestMapping("/changeInfo")
    public Object changeInfo(@RequestParam Map<String,Object> map){
        System.out.println("修改信息:"+map);
        int i = service.changeInfo(map);
        if (i == 1){
            return new ReturnData(StatusCode.REQUEST_SUCCESS,1, "成功");
        }else {
            return new ReturnData(StatusCode.RETURN_ERROR,0,"失败");
        }
    }

    @RequestMapping("/changeStatusWhat")
    public Object changeStatus(@RequestParam Map<String,Object> map){
        System.out.println("支付订单："+map);
        int i = service.changeStatus(map);
        if (i == 1){
            return new ReturnData(StatusCode.REQUEST_SUCCESS,1,"成功");
        }else{
            return new ReturnData(StatusCode.RETURN_ERROR,0,"失败");
        }
    }
}
