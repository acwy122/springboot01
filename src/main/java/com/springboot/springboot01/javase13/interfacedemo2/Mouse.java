package com.springboot.springboot01.javase13.interfacedemo2;

/**
 * @author: 马士兵教育
 * @create: 2019-08-31 20:35
 */
public class Mouse implements Usb{
    @Override
    public void dataTransfer() {
        System.out.println("鼠标来点击屏幕");
    }

    @Override
    public void play() {
        System.out.println("鼠标在自己玩");
    }
}
