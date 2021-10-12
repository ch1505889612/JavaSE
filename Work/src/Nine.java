/**
 * @author procedure sail
 * @date 2021/10/5 21:45
 *
 *      1.6 弹弹⼩球
 *      题⽬：⼀球从100⽶⾼度⾃由落下，每次落地后反跳回原⾼度的⼀半；再落下，求它在 第10次落地时，共经过多少⽶？
 *      第10次反弹多⾼？
 *       规律:100,50,25,12.5...
 *       经过的距离:100,200,250,275,
 */
public class Nine {
    public static void main(String[] args) {
        //1.定义一个变量存储该球经过了多少米
        double sum=0;
        //2.设置球从多高处下落
        double ballHeight=100;
        for (int i = 0; i <10 ; i++) {
           if (i==0){
               sum=ballHeight;
           }
           if (i>=1){
               ballHeight= ballHeight/2;
               sum+=ballHeight*2;
           }
            if (i==9){
                System.out.println("第10次反弹多⾼"+ballHeight+"米");
            }

        }
        System.out.println("在第10次落地时，共经过多少⽶"+sum+"米");
    }
}
