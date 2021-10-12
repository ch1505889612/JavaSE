/**
 * @author procedure sail
 * @date 2021/10/5 15:15
 *
 * 1.1 兔⼦问题
 * 题⽬：古典问题：有⼀对兔⼦，从出⽣后第3个⽉起每个⽉都⽣⼀对兔⼦，⼩兔⼦⻓到第三个⽉后每个⽉⼜⽣⼀对兔⼦，
 * 假如兔⼦都不死，问每个⽉的兔⼦对数为多少？
 * 程序分析： 兔⼦的规律为数列1,1,2,3,5,8,13,21...
 */
public class Four {

    public static void main(String[] args) {
        /**
         * 递归再次改进，空间减少到O(1)，只存储3个数：前两个数和前两个数相加计算出来的结果，一直向前滚动
         */

        int n=4;
        int fib = fib(n);
        System.out.println("第"+n+"月,兔子的对数"+fib);
    }

    public static int fib(int n){
        int first=1,second=1,third=2;
        if (n==1||n==2){
            return 1;
        }
        for (int i = 3; i <=n ; i++) {
            third=first+second;
            first=second;
            second=third;
        }
        return third;
    }
}
