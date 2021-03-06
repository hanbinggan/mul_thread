package com.hanbinggan.lesson1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hello on 2016/4/22.
 */
public class UnsafeTask implements Runnable {
    private Date startDate;
    @Override
    public void run() {
        startDate=new Date();
        System.out.printf("Starting Thread: %s %s\n",Thread.currentThread().getId(),startDate);
        try {
            TimeUnit.SECONDS.sleep((int)Math.rint(Math.random()*10));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.printf("Thread finished: %s %s\n",Thread.currentThread().getId(),startDate);
    }
}
