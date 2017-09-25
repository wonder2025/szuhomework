package com.company.code3;
class Demo {
    int a;
    int b;

    public int sum(){
        return a+b;
    }

}
public class Test {
    public static void main(String[] args) {
        //创建对象
        //方式1测试
		/*
		Demo d = new Demo();
		System.out.println(d.sum());
		*/

        //方式2测试
		/*
		Demo d = new Demo();
		int a = 10;
		int b = 20;
		System.out.println(d.sum(a,b));
		*/

        //方式3测试
        Demo d = new Demo();
        d.a = 10;
        d.b = 20;
        System.out.println(d.sum());
    }
}
