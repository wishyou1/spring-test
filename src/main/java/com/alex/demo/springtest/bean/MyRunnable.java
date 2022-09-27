package com.alex.demo.springtest.bean;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 1;  i<=1000; i++) {
            System.out.println("sub  thread --> " + i);
        }
    }
}
