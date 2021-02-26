package com.xyh.hotel_api.service;


import java.util.List;
import java.util.Map;

public interface IOrderListService {
    public List<Map<String, Object>> getOrderList(Map<String, Object> map);
    public int cancelOrder(String s);
}
