package com.janhe.test;

import com.janhe.classLoder.SingleTon;

/**
 * @CLASSNAME TestClassLoder
 * @Description
 * @Auther Jan  橙寂
 * @DATE 2019/6/16 0016 16:02
 */

public class TestClassLoder {

    public static void main(String[] args) {

        SingleTon instance=SingleTon.getInstance();

        System.out.println(SingleTon.count1);

        System.out.println(SingleTon.count2);
    }

}
