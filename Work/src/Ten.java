/**
 * @author procedure sail
 * @date 2021/10/5 22:07
 *       1.7 不重复数字
 *       题⽬：有1、2、3、4个数字，能组成多少个互不相同且⽆重复数字的三位数？都是多少？
 *       程序分析：可填在百位、⼗位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满⾜条件的排列。
 *
 */
public class Ten {
    public static void main(String[] args) {

        int count=0;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                for (int k = 1; k <=4 ; k++) {
                    if (i!=j&&j!=k&&i!=k){
                        System.out.println(i+""+j+""+k);
                        count++;
                    }
                }
            }
        }
        System.out.println("可以组成"+count+"种");
    }
}
