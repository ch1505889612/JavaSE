package com.ch.object.onoctober12.test;

import com.ch.object.onoctober12.MemberInterior;
import com.ch.object.onoctober12.MemberInterior.Inter;

/**
 * @author procedure sail
 * @date 2021/10/12 10:40
 */
public class Test01 {

    /**
     * 测试普通内部类
     * @param args
     */
    public static void main(String[] args) {

        //创建内部类对象
        Inter inter = new MemberInterior().new Inter();
        inter.add();

    }
}
