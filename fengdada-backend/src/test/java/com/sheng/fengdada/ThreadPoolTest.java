package com.sheng.fengdada;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import org.junit.jupiter.api.Test;

public class ThreadPoolTest {

    @Test
    void test() {
        Scheduler io = Schedulers.io();
        while (true) {
            io.scheduleDirect(() -> {
                System.out.println(Thread.currentThread().getName() + " print hello");
                try {
                    Thread.sleep(5000000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }

}
