package com.smile.service;

import com.smile.domain.UserBean;

import java.util.List;

/**
 * Created by SmileZj on 2017/8/9.
 */
public interface UserService {
    public void insert(UserBean userBean);

    public void update(UserBean userBean);

    public void delete(int id);

    public UserBean queryById(int id);

    public List<UserBean> queryAll();
}
