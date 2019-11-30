package pl.sii.spring.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

    private final ApplicationContext ctx;

    public SpringConfig(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld("Sii Power People!!", null);
    }

    @Bean(name = "helloWorldSetter")
    public HelloWorld helloWorld2() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Sii power people setter");
        return helloWorld;
    }

    @Bean
    @Lazy
    public Worker bestWorker() {
        return ctx.getBean("hardWorker", Worker.class);
    }

    @Bean
    @Lazy
    public Worker bestWorkerOne() {
        return ctx.getBean("hardWorker", Worker.class);
    }

    @Bean
    @Scope(value = "prototype")
    @Lazy
    public Worker lazyWorkerOne() {
        return ctx.getBean("lazyWorker", Worker.class);
    }

    @Bean
    @Scope(value = "prototype")
    @Lazy
    public Worker lazyWorkerTwo() {
        return lazyWorkerOne();
    }

    @Bean
    @Lazy
    public Worker lazyWorkerNull() {
        return null;
    }
}
