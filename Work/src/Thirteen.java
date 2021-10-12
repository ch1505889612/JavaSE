/**
 * @author procedure sail
 * @date 2021/10/6 13:34
 *
 *
 *          1.10 求阶乘
 *          1： 求20的阶乘
 *          2： 求1-20的阶乘之和
 *          程序分析：5!=5*4*3*2*1
 */
public class Thirteen {

    public static void main(String[] args) {
        long one = one(20);
        System.out.println(one);




        long sum=0;
        for (  int n=20; n>0; n--) {
            sum+=one(n);
        }
        System.out.println(sum);


//        long sum = 0;
//        for (int i = 1; i <= 20; i++) {
//            long c = 1;
//            for (int j = 1; j <= i; j++) {
//                c = c * j;
//            }
//            sum +=  c;
//        }
//        System.out.println(sum);
    }

    public static long one(int n){
        if (n==1){
            return 1;
        }else {
            return n*one(n-1);
        }
    }
}
