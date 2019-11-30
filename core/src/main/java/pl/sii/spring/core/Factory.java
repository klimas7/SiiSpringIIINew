package pl.sii.spring.core;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;

public class Factory {
    private Worker bestWorker;
    private Worker theMostLazyWorker;
    private Collection<Worker> workers;

    public void setBestWorker(Worker bestWorker) {
        this.bestWorker = bestWorker;
    }

    public void setTheMostLazyWorker(Worker theMostLazyWorker) {
        this.theMostLazyWorker = theMostLazyWorker;
    }

    public void setWorkers(Collection<Worker> workers) {
        this.workers = workers;
    }

    void doWork() {
        workers.stream().filter(Objects::nonNull).forEach(Worker::doWork);

        checkAndDoWork(bestWorker, "The Best Worker");
        checkAndDoWork(theMostLazyWorker, "TheMost Lazy Worker");

    }

    private void checkAndDoWork(Worker worker, String message) {
        System.out.println(message);
        Optional<Worker> testWorker = Optional.ofNullable(worker);
        testWorker.ifPresent(Worker::doWork);
    }
}
