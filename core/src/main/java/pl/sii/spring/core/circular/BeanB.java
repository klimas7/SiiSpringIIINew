package pl.sii.spring.core.circular;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private BeanA beanA;

    public BeanB(BeanA beanA) {
        this.beanA = beanA;
    }
}
