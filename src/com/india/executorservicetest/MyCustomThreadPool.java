package com.india.executorservicetest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyCustomThreadPool {

    private List<Worker> workers = new ArrayList<>();
    private BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();
    private boolean canAddTasks = true;

    public void shutdown() {
        canAddTasks = false;
        while (!taskQueue.isEmpty());
        for (Worker worker : workers) {
            worker.setRunning(false);
        }
    }

    public void submit(Runnable task) {
        if (canAddTasks) {
            taskQueue.add(task);
            Worker worker = getFreeWorker();
            if (worker == null) {
                System.out.println("No free worker available. Creating new thread... Current count: " + workers.size());
                worker = new Worker(workers.size() + 1);
                workers.add(worker);
                Thread thread = new Thread(worker);
                thread.start();
            } else {
                System.out.println("Reusing thread " + worker.getWorkerNumber());
            }
        }
    }

    private Worker getFreeWorker() {
        for (Worker worker : workers) {
            if (!worker.isBusy()) {
                return worker;
            }
        }
        return null;
    }

    public class Worker implements Runnable {

        private boolean busy = false;
        private boolean running = true;
        private int workerNumber;
        private int numberOfCompletedTasks = 0;

        public Worker(int workerNumber) {
            this.workerNumber = workerNumber;
        }

        @Override
        public void run() {
            while (isRunning()) {
                Runnable task = taskQueue.poll();
                if (task != null) {
                    setBusy(true);
                    task.run();
                    ++numberOfCompletedTasks;
                    setBusy(false);
                }
            }
            System.out.println("Worker " + workerNumber + " shutting down. It completed " + numberOfCompletedTasks + " tasks.");
        }

        public int getWorkerNumber() {
            return workerNumber;
        }

        public synchronized boolean isRunning() {
            return running;
        }

        public synchronized void setRunning(boolean running) {
            this.running = running;
        }

        public synchronized void setBusy(boolean busy) {
            this.busy = busy;
        }

        public synchronized boolean isBusy() {
            return busy;
        }
    }
}