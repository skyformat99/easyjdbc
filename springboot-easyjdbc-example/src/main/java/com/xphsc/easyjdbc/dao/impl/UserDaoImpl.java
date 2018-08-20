package com.xphsc.easyjdbc.dao.impl;

import com.xphsc.easyjdbc.core.SimpleJdbcDao;
import com.xphsc.easyjdbc.dao.UserDao;
import com.xphsc.easyjdbc.model.User;
import org.springframework.stereotype.Service;

/**
 * @author huipei.x
 * @data 创建时间 2018/6/24
 * @description 类说明 :
 */
@Service
public class UserDaoImpl extends SimpleJdbcDao<User> implements UserDao {
}