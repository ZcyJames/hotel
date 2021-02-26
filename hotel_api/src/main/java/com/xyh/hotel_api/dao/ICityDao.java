package com.xyh.hotel_api.dao;

import java.util.List;
import java.util.Map;

public interface ICityDao {
    public Map<String, Object> selectCityByName(Map<String, Object> map);

    public List<Map<String, Object>> getRoomsByWhere(Map<String, Object> map);
    public List<Map<String, Object>>  getSpecialRooms(Map<String, Object> map);
    public Map<String, Object> getRoomById(Map<String, Object> map);

    public List<Map<String, Object>> selectCityHouseByName(Map<String, Object> map);

    public List<Map<String, Object>> getSanyaHouseByWhere(Map<String, Object> map);

}
