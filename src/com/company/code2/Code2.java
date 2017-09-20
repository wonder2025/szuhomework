package com.company.code2;


import java.util.Scanner;

public class Code2 {

    public static void  SwitchTest2(){
//出一个选择题，然后供你选择。
        //由于我们现在没有办法键盘录入得到一个'A','B'
        //这样的东西，我就用65，66这样的值替代
        //将来我们获取到这样的值以后，强制转换为字符类型
        System.out.println("下面的几个人你最爱谁?");
        System.out.println("65 林青霞");
        System.out.println("66 张曼玉");
        System.out.println("67 刘德华");
        System.out.println("68 王力宏");
        //键盘录入选择的数据。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的选择：");
        int choiceNumber = sc.nextInt();
        //强制转换为字符类型
        char choice = (char) choiceNumber;
        switch(choice) {
            case 'A':
                System.out.println("林青霞");
                break;
            case 'B':
                System.out.println("张曼玉");
                break;
            case 'C':
                System.out.println("刘德华");
                break;
            case 'D':
                System.out.println("王力宏");
                break;
            default:
                System.out.println("选择错误！");
                break;
        }
    }
    public static void  SwitchTest3(){
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //录入数据
        System.out.println("请输入你要判断的字符串：");
        String s = sc.nextLine();
        switch(s) {
            case "A":
                System.out.println("输入A！");
                break;
            default:
                System.out.println("输入非A！");
                break;
        }
    }
    public static void  SwitchTest4(){
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //录入数据
        System.out.println("请输入月份(1-12)：");
        int month = sc.nextInt();
        switch (month){
            case 3: case 4: case 5:
                System.out.println("春季");
                break;
            case 6: case 7: case 8:
                System.out.println("夏季");
                break;
            case 9: case 10: case 11:
                System.out.println("秋季");
                break;
            case 12: case 1: case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
    public static void  ForDemo6(){
        //三位数其实是告诉了我们范围。
        for(int x=100; x<1000; x++) {

            //让ge*ge*ge+shi*shi*shi+bai*bai*bai和该数据比较
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;
            int sum=ge*ge*ge+shi*shi*shi+bai*bai*bai;
            if(sum==x) {
                //如果相同，就把该数据在控制台输出。
                System.out.println(x);
            }
        }
    }
    public static void  ForDemo7(){
        for(int x=10000; x<100000; x++) {
            //分解每一个五位数的个，十，百，千，万位上的数据
            int ge = x%10;
            int shi = x/10%10;
            int bai  = x/10/10%10;
            int qian = x/10/10/10%10;
            int wan = x/10/10/10/10%10;

            //按照要求进行判断即可
            if((ge==wan) && (shi==qian) && (ge+shi+qian+wan==bai)) {
                System.out.println(x);
            }
        }
    }
    public static void  ForDemo8(){
        //定义统计变量，初始化值是0
        int count = 0;

        //三位数告诉了我们范围，用for循环就可以搞定
        for(int x=100; x<1000; x++) {
            //获取每一个三位数的个，十，百的数据
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;
            int sum=ge*ge*ge+shi*shi*shi+bai*bai*bai;

            //按照要求进行判断
            if(x == sum) {
                //如果满足要求就计数。
                count++;
            }
        }

        System.out.println("水仙花数共有"+count+"个");
    }
    public static void  ForDemo9(){
        //定义统计变量,初始化值是0
        int count = 0;
        //1-1000之间是一个范围，用for很容易就可以实现。
        for(int x=1; x<=1000; x++) {
			/*
				每个数据要同时满足如下要求
				x%3==2
				x%5==3
				x%7==2
			*/
            if(x%3 == 2 && x%5 == 3&& x%7 == 2 ) {
                count++;
                System.out.println(x);
            }
        }

        //输出数据
        System.out.println("满足这样条件的数据共有："+count+"个");
    }
    public static void  WhileDemo3(){
        //for循环版本
        int count = 0;
        for(int x=100; x<1000; x++) {
            //获取每一个三位数的个，十，百的数据
            int ge=x%10;
            int shi=x/10%10;
            int bai=x/10/10%10;
            int sum=ge*ge*ge+shi*shi*shi+bai*bai*bai;

            //按照要求进行判断
            if(x == sum) {
                //如果满足要求就计数。
                count++;
            }
        }
        System.out.println("count:"+count);
        System.out.println("------------");
        //while循环版本
        int count2 = 0;
        int y = 100;
        while (y<1000){
            //获取每一个三位数的个，十，百的数据
            int ge=y%10;
            int shi=y/10%10;
            int bai=y/10/10%10;
            int sum=ge*ge*ge+shi*shi*shi+bai*bai*bai;
            //按照要求进行判断
            if(y == sum) {
                //如果满足要求就计数。
                count2++;
            }
            y++;
        }
        System.out.println("count2:"+count2);
    }
    public static void  WhileDemo4(){
        //for循环实现
        for(int x=0; x<10; x++) {
            System.out.println("中国科学");
        }
        //这里不能在继续访问了
//        System.out.println(x);
        System.out.println("-------------------");

        //while循环实现
        int y = 0;
        while(y<10){
            System.out.println("中国科学");
            y++;
        }
        //这里是可以继续访问的
        System.out.println(y);
    }
    public static void  WhileDemo5(){
        //定义一个统计变量，默认值是0
        int count = 0;
        //最高山峰是珠穆朗玛峰：8848m这是最终的厚度
        //我现在有一张足够大的纸张，厚度为：0.01m这是初始厚度
        //为了简单，我把0.01变成1，同理8848就变成了884800
        int end = 884800;
        int start = 1;
        while(start<end) {
            //只要每次变化的厚度没有超过珠穆朗玛峰的高度，就折叠，统计变量++
            start=start*2;
            //折叠一次有什么变化呢?就是厚度是以前的2倍。
            count++;
            System.out.println("第"+count+"次厚度是"+start);
        }
        //输出统计变量。
        System.out.println("要叠"+count+"次");
    }
    public static void  DoWhileDemo3(){
        int x = 0;
        while(x < 10) {
            System.out.println(x);
            x++;
        }
        System.out.println("--------------");
		while(true) {
			System.out.println("今天我很高兴，学习了死循环");
		}
//        System.out.println("--------------");
    }
    public static void  ForForDemo3(){
        for(int x=0; x<9; x++) {
            for(int y=0; y<=x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------");
        //为了使用数据，我们从1开始
        for(int x=1; x<=9; x++) {
            for(int y=1; y<=x; y++) {
                System.out.print(x+"*"+y+" = "+(x*y)+"\t");
            }
            System.out.println();
        }
    }

    public static void functionTest() {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据:");
        int b = sc.nextInt();
        int result = getMax(a,b);
        System.out.println("较大值是："+result);
    }

    /*
        需求：两个数中的较大值
        两个明确：
            返回值类型：int
            参数列表：int a,int b
    */
    public static int getMax(int a,int b) {
        if (a > b){
            return a;
        }else{
            return b;
        }

    }

    /*public static void functionTest2() {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据:");
        int b = sc.nextInt();
        boolean flag = compare(a,b);
        System.out.println(flag);
    }

    *//*
        需求：比较两个数是否相等
        两个明确：
            返回值类型：boolean
            参数列表：int a,int b
    *//*
    public static boolean compare(int a,int b) {
        if (a==b)
            return true;
        return false;

    }*/
    public static void functionTest3() {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数据:");
        int c = sc.nextInt();
        int max = getMax(a,b,c);
        System.out.println("三个数据中的最大值是："+max);
    }
    /*
        需求；返回三个数中的最大值

        两个明确：
            返回值类型：int
            参数列表：int a,int b,int c
    */
    public static int getMax(int a,int b,int c) {
        return (a>b?a:b)>c?(a>b?a:b):c;
    }
    public static void functionTest5() {
        //创建对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入n的值：(1~9)");
        int n = sc.nextInt();

        //调用
        printNN(n);
    }

    /*
        需求：输出对应的nn乘法表
        两个明确：
            返回值类型：void
            参数列表：int n
    */
    public static void printNN(int n) {
        for(int x=1; x<=n; x++) {
            for(int y=1; y<=x; y++) {
                System.out.print(x+"*"+y+" = "+(x*y)+"\t");
            }
            System.out.println();
        }
    }
    public static void functionTest4() {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
        int m = sc.nextInt();
        System.out.println("请输入列数：");
        int n = sc.nextInt();
        //void类型的方法调用
        pringXing(m,n);
    }
    /*
        输出星形
        两个明确：
            返回值类型：void
            参数列表：int m,int n
    */
    public static void pringXing(int m,int n) {
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void functionTest6() {
        //测试
        byte b1 = 3;
        byte b2 = 4;
        System.out.println("byte:"+compare(b1,b2));

        //测试
        short s1 = 5;
        short s2 = 5;
        System.out.println("short:"+compare(s1,s2));
        //测试
        int i1 = 3;
        int i2 = 4;
        System.out.println("int:"+compare(i1,i2));

        //测试
        long lo1= 5;
        long lo2= 5;
        System.out.println("short:"+compare(lo1,lo2));

        //后面的两个自己测试
    }

    //byte类型
    public static boolean compare(byte a,byte b) {
        System.out.println("byte");
        return a == b;
    }

    //short类型
    public static boolean compare(short a,short b) {
        System.out.println("short");
        return a == b;
    }

    //int类型
    public static boolean compare(int a,int b) {
        System.out.println("int");
        return a == b;
    }

    //long类型
    public static boolean compare(long a,long b) {
        System.out.println("long");
        return a == b;
    }
    public static void arrayTest() {
        //定义数组
        int[] arr = {11,22,33,44,55};

        //获取每一个元素
        //如何获取呢?我们知道数组名结合编号(索引)就可以找到数据
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("--------------------");

        //虽然这种做法可以，但是不是我想要的
        //我们发现，代码的重复度很高
        //输出语句，数组名都是相同的，仅仅是索引是变化的
        //我们就可以使用循环搞定索引值
        for(int x=0; x<5; x++) {
            //x=0,1,2,3,4
            System.out.println(arr[x]);
        }
        System.out.println("--------------------");

        //从0开始我们是明确的，但是为什么到5呢，我们是数了一下数组的个数
        //继续看下个数组如何遍历
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,2,2,3,4,5,7,8,5,3,5,6,8,7,8,5,3,5,6,8,7,8,5,3,5,6,8,7,8,5,3,5,6,8,7,8,5,3,5,6,8};
        //而我们在很多时候，数组的元素不能靠数
        //这个时候，数组就给我们提供了一个属性：length专门用于获取数组的长度
        //格式：数组名.length 返回数组的长度
        System.out.println(arr.length);
        System.out.println(arr2.length);
        System.out.println("--------------------");

        //改进第一个程序
        for(int x=0; x<arr.length; x++) {
            System.out.println(arr[x]);
        }
        System.out.println("--------------------");

        //我们如果想要对多个数组进行遍历，每个数组的遍历我们都把代码写一遍，麻烦不
        //麻烦，所以，我们准备用方法改进。
        //用方法改进后，请调用
        printArray(arr);
        System.out.println("--------------------");
        printArray(arr2);
        System.out.println("--------------------");
//        printArray2(arr);
    }

	/*
		遍历数组的方法

		两个明确：
			返回值类型：void
			参数列表：int[] arr
	*/
    public static  void printArray(int[] arr){
        System.out.println("---------遍历数组----------");
        for(int x=0; x<arr.length; x++) {
            System.out.println(arr[x]);
        }
    }

    public static void arrayTest2(){
        //定义一个数组
        int[] arr = {34,98,10,25,67};

        //请获取数组中的最大值
		/*
		//从数组中任意的找一个元素作为参照物
		int max = arr[0];
		//然后遍历其他的元素
		for(int x=1; x<arr.length; x++) {
			//依次获取和参照物进行比较，如果大就留下来，如果小，就离开。
			if(arr[x] > max) {
				max = arr[x];
			}
		}
		//最后参照物里面保存的就是最大值。
		System.out.println("max:"+max);
		*/

        //把这个代码用方法改进
        //调用方法
        int max = getMax(arr);
        System.out.println("max:"+max);

        //请获取数组中的最小值
        int min = getMin(arr);
        System.out.println("min:"+min);
    }

    /*
        需求：获取数组中的最大值
        两个明确：
            返回值类型：int
            参数列表：int[] arr
    */
    public static int getMax(int[] arr) {
        //从数组中任意的找一个元素作为参照物
        int max = arr[0];
        //然后遍历其他的元素
        for(int x=1; x<arr.length; x++) {
            //依次获取和参照物进行比较，如果大就留下来，如果小，就离开。
            if(arr[x] > max) {
                max = arr[x];
            }
        }
        //最后参照物里面保存的就是最大值。
        return max;
    }

    public static int getMin(int[] arr) {
        //从数组中任意的找一个元素作为参照物
        int min= arr[0];
        //然后遍历其他的元素

        for(int x=1; x<arr.length; x++) {
            //依次获取和参照物进行比较，如果小就留下来，如果大，就离开。
            if(arr[x] < min) {
                min = arr[x];
            }
        }
        //最后参照物里面保存的就是最小值。
        return min;
    }
    public static void array2Test() {
        //定义一个二维数组
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
    public static void array2Test2() {
        //把题目的数据用二维数组来表示
        int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};

        int sum = 0;
        //定义一个求和变量sum，初始化值是0。
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("全年销售额为："+sum);

    }
    public static void array2Test3() {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //这个n的数据来自于键盘录入。
        System.out.println("请输入一个数据：");
        int n = sc.nextInt();

        //定义二维数组
        int[][] arr = new int[n][n];

        //给这个二维数组任何一行的第一列和最后一列赋值为1
        for(int i=0;i<n;i++){
            arr[i][0]=1;
            System.out.print(arr[i][0]+"\t");
            if(i>0){
                for (int j=1;j<i;j++){
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                    System.out.print(arr[i][j]+"\t");
                }
                arr[i][i]=1;
                System.out.print(arr[i][i]+"\t");
            }
            System.out.println();
        }

    }
    public static void array2Demo() {
            //定义一个二维数组
            int[][] arr = new int[3][2];
            //定义了一个二维数组arr
            //这个二维数组有3个一维数组的元素
            //每一个一维数组有2个元素
            //输出二维数组名称
            System.out.println(arr); //地址值	[[I@4554617c
            //输出二维数组的第一个元素一维数组的名称
            System.out.println(arr[0]); //地址值	[I@74a14482
            System.out.println(arr[1]); //地址值	[I@1540e19d
            System.out.println(arr[2]); //地址值	[I@677327b6
            //输出二维数组的元素
            System.out.println(arr[0][0]); //0
            System.out.println(arr[0][1]); //0
    }

    public static void main(String[] args) {
        array2Demo();
    }

}
