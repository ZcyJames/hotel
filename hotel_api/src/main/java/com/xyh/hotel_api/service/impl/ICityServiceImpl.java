package com.xyh.hotel_api.service.impl;

import com.github.pagehelper.PageHelper;
import com.xyh.hotel_api.dao.ICityDao;
import com.xyh.hotel_api.service.ICityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ICityServiceImpl implements ICityService {
    @Resource
    private ICityDao dao;

    @Override
    public Map<String, Object> selectCityByName(Map<String, Object> map) {
        return dao.selectCityByName(map);
    }

    @Override
    public List<Map<String, Object>> getRoomsByWhere(Map<String, Object> map) {
        return dao.getRoomsByWhere(map);
    }

    @Override
    public List<Map<String, Object>> getSpecialRooms(Map<String, Object> map) {
        return dao.getSpecialRooms(map);
    }

    @Override
    public Map<String, Object> getRoomById(Map<String, Object> map) {
        return dao.getRoomById(map);
    }

    @Override
    public List<Map<String, Object>> selectCityHouseByName(Map<String, Object> map) {
        /*在Service的Impl之中  进行后端 持久层  插件执行调用*/
        //map.put("pageNum","1");
        PageHelper.startPage(Integer.parseInt(map.get("pageNum")+""),
                Integer.parseInt(map.get("limit")+""));
        return dao.selectCityHouseByName(map);
    }

    @Override
    public List<Map<String, Object>> getSanyaHouseByWhere(Map<String, Object> map) {
        PageHelper.startPage(Integer.parseInt(map.get("pageNum")+""),
                Integer.parseInt(map.get("limit")+""));
        return dao.getSanyaHouseByWhere(map);
    }
}
