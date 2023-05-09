package tech.cao.springframework.dao;

import org.springframework.stereotype.Repository;
import tech.cao.springframework.entity.User;

import java.util.Collections;
import java.util.List;

@Repository
public class UserDaoImpl {
    /**
     * init.
     */
    public UserDaoImpl() {
    }

    /**
     * mocked to find user list.
     *
     * @return user list
     */
    public List<User> findUserList() {
        return Collections.singletonList(new User("cao", 18));
    }
}
