package com.springboot.springboot01.javase.javase08.demo;

public class ThreadDemo2 extends Thread {

    @Override
    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println(Thread.currentThread().getName()+"==========="+i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo2 t = new ThreadDemo2();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"---------"+i);
        }
    }

}
