package helloWorld;


import log.Log;
import log.LogConsole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext injector = new ClassPathXmlApplicationContext(
                "/helloWorld/spring-config.xml");


        Log log = (Log) injector.getBean("logConsole");


        HelloWorld obj = (HelloWorld) injector.getBean("helloBean");



        obj.printHello();
        obj.setName("Miquel");

        HelloWorld obj2 = (HelloWorld) injector.getBean("helloBean");
        obj2.printHello();


    }
}
