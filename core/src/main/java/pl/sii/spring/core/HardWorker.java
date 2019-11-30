package pl.sii.spring.core;

import java.util.UUID;

public class HardWorker implements Worker {
    private String uuid;

    public HardWorker() {
        this.uuid = UUID.randomUUID().toString();
    }

    @Override
    public void doWork() {
        System.out.println("I'am hard worker nr: " + uuid);
    }
}
