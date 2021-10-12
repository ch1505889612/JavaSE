/**
 * @author procedure sail
 * @date 2021/9/27 11:34
 *      求1-100相加的数的和
 *
 *
 */
public class LoopTest01 {

    public static void main(String[] args) {

        //1.设置一个变量,在程序运行时候改变其值
        int num=1;

        //2.设置一个变量,存储num相加的值
        int sum=0;

        while (num<=100){
            sum+=num;
            //3.改变其变量的值,使其循环一次+1;
            num++;
        }
        System.out.println(sum);

        error1();

    }

    /**
     * 常见错误问题
     */
    public static void error1(){
        //1.设置一个变量,在程序运行时候改变其值
        int num=1;

        //2.设置一个变量,存储num相加的值
        int sum=0;
        //3.当while中的表达式值为true时,该循环为死循环(死循环某些特定场合下是好的)
//        while (true){
//             sum+=num;
//             num++;
//        }

        //4.两个编译报错
//        while (1==1){
//            sum +=num;
//            num++;
//        }

        boolean flag=true;
        while (flag){
            sum+=num;
            num++;
        }
    }
}
