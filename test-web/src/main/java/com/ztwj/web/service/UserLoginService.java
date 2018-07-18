package main.java.com.ztwj.web.service;

import main.java.com.ztwj.web.domain.User;

/**
 * Created by nickwang on 2018/7/18.
 */
public class UserLoginService {

    public User getLoginInfo(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setPsw("6666");
        return user;
    }
}
