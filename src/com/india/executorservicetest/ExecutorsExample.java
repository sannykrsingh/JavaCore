package com.india.executorservicetest;
import java.util.*;

public class ExecutorsExample {
	   private static final int NUMBER_OF_TASKS = 10;
	   protected static final Random RANDOM = new Random();
    
	   public static void main(String[] args) {
            MyCustomThreadPool cachedThreadPool = new MyCustomThreadPool();
            for (int i = 0; i < NUMBER_OF_TASKS; ++i) {
                final int taskNumber = i + 1;
                Runnable task = new Runnable() {

                    @Override
                    public void run() {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                        System.out.println("Task " + taskNumber + " complete.");
                    }
                };
                cachedThreadPool.submit(task);
            }
            cachedThreadPool.shutdown();
        }

    }


