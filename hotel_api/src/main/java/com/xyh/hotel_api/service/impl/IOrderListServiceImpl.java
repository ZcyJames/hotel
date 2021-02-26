package com.xyh.hotel_api.service.impl;

import com.xyh.hotel_api.dao.IOrderListDao;
import com.xyh.hotel_api.service.IOrderListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class IOrderListServiceImpl implements IOrderListService {

    @Resource
    IOrderListDao orderListDaoDao;
    @Override
    public List<Map<String, Object>> getOrderList(Map<String, Object> map) {
        return orderListDaoDao.getOrderList(map);
    }

    @Override
    public int cancelOrder(String s) {
        return orderListDaoDao.cancelOrder(s);
    }
}
