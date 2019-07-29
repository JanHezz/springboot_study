package com.janhe.practice.demo;

/**
 * @CLASSNAME Demo02
 * @Description 实现多线程卖票场景改良版轮流卖票(2个窗口)
 * @Auther Jan  橙寂
 * @DATE 2019/6/22 0022 18:02
 */

public class Demo03 implements Runnable {

    public  static int tiket =100;
    public static int count=1;
    @Override
    public void run() {

            //当前票号小于最大票号
            while (count<=tiket)
            {

                synchronized (this) {
                    //唤醒正在睡眠状态的线程
                    notify();
                    System.out.println(Thread.currentThread().getName() + "卖出了" + count + "票");
                    try {
                        count++;
                        //线程进入睡眠状态。这里会释放锁
                         wait();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }



        }



    public static void main(String[] args) {
        Demo03 runable=new Demo03();

        for (int i=1;i<=2;i++)
        {
            Thread t=new Thread(runable,"窗口"+i);
            t.start();
        }


    }
}
