package tech.cao.springframework.springmvc.dao;

import org.springframework.stereotype.Repository;
import tech.cao.springframework.springmvc.entity.User;

import java.util.Collections;
import java.util.List;

/**
 * @author pdai
 */
@Repository
public class UserDaoImpl {

    /**
     * mocked to find user list.
     *
     * @return user list
     */
    public List<User> findUserList() {
        return Collections.singletonList(new User("cao", 18));
    }
}
