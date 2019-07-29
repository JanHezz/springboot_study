package com.janhe.practice.demo;

/**
 * @CLASSNAME Demo02
 * @Description 实现多线程卖票场景(随机卖)
 * @Auther Jan  橙寂
 * @DATE 2019/6/22 0022 18:02
 */

public class Demo02 implements Runnable {

    public  static int tiket =100;
    public static int count=1;
    @Override
    public void run() {

            //当前票号小于最大票号
            while (count<tiket)
            {
                synchronized (this) {
                    System.out.println(Thread.currentThread().getName() + "卖出了" + count + "票");
                    try {
                        count++;
                        //区分效果这里睡眠1s
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }



        }



    public static void main(String[] args) {
        Demo02 runable=new Demo02();

        for (int i=1;i<=5;i++)
        {
            Thread t=new Thread(runable,"窗口"+i);
            t.start();
        }


    }
}
