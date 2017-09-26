package com.company.code5;
/*
	匿名内部类
		1. 就是内部类的简化写法。
        2. 定义匿名内部类的前提
		    内部类必须是继承一个类或者实现接口
	前提：存在一个抽象类或者接口

	    3. 格式：
		    new 类名或者接口名(){
			  重写方法;
	      	}
		4. 其实匿名内部类就是一个匿名子类对象。而且这个对象有点胖。
		5. 匿名内部类中定义的方法最好不要超过5个。
	 小结：本质是什么呢?
		是一个继承了该类或者实现了该接口的子类匿名对象。

*/
//可以定义接口
abstract class AbsDemo {
    public abstract void show();
    public abstract void show2();
}

class Outer {
    private int x =3;

    //Step 1: 继承

     class Inner extends AbsDemo
     {
     public void show()
     {
     System.out.println(" method : " + x);
     }
     public void show2()
     {
     System.out.println(" method : " + (x+1));
     }


     }





    public void function() {
        // Step 1
        //new Inner().show();

        // Step 2

        //new AbsDemo();//错误
        //new AbsDemo()
        //{

        //}.show();
   /*    new AbsDemo(){
           //带了对象方法体的 new 对象， 是AbsDemo子类对象，只有子类才能重写 show
             public void show() {
             System.out.println("show ：" + x);
             }

           @Override
           public void show2() {

           }

       }.show();*/

        //二个方法的时候
		new AbsDemo() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show();

		new AbsDemo() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show : 2");
			}
		}.show2();

        //如果我是很多个方法，就很麻烦了
        //那么，我们有没有改进的方案呢?
        //Step 3

        AbsDemo i = new AbsDemo() { //多态
            public void show() {
                System.out.println("show");
            }

            public void show2() {
                System.out.println("show : 2");
            }
        };

        i.show();
        i.show2();


    }
}
public class InnerClassDemo6 {
    public static void main(String[] args) {
        new Outer().function();

    }
}
