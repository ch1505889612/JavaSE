package com.ch.interfaces.test;

import com.ch.interfaces.Whole;
import com.ch.interfaces.WholeImpl;

/**
 * @author procedure sail
 * @date 2021/10/11 14:41
 */
public class Test01 {
    public static void main(String[] args) {
        Whole.add();
        new WholeImpl().list();
    }
}
