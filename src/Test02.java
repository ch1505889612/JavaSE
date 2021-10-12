/**
 * @author procedure sail
 * @date 2021/9/26 21:01
 */
public class Test02 {
    public static void main(String[] args) {
        // 测试使用按位异或^
        int num = 4^5;
        System.out.println(num);
        int num1 = 10;
        int num2 = 20;

// 使用异或
        num1 = num1^num2;
        System.out.println(num1);
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println(num1+"=="+num2);// 10 20
        System.out.println(2<<3);
        System.out.println(8>>1);
    }
}
