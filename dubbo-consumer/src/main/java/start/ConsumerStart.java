package start;

import com.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerStart {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        System.out.println("=====consumer start!=====");
        UserService userService = (UserService)context.getBean("userService");
        System.out.println("====consumer====");
        System.out.println(userService.getName("123"));
        System.in.read();
    }
}
