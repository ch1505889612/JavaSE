import java.util.Scanner;

/**
 * @author procedure sail
 * @date 2021/10/5 15:29
 *          1.3 ⽔仙花数数。
 * 题⽬：打印出所有的"⽔仙花数"，所谓"⽔仙花数"是指⼀个三位数，其各位数字⽴⽅和等于该数本身。例如：153是⼀
 * 个"⽔仙花数"，因为153=1的三次⽅＋5的三次⽅＋3的三次⽅。
 * 程序分析：利⽤for循环控制100-999个数，每个数分解出个位，⼗位，百位
 */
public class Six {

    public static void main(String[] args) {
        int hasNextInt = isHasNextInt();
        System.out.println(hasNextInt);
    }

    /**
     * 打印100-999之间是水仙花的数字,
     */

    public static int isHasNextInt(){
        //1.存储水仙花个数
        int count=0;
        for (int i = 100; i <=999 ; i++) {
            int threeCubeSum = threeCubeSum(i);
            if (i==threeCubeSum){
                System.out.println(i+"是水仙花");
                count++;
            }
        }
        return count;
    }


    /**
     *   水仙花数分解后的立方值相加的和
     */
    public static int threeCubeSum(int i){
        int unit=i%10;
        int decade=i%100/10;
        int hundred=i/100;
        int  sum=unit*unit*unit+decade*decade*decade+hundred*hundred*hundred;
        return sum;
    }

}
