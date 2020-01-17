package com.example.test.multithread.printinorder;


import java.util.concurrent.Semaphore;

//https://leetcode-cn.com/problems/print-in-order/
public class Foo {

    Semaphore first = new Semaphore(1);
    Semaphore second = new Semaphore(1);

    public Foo() {
        try {
            first.acquire();
            second.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void first(Runnable printFirst) throws InterruptedException {


        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        first.release();
        this.notifyAll();

    }

    public void second(Runnable printSecond) throws InterruptedException {

        first.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        first.release();
        second.release();
    }

    public void third(Runnable printThird) throws InterruptedException {

        second.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        second.release();
    }
}
