package pl.sii.spring.core.other;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component
public class SmartBean implements InitializingBean, DisposableBean {
    private User user;
    private User otherUser;

    public SmartBean(User user) {
        this.user = user;
        System.out.println("User: " + user);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }

    @Resource
    public void setOtherUser(User otherUser) {
        this.otherUser = otherUser;
        System.out.println("Other user: " + otherUser);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Shutting down smart bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }
}
