import java.util.Scanner;

/**
 * @author procedure sail
 * @date 2021/10/5 14:12
 *                       判断一个数是否为素数
 *         1.什么是素数:大于1的自然数中，除了1和它本身以外不再有其他因数。
 *         2.分析
 *            2.1第一步:接收用户输入的一个数
 *            2.2第二步:判断是否是合法的数
 *            2.3第三步与2-9之间的数相除来判断是否是素数
 */
public class One {

    public static void main(String[] args) {
        One one = new One();
        int hasNextInt = one.isHasNextInt();

        for (int i = 2; i <=hasNextInt ; i++) {
            boolean flag=true;
            for (int j = 2; j <Math.sqrt(i) ; j++) {
                if (i%j==0){
                    flag=false;
                    System.out.println("不是素数");
                    break;
                }
            }
            if (flag){
                System.out.println("是素数");
                break;

            }
        }

    }


    public int isHasNextInt(){
        //1.接收一个用户输入的数
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()){
            return -1;
        }
        int nextInt = scanner.nextInt();
        return nextInt;
    }
}
