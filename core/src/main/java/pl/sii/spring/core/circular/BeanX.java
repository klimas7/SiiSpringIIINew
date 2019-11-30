package pl.sii.spring.core.circular;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("beanY")
public class BeanX {
    public BeanX() {
        System.out.println("BeanX");
    }
}
