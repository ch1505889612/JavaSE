/**
 * @author procedure sail
 * @date 2021/10/5 15:22
 *
 *            1.2 素数问题
 *            题⽬：判断101-200之间有多少个素数，并输出所有素数。
 *            程序分析：判断素数的⽅法：⽤⼀个数分别去除2到sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数
 */
public class Five {
    public static void main(String[] args) {
        //用一个变量去存储101-200之间的素数数量
        int count=0;

        //1.循环101-200之间的数
        for (int i = 101; i <=200 ; i++) {
            //2.设置一个开关,判断该是否为素数,是的话就打印,默认为true;
            boolean flag=true;
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                // ⽤⼀个数分别去除2到sqrt(这个数)
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            //如果该数为素数就打印
            if (flag){
                count++;
                System.out.println("101-200之间的素数格式"+i);
            }
        }
        System.out.println(count);
    }
}
