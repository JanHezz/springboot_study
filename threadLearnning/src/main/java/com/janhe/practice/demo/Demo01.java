package com.janhe.practice.demo;

import com.janhe.practice.demo.common.MyThread;

/**
 * @CLASSNAME Demo01
 * @Description 多线程初体验
 * @Auther Jan  橙寂
 * @DATE 2019/6/22 0022 17:52
 */

public class Demo01 implements Runnable{
    @Override
    public void run() {

        System.out.println("runable Running!!!");
    }


    public static void main(String[] args) {

        //1.创建继承了ruable接口的对象
        Demo01 runable=new Demo01();

        //2.创建使用自定义ruable接口的线程
        Thread t1=new Thread(runable);

        //3.创建继承Thread类的线程
        MyThread t2=new MyThread();
        //4.运行
        t1.start();
        t2.start();

    }
}
