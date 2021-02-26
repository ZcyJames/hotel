package com.xyh.hotel_api.dao;

import java.util.List;
import java.util.Map;

public interface IOrderListDao {
    public List<Map<String,Object>> getOrderList(Map<String, Object> map);
    public int cancelOrder(String s);
}
