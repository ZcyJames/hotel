package com.xyh.hotel_api.dao;

import java.util.Map;

public interface IOrderDao {
    public int addOrderOne(Map<String, Object> map);
    public Map<String,Object> getOrderById(Map<String,Object> map);
    public int changeInfo(Map<String,Object> map);
    public int changeStatus(Map<String,Object> map);
}
