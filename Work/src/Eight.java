/**
 * @author procedure sail
 * @date 2021/10/5 21:16
 *
 *          1.5 完数:⼀个数如果恰好等于它的因⼦之和，这个数就称为"完数"。
 *          题⽬：第一个完全数是6，它有约数1、2、3、6，除去它本身6外，其余3个数相加，1+2+3=6.
 *          编程找出1000以内的所有完数
 *          第一个完全数是6，第二个完全数是28，第三个完全数是496，后面的完全数还有8128、33550336等等
 */
public class Eight {
    public static void main(String[] args) {

        for (int i = 1; i <=1000; i++) {
            int sum=0;
            //完全数除以自己一半，求余肯定会大于0，所以用i/2
            for (int j = 1; j <=i/2 ; j++) {
              if (i%j==0){
                  sum += j;
              }
            }
            if (sum==i){
                System.out.println(sum);
            }

        }

    }
}
