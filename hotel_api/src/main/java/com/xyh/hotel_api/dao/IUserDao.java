package com.xyh.hotel_api.dao;

import java.util.List;
import java.util.Map;

public interface IUserDao {
    public List<Map<String,Object>> selectUserByWhere(Map<String, Object> map);
    public int insertUserOne(Map<String, Object> map);
    public int uploadUserByPhone(Map<String, Object> map);
}
