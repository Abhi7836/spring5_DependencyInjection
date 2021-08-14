package abhi.springudemy.spring5di;

import abhi.springudemy.spring5di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring5DiApplication.class, args);
        MyController myController=(MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);
    }

}
