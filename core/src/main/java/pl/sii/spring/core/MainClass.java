package pl.sii.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //! FileSystemXmlApplicationContext

        //getBean -> DefaultListableBeanFactory -> DefaultSingletonBeanRegistry
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.print();

        helloWorld.setMessage("Test");
        helloWorld.print();

        HelloWorld helloWorldSetter = (HelloWorld) context.getBean("helloWorldSetter");
        helloWorldSetter.print();

        HelloWorld helloWorldConstructor = context.getBean("helloWorldConstructor", HelloWorld.class);
        helloWorldConstructor.print();

        System.out.println("------");
        Factory factory = context.getBean("factory", Factory.class);
        factory.doWork();
    }
}
