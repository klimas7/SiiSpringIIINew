package pl.sii.spring.core.other;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Component
public class SmartBean implements InitializingBean, DisposableBean {
    private List<User> users;
    private User otherUser;


//    public SmartBean(User user) {
//        this.users = Arrays.asList(user);
//        System.out.println("User: " + user);
//    }
//
//    @Autowired
//    public SmartBean(User user, User user2) {
//        this.users = Arrays.asList(user, user2);
//        System.out.println("User: " + user);
//    }


    public SmartBean(List<User> users) {
        this.users = users;
        System.out.println("User: " + users);
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
