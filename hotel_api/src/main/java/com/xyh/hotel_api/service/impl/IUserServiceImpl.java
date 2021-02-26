package com.xyh.hotel_api.service.impl;

import com.xyh.hotel_api.dao.IUserDao;
import com.xyh.hotel_api.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class IUserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public List<Map<String, Object>> selectUserByWhere(Map<String, Object> map) {
        return userDao.selectUserByWhere(map);
    }

    @Override
    public int insertUserOne(Map<String, Object> map) {
        return userDao.insertUserOne(map);
    }

    @Override
    public int uploadUserByPhone(Map<String, Object> map) {
        return userDao.uploadUserByPhone(map);
    }
}
