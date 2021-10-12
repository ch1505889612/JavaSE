import java.util.Scanner;

/**
 * @author procedure sail
 * @date 2021/9/26 12:29
 */
public class Three {
    public static void main(String[] args) {
        //one();
        //two();
        three();
    }

    /**
    生成一个随机数分数，判定该分数可以领到的奖项：150(奖励XXX变装一次) 140~149 (炸鸡一
     盒) 。。。。 。。。。。60一下（男女混合双打）。
     */
    public static void one(){
      //1.先生成一个随机数
       int score= (int)(Math.random()*151);
        System.out.println(score);
        //2.判断当前条件是否满足
       if (score==150){
           System.out.println("奖励一套房");
       }else if(score>=140&&score<150){
           System.out.println("一辆车");
       }else if (score>60&&score<140){
           System.out.println("男女混合双打");
       }else {
           System.out.println("加油加油,下次争取没有你");
       }
    }


    /**
     *  猜数游戏(如果所猜的数字和正确数字相差2左右可以再猜一次
     */
    public static void two(){
        System.out.println("请输入你要猜的数,数的范围为[10,20]");

         int count=1;
        //5.进行条件运算
        while (true){
            //1.生成控制输出语句
            Scanner scanner = new Scanner(System.in);
            //2.用一个变量接收控制台输出的整数
            int nextInt = scanner.nextInt();
            //3.生成一个随机数,设置区间为[10,20]
            int num=(int)(Math.random()*21+10);
//            System.out.println(nextInt+"-----");
//            System.out.println(num+"-----");
            //4.  |正确的数字-所猜的数字|
            int n=num-nextInt;
            int abS=(int)(Math.abs(n));
            if (abS==2){
                System.out.println("猜对了");
                break;
            }else{
               if (count==2){
                   break;
               }
                count++;
                System.out.println("你还有一次机会请继续输入");
            }
        }
    }

    /**
     * 计算用户输入的一个数字对应的二进制中1的个数
     */
    public static void three(){
        System.out.println("请输入一个数");
        //1.获取控制台输出的值
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        //2.统计用户输入的数字对应的二进制中1的个数
        int count=0;
        while (nextInt!=0){
           if ((nextInt&1)==1){
              count++;
           }
           //把输出的值往右推移一位
           nextInt=nextInt>>1;
        }
        System.out.println(count);
    }
}
