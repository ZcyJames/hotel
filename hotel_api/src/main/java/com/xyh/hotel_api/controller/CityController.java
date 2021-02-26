package com.xyh.hotel_api.controller;

import com.github.pagehelper.PageInfo;
import com.xyh.hotel_api.dao.ICityDao;
import com.xyh.hotel_api.exception.StatusCode;
import com.xyh.hotel_api.service.ICityService;
import com.xyh.hotel_api.util.ReturnData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class CityController {

    @Resource
    private ICityService service;

    @RequestMapping(value = "/getCity", method = RequestMethod.POST)
    public Object getCityByName(@RequestParam Map<String, Object> map){
        System.out.println(map);
        System.out.println(map);

        Map map1 = service.selectCityByName(map);
        if(map1.containsKey("CITY_NAME")){
            return new ReturnData(StatusCode.REQUEST_SUCCESS, map1, "查询城市数据成功");
        }else{
            return new ReturnData(StatusCode.DATA_NULL, false, "暂无城市数据");
        }
    }

    @RequestMapping("/getRooms")
    public Object getRoomsByWhere(@RequestParam Map<String, Object> map){
        System.out.println(map);
        System.out.println(map);
        List<Map<String, Object>> list = service.getRoomsByWhere(map);
        if(list.size() > 0){
            return new ReturnData(StatusCode.REQUEST_SUCCESS, list,"数据交互成功");
        }else{
            return new ReturnData(StatusCode.DATA_NULL, false, "数据交互失败");
        }
    }

    @RequestMapping("/getSpecialRooms")
    public Object getSpecialRooms(@RequestParam Map<String, Object> map){
        System.out.println("===============>" + map);
        System.out.println("===============>" + map);
        List<Map<String, Object>> list = service.getSpecialRooms(map);
        if(list.size() > 0){
            return new ReturnData(StatusCode.REQUEST_SUCCESS, list,"住宿类型数据查询成功");
        }else{
            return new ReturnData(StatusCode.DATA_NULL, false, "住宿类型数据查询失败");
        }

    }

    //得到三亚的酒店信息
    @RequestMapping("/getCityHouse")
    public Object getHaiLanHouse(@RequestParam Map<String, Object> map){
        System.out.println("城市为：" + map);
        System.out.println("城市为：" + map);
        /*注意  2个分页的必要参数   page limit*/
        List<Map<String, Object>> houseList = service.selectCityHouseByName(map);
        PageInfo<Map<String,Object>> pageInfo=new PageInfo<Map<String,Object>>(houseList);
        map.put("houseList",houseList);
        /*第三个参数  为查询list的聚合最大值*/
        map.put("total",pageInfo.getTotal());
            return new ReturnData(StatusCode.REQUEST_SUCCESS, map,"城市酒店信息查询成功！");

    }

    //三亚酒店页面特定搜索
    @RequestMapping("/getSanyaHouseByWhere")
    public Object getSanyaHouseByWhere(@RequestParam Map<String, Object> map){
        System.out.println("三亚" + map);
        System.out.println("三亚" + map);
        List<Map<String, Object>> houseArray = service.getSanyaHouseByWhere(map);
        PageInfo<Map<String,Object>> pageInfo=new PageInfo<Map<String,Object>>(houseArray);
        map.put("houseArray",houseArray);
        /*第三个参数  为查询list的聚合最大值*/
        map.put("total",pageInfo.getTotal());
        return new ReturnData(StatusCode.REQUEST_SUCCESS, map,"城市酒店信息查询成功！");

    }
    @RequestMapping("/getRoomById")
    public Object getRoomById(@RequestParam Map<String, Object> map){
        System.out.println("房间信息ID为：" + map);
        System.out.println("房间信息ID为：" + map);
        Map<String, Object> houseMap = service.getRoomById(map);
        if(houseMap.containsKey("HOUSE_NAME")){
            return new ReturnData(StatusCode.REQUEST_SUCCESS,houseMap,"房间信息查询成功");
        }else{
            return new ReturnData(StatusCode.DATA_NULL, false, "房间信息查询失败");
        }

    }




}
