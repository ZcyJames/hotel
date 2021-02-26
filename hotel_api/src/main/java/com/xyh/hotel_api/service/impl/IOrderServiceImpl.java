package com.xyh.hotel_api.service.impl;

import com.xyh.hotel_api.dao.IOrderDao;
import com.xyh.hotel_api.service.IOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class IOrderServiceImpl implements IOrderService {

    @Resource
   private IOrderDao dao;
    @Override
    public int addOrderOne(Map<String, Object> map) {
        return dao.addOrderOne(map);
    }

    @Override
    public Map<String, Object> getOrderById(Map<String, Object> map) {
        return dao.getOrderById(map);
    }

    @Override
    public int changeInfo(Map<String, Object> map) {
        return dao.changeInfo(map);
    }

    @Override
    public int changeStatus(Map<String, Object> map) {
        return dao.changeStatus(map);
    }
}
