import java.util.Scanner;

/**
 * @author procedure sail
 * @date 2021/10/5 22:15
 *
  *            1582年以来的置闰规则：
 *             普通闰年：公历年份是4的倍数，且不是100的倍数的，为闰年（如2004年、2020年等就是闰年）。
 *             世纪闰年：公历年份是整百数的，必须是400的倍数才是闰年（如1900年不是闰年，2000年是闰年）。
 *
 *          1.8 年份判定
 *          题⽬：输⼊某年某⽉某⽇，判断这⼀天是这⼀年的第⼏天？
 *          程序分析：以3⽉5⽇为例，应该先把前两个⽉的加起来，然后再加上5天即本年的第⼏天，特殊情况，闰年且输⼊⽉份
 *          ⼤于3时需考虑多加⼀天
 */
public class Eleven {
    public static void main(String[] args) {
        //1.先判断该年是否是闰年
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当前年份");
        int year = scanner.nextInt();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入天");
        int day = scanner.nextInt();
        if (year%4==0 && year%100!=0||year/400==0){
            String s = leapYear(year, month, day);
            System.out.println(s);
        }else {
            String s = flatYear(year, month, day);
            System.out.println(s);
        }
    }

    /**
     *闰年计算法
     */
     public static  String leapYear(int year,int month,int day){
         int sumDay=0;
         int[] arrs2=new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
         for (int i = 0; i <arrs2.length; i++) {
             if (i<month){
                 if (i==month-1 && day<=arrs2[i]){
                     sumDay+=day;
                     return  "这是"+year+"年"+month+"月"+day+"日"+"这是今年的第"+sumDay+"天"+"该年是润年";
                 }
                 sumDay+=arrs2[i];
             }
         }
         return null;
     }

    /**
     *平年计算法
     */

    public static String flatYear(int year,int month,int day){
        int sumDay = 0;
        int[] arrs1 = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < arrs1.length; i++) {
            if (i < month) {
                if (i == month - 1 && day <= arrs1[i]) {
                    sumDay += day;
                    return "这是" + year + "年" + month + "月" + day + "日" + "这是今年的第" + sumDay + "天" + "该年是平年";
                }
                sumDay += arrs1[i];
            }
        }
        return null;
    }
}
