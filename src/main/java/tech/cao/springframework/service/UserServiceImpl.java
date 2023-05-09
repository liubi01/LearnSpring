package tech.cao.springframework.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.cao.springframework.dao.UserDaoImpl;
import tech.cao.springframework.entity.User;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl {

    /**
     * user dao impl.
     */
    @Autowired
    private UserDaoImpl userDao;
//    private final UserDaoImpl userDao; //

    /**
     * init.
     */
    public UserServiceImpl() {
    }

    /**
     * <constructor-arg>是通过构造函数参数注入，比如下面的xml:
     * 本质上是new UserServiceImpl(userDao)创建对象, 所以对应的service类是这样的：
     * init.
     * @param userDaoImpl user dao impl
     */
//    public UserServiceImpl(UserDaoImpl userDaoImpl) {
//        this.userDao = userDaoImpl;
//    }
    /**
     * init.
     * @param userDaoImpl user dao impl
     * spring 4.x 注解+java
     */
//    @Autowired // 这里@Autowired也可以省略
//    public UserServiceImpl(final UserDaoImpl userDaoImpl) {
//        this.userDao = userDaoImpl;
//    }

    /**
     * find user list.
     *
     * @return user list
     */
    public List<User> findUserList() {
        return this.userDao.findUserList();
    }

    /**
     * set dao.
     *
     * @param userDao user dao  // 在 <property name="userDao" ref="userDao"/>被调用
     */
    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

}
