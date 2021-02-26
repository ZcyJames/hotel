package com.xyh.hotel_api.service;

import java.util.Map;

public interface IOrderService {
    public int addOrderOne(Map<String, Object> map);
    public Map<String,Object> getOrderById(Map<String,Object> map);
    public int changeInfo(Map<String,Object> map);
    public int changeStatus(Map<String,Object> map);
}
