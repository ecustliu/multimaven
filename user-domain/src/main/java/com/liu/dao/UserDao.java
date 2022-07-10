package com.liu.dao;
import com.liu.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建UserDao类（此处只是演示创建多模块，所以没有连接数据库）;
 * user-dao模块依赖于user-domain模块，所以需在pom.xml文件中引入user-domain依赖
 * @author qzz
 */
@Component
public class UserDao {

    public List<User> query(){

        List<User> list = new ArrayList<>();
        User user = new User();
        user.setId(1L);
        user.setUserName("admin");
        user.setPassword("admin");
        list.add(user);
        return list;
    }
}

