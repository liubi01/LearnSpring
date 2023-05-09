package tech.cao.springframework;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.cao.springframework.config.BeansConfig;
import tech.cao.springframework.entity.User;
import tech.cao.springframework.service.UserServiceImpl;

import java.util.List;

public class App {
    /**
     * main interfaces.
     *
     * @param args args
     */
    public static void main(String[] args) {
        // create and configure beans
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("aspects.xml", "daos.xml", "services.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("tech.cao.springframework");
        // retrieve configured instance
        UserServiceImpl service = context.getBean("userService", UserServiceImpl.class);

        // use configured instance
        List<User> userList = service.findUserList();

        // print info from beans
        userList.forEach(a -> System.out.println(a.getName() + "," + a.getAge()));
    }
}
