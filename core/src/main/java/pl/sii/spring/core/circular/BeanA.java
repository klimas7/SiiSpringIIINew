package pl.sii.spring.core.circular;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanA {
    private String message = "BeanA";
    private BeanB beanB;

    public BeanA(BeanB beanB) {
        this.beanB = beanB;
//        this.beanB.printMessage();

    }

    public String getMessage() {
        return message;
    }

    public String getOtherMessage() {
        return beanB.getMessage();
    }
}
