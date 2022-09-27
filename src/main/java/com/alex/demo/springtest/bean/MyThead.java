package com.alex.demo.springtest.bean;

public class MyThead extends Thread{
    @Override
    public void run() {
        System.out.println("这是子线程打印的内容");
    }
}
