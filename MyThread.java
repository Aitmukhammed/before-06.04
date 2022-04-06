package com.company;

public class MyThread implements Runnable{
    String thrdName;
    MyThread(String name){
        thrdName = name;
    }

    public void run(){ //Точка входа в поток
        System.out.println(thrdName + " - запуск");
        try {
            for (int count=0; count<10; count++){
                Thread.sleep(400);
                System.out.println("В "+thrdName + ", счетчик: "+count);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thrdName + " - завершение");
    }
}
