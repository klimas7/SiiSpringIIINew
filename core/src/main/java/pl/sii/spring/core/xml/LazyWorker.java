package pl.sii.spring.core.xml;

import java.util.UUID;

public class LazyWorker implements Worker {
    private String uuid;

    public LazyWorker() {
        this.uuid = UUID.randomUUID().toString();
    }

    @Override
    public void doWork() {
        System.out.println("I'am lazy worker nr: " + uuid);
    }

    public void born() {
        System.out.println("Born a lazy worker: " + uuid);
    }
}
