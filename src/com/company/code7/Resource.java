package com.company.code7;

public class Resource {
    private String name;
    private int count =1;
    private boolean flag =false;

    public synchronized  void set(String name)
    {
//        if(flag)
        while(flag)
            try{
                System.out.println(Thread.currentThread().getName() + "..set..wait()前......." + this.name);
            wait();
        }catch(Exception e){}
        //false
        this.name= name + "--" + count++;       //给输入加入编号
        System.out.println(Thread.currentThread().getName()+"...生产者..." + this.name);
        flag = true;
        this.notify();
//        this.notifyAll();
    }
    public  synchronized void out()
    {
//        if(!flag)
         while(!flag)
        try{
            System.out.println(Thread.currentThread().getName() + "..out..wait()前......." + this.name);
            wait();
        }catch(Exception e){}

        System.out.println(Thread.currentThread().getName() + "....消费者......." + this.name);
        flag = false;
        this.notify();
//        this.notifyAll();
    }

}
class Producer implements Runnable
{
    private Resource res;
    Producer(Resource res)
    {
        this.res= res;
    }
    public void run()
    {
        while(true)
        {
            res.set("+商品+");
        }
    }

}

class Consumer implements Runnable {
    private Resource res;

    Consumer(Resource res) {
        this.res = res;
    }

    public void run() {
        while (true) {
            res.out();
        }
    }
}

