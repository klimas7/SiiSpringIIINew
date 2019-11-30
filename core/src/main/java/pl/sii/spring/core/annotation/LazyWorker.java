package pl.sii.spring.core.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Component
@Scope(value = "prototype")
@Lazy
public class LazyWorker implements Worker {
    private String uuid;

    public LazyWorker() {
        this.uuid = UUID.randomUUID().toString();
    }

    @Override
    public void doWork() {
        System.out.println("I'am lazy worker nr: " + uuid);
    }

    @PostConstruct
    public void born() {
        System.out.println("Born a lazy worker: " + uuid);
    }
}
