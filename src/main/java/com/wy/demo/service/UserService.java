package com.wy.demo.service;

import com.wy.demo.dao.UserDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserService {
    @Resource
    private UserDAO userDAO;

    public int test(){
        return userDAO.test();
    }


}
