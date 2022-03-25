package com.springboot.springboot01.javase.javase08Thread.demo;

/**
 * 实现Runnable接口，重写run方法
 */
public class RunnableDemo2 implements Runnable {

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"------"+i);
        }
    }

    public static void main(String[] args) {
        RunnableDemo2 run2 = new RunnableDemo2();
        Thread t = new Thread(run2);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"---------"+i);
        }
    }

}
