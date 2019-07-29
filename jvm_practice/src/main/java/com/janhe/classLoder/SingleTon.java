package com.janhe.classLoder;

/**
 * @CLASSNAME SingleTon
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/6/16 0016 16:03
 */

public class SingleTon {
    public   static int count1;

    //不同的位置结果也会不同具体是跟类的加载机制有关

    //1
   // public   static  int count2=0;

    private  static  SingleTon instance=new SingleTon();
    private  SingleTon()
    {
        count1++;
        count2++;

    }

    // 0
    public   static  int count2=0;

    public static SingleTon getInstance()
    {
        return instance;
    }



}
