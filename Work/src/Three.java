/**
 * @author procedure sail
 * @date 2021/10/5 14:59
 *     斐波那契数列指的是这样一个数列 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
 *        第一步:递归头第一项1,第二项1
 *        第二步:递归体:
 */
public class Three {
    public static void main(String[] args) {
        int fib = fib(40, 1, 1);
        System.out.println(fib);
    }

    public static int fib(int n,int first,int second){
        if (n<=1){
            return first;
        }
        return fib(n-1,second,first+second);
    }
}
