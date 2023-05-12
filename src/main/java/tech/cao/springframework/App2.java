package tech.cao.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tech.cao.springframework.service.CglibProxyDemoServiceImpl;
import tech.cao.springframework.service.IJdkProxyService;
import tech.cao.springframework.service.JdkProxyDemoServiceImpl;

public class App2 {
    public static void main(String[] args) {
        // create and configure beans
//        ApplicationContext context = new ClassPathXmlApplicationContext("aspects2.xml");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("tech.cao.springframework");
        // retrieve configured instance
//        AopDemoServiceImpl service = context.getBean("demoService", AopDemoServiceImpl.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                "tech.cao.springframework");

        // jdk proxy demo
        IJdkProxyService service2 = context.getBean(IJdkProxyService.class);
        service2.doMethod1();
        service2.doMethod2();
        try {
            service2.doMethod3();
        } catch (Exception e) {
            // e.printStackTrace();
        }

        // cglib proxy demo
        CglibProxyDemoServiceImpl service = context.getBean(CglibProxyDemoServiceImpl.class);
        service.doMethod1();
        service.doMethod2();
        try {
            service.doMethod3();
        } catch (Exception e) {
            // e.printStackTrace();
        }
    }
}
