package pl.sii.spring.core.circular;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("beanZ")
public class BeanY {
    public BeanY() {
        System.out.println("BeanY");
    }
}
