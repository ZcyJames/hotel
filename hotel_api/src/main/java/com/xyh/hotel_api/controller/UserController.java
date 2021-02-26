package com.xyh.hotel_api.controller;

import com.xyh.hotel_api.exception.StatusCode;
import com.xyh.hotel_api.service.IUserService;
import com.xyh.hotel_api.util.ReturnData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController  //异步控制
@RequestMapping("/")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/test")
    public Object test(@RequestParam Map<String, Object> map){
        System.out.println(map);
        System.out.println(map);

        return new ReturnData(StatusCode.REQUEST_SUCCESS, map, "后端交互正常！");
    }

    @RequestMapping(value = "/loginServlet",method = RequestMethod.POST)
    public Object loginServlet(@RequestParam Map<String, Object> map){
        List<Map<String,Object>> list=userService.selectUserByWhere(map);
        if (list.size()>0){
            return new ReturnData(StatusCode.REQUEST_SUCCESS, list, "后端交互正常！");
        }else {
            return new ReturnData(StatusCode.USER_NOT_EXIST,map,"数据交互异常");
        }

    }
    @RequestMapping(value = "/registerServlet",method = RequestMethod.POST)
    public Object registerServlet(@RequestParam Map<String, Object> map){
        int i=userService.insertUserOne(map);
        if (i>0){
            return new ReturnData(StatusCode.REQUEST_SUCCESS, map, "后端交互正常！");
        }else {
            return new ReturnData(StatusCode.RETURN_ERROR,map,"数据交互异常");
        }

    }

    @RequestMapping(value = "/upDatePsd",method = RequestMethod.POST)
    public Object upDatePsd(@RequestParam Map<String, Object> map){
        int i=userService.uploadUserByPhone(map);
        System.out.println(map);
        if (i>0){
            return new ReturnData(StatusCode.REQUEST_SUCCESS,map, "后端交互正常！");
        }else {
            return new ReturnData(StatusCode.RETURN_ERROR,map,"数据交互异常");
        }

    }

}
