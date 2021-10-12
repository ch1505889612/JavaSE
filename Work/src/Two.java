/**
 * @author procedure sail
 * @date 2021/10/5 14:44
 *       判断 1-100 之间有多少个素数并输出所有素数。
 *         第一步:直接从二开始计数
 *         第二步:设置一个boolean类型的开关,如果该数为素数的话则为true,默认为false
 *         第三步:利用平方根快速的求值
 */
public class Two {


    public static void main(String[] args) {

        //定义一个变量统计素数数量
        int count=0;

        //1.循环遍历1-100之间的数
        for (int i = 2; i <100 ; i++) {
            //2.设置一个开关
            boolean flag=true;
            //3.利用平方根进行比较
            for (int j = 2; j <=Math.sqrt(i) ; j++) {
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                count++;
                System.out.println(i);
            }

        }
        System.out.println("1-100素数的个数"+count);
    }
}
