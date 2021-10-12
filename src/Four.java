import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author procedure sail
 * @date 2021/9/27 12:57
 */ 
public class Four {
    public static void main(String[] args) {
        //打印九九乘法表
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j <i+1 ; j++) {
//                System.out.print("i*j="+(i*j)+"\t");
//            }
//            System.out.println("");
//        }

//        for (int i = 1; i <10 ; i++) {
//            for (int j = 1;j<10-i+1;j++) {
//                System.out.print("i*j="+(i*j)+"\t");
//            }
//            System.out.println("");
//        }


        //打印菱形上半部分
//        for (int i = 1; i <=7 ; i+=2) {
//            for (int m = 1; m <7-i; m++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i ; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println("");
//        }


        //打印菱形的下半部分
//        for (int i = 1; i <=7 ; i+=2) {
//            for (int m = 1; m <i; m++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=7-i+1 ; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println("");
//        }

        test02();
        //test01();
       // System.out.println(12345%10);
       // test02();

      //  Long aLong = test03(51);
       // System.out.println(aLong);

        //4.设置一个水仙花数
//        int num=153;
//        int i = test04(num);
//        if (num==i){
//            System.out.println(i+"是水仙花数");
//        }else {
//            System.out.println(i+"不是水仙花数");
//        }


        //long i = test03(51);
        //System.out.println(i);
       // test05();
        //System.out.println("a"+'\t');
    }


    /**
     * 1: 计算一个数对应的二进制中1的个数。 (要求高效)
     */
    public static void test01(){
        //1.new一个控制台输出语句Scanner()
        Scanner scanner = new Scanner(System.in);
        //2.用一个变量接收控制台输出语句
        int nextInt = scanner.nextInt();
        //3.用一个变量统计输入值的二进制中1的个数
        int count=0;

        //4.设置一个boolean值判断当前是否为正数还是负数
        boolean flag=true;
        //5.flag为false的话为负数
        if (nextInt<0){
            flag=false;
            nextInt=nextInt^-1;
        }

        while (nextInt!=0){
            if (nextInt%2 != 0) {
                count ++;
            }
            nextInt=nextInt>>1;
        }

        if (!flag) {
            count = 32 - count;
        }
        System.out.println(nextInt+"的二进制1的个数"+count);
    }


    /**
     * 2: 计算用户输入的一个数字 倒叙输出 12345->54321
     */
    public static void test02(){
        //1.new一个控制台输出语句
        Scanner scanner = new Scanner(System.in);
        //2.用一个变量接收控制台输出语句
        int nextInt = scanner.nextInt();

        //3.判断是否为负数
        boolean flag=true;
        String b="";
        while (nextInt!=0){
          int a=nextInt%10;
           b+=a;
           nextInt= nextInt/10;
        }
        System.out.println(b);
    }


    /**
     * 3.计算斐波那契数列中第22、45、50项的值。
     * 第一项0,第二项1,第三项开始就是前两项的和,往后都是跟第三项一样的格式
     */

    public static Long test03(int n){
        //1.定义一个变量存储第22,45,50项的值
        long sum=0L;
        //2.设置前两项的值
        long a=0L,b=1L,c=0L;
        if (n<0){
            return sum=-1L;
        }
        else if (n==1||n==2) {
            return sum = 1L;
        }else {
            for (int i = 3; i <=n ; i++) {
                c = a + b;
                a = b;
                b = c;
               // System.out.println(c);
                if (i==22||i==45||i==50){
                    sum +=c;
                }
            }
            return sum;
        }

    }


    /**
     * 4.计算100到100000000之间水仙花数
     */

    public static int test04(int num){
         // 定义一个变量接收num的值
         int count=0;
        //1.循环遍历num
         while (true){
             if (num==0){
                 break;
             }
             count+=(num%10)*(num%10)*(num%10);
             num=num/10;
         }
         return count;
    }


    /**
     * 5.计算100到100000000之间有哪些素数，5个一行输出 (要求高效)
     *
     *质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数；否则称为合数（规定1既不是质数也不是合数）。
     *
     */

    public static void test05(){
        for (int i = 100; i <=100000000 ; i++) {
            for (int j = 100; j <=i ; j++) {
                if (i==2||j==i-1){
                    for (int k = 0; k <5 ; k++) {
                        System.out.print(i+"\t");
                    }
                    System.out.println();
                }
                if (i%j==0){
                   break;
                }
            }
        }
    }

}
