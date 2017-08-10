package com.smile.service.impl;

import com.smile.dao.UserDao;
import com.smile.domain.UserBean;
import com.smile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by SmileZj on 2017/8/2.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void insert(UserBean userBean) {
        userDao.insert(userBean);
    }

    public void update(UserBean userBean) {
        userDao.update(userBean);
    }

    public void delete(int id) {
        userDao.delete(id);
    }

    public UserBean queryById(int id) {
        return userDao.queryById(id);
    }

    public List<UserBean> queryAll() {
        return userDao.queryAll();
    }
}
