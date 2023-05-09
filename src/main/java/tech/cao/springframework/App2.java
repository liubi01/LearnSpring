package tech.cao.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tech.cao.springframework.service.AopDemoServiceImpl;

public class App2 {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("aspects2.xml");

        // retrieve configured instance
        AopDemoServiceImpl service = context.getBean("demoService", AopDemoServiceImpl.class);

        // use configured instance
        service.doMethod1();
        service.doMethod2();
        try {
            service.doMethod3();
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }
}
