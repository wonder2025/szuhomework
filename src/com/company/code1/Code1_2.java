package com.company.code1;

import java.util.Scanner;

public class Code1_2 {
    public static void main(String[] args) {
        iftest3();
    }
    public static void  input2Words(){
        System.out.println("请输入两个数字，数字以空格或者回车区分：");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("你输入的两个数字是："+a+" "+b+","+"它们的和为：" +(a+b));
    }

    public static void  findMax(){
        System.out.println("请输入两个数字，数字以空格或者回车区分：");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("你输入的两个数字是："+a+" "+b+","+"它们的最大值为：" +(a>b?a:b));
    }
    public static void  findMaxIn3(){
        System.out.println("请输入三个数字，数字以空格或者回车区分：");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("你输入的两个数字是："+a+" "+b+" "+c+","+"它们的最大值为：" +(((a > b)? a: b)>c?((a > b)? a: b):c));
    }
    public static void  iftest(){
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //获取两个数据中较大的值
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();

        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();

        int max=(a>b?a:b);
        System.out.println("max:"+max);
        System.out.println("----------------");

        //判断一个数据是奇数还是偶数
        System.out.println("请输入你要判断的数据：");
        int x = sc.nextInt();
        String panduan=x%2==0?"偶数":"奇数";
        System.out.println(x+"是"+panduan);
    }
    public static void  iftest2(){
//创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入x的值：");
        int x = sc.nextInt();

        //定义一个y
        int y=0;
        //用if语句格式3进行判断
        if(x>=3){
            y = 2*x + 1;
        }else if (-1<=x&&x<3){
            y = 2*x;
        }else if(x<-1){
            y = 2*x - 1;
        }
        System.out.println("y:"+y);
    }
    public static void  iftest3(){
        Scanner sc = new Scanner(System.in);

        //录入数据
        System.out.println("请你输入一个月份:");
        int month = sc.nextInt();
        switch (month){
            case 3: case 4: case 5:
                System.out.println("春");
                break;
            case 6: case 7: case 8:
                System.out.println("夏");
                break;
            case 9: case 10: case 11:
                System.out.println("秋");
                break;
            case 12: case 1: case 2:
                System.out.println("冬");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
        if(month>=1 && month<=6){
            System.out.println("上半年");
        }else{
            System.out.println("下半年");

        }
    }
    public static void  iftest4(){
        int a = 40;
        int b = 30;
        int c = 20;

        //三元实现
        //int temp = (a>b)? a: b;
        //int max = (temp>c)? temp: c;
        //System.out.println("max:"+max);
        //System.out.println("--------");

        //用if语句嵌套实现
        int max;
        if (a>b){
            if (a>c){
                max=a;
            }else {
                max=c;
            }
        }else{
            if(b>c){
                max=b;
            }else {
                max=c;
            }
        }
        System.out.println("max:"+max);
    }
    public static void  testaa(){
        int a=1;
        int b=2;
        System.out.println(a=b);
    }

}
